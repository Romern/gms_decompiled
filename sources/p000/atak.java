package p000;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyInfo;
import android.security.keystore.KeyPermanentlyInvalidatedException;
import android.security.keystore.UserNotAuthenticatedException;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.felicanetworks.sdu.ErrorInfo;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.ProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;

/* renamed from: atak */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atak {

    /* renamed from: a */
    private static final srn f89953a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, java.lang.String, int]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, int):void */
    /* renamed from: a */
    public static SecretKey m75286a(String str, int i, boolean z) {
        try {
            SecretKey b = m75289b(str, i, z);
            if (b != null) {
                return b;
            }
            KeyGenerator instance = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            KeyGenParameterSpec.Builder userAuthenticationValidityDurationSeconds = new KeyGenParameterSpec.Builder(str, 1).setBlockModes("CBC").setEncryptionPaddings("PKCS7Padding").setUserAuthenticationRequired(true).setUserAuthenticationValidityDurationSeconds(i);
            if (z) {
                int i2 = Build.VERSION.SDK_INT;
                userAuthenticationValidityDurationSeconds.setUserAuthenticationValidWhileOnBody(true);
            }
            instance.init(userAuthenticationValidityDurationSeconds.build());
            SecretKey generateKey = instance.generateKey();
            bnsl a = f89953a.mo26019b(aske.m74275a());
            a.mo68432a("atak", "a", 191, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            a.mo68422a("added key %s, expiry time %s", (Object) str, i);
            return generateKey;
        } catch (NullPointerException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | ProviderException e) {
            bnsl a2 = f89953a.mo26019b(aske.m74275a());
            a2.mo68432a("atak", "a", (int) ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            a2.mo68420a("Unable to create key: %s", e.getMessage());
            return null;
        }
    }

    /* renamed from: b */
    private static SecretKey m75289b(String str, int i, boolean z) {
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load(null);
            SecretKey secretKey = (SecretKey) instance.getKey(str, null);
            if (secretKey == null) {
                return null;
            }
            KeyInfo keyInfo = (KeyInfo) SecretKeyFactory.getInstance("AES", "AndroidKeyStore").getKeySpec(secretKey, KeyInfo.class);
            if (z || keyInfo.getUserAuthenticationValidityDurationSeconds() == i) {
                return secretKey;
            }
            bnsl bnsl = (bnsl) f89953a.mo68388c();
            bnsl.mo68432a("atak", "b", 225, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Existing key has different expiration. Will regenerate.");
            return null;
        } catch (IOException | UnrecoverableKeyException | CertificateException e) {
            bnsl bnsl2 = (bnsl) f89953a.mo68388c();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("atak", "b", 227, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Wrong key. Will recreate");
        } catch (InvalidKeySpecException e2) {
            bnsl bnsl3 = (bnsl) f89953a.mo68387b();
            bnsl3.mo68437a(e2);
            bnsl3.mo68432a("atak", "b", 229, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Unable to retrieve a key");
        }
    }

    /* renamed from: c */
    private static SecretKey m75291c(String str) {
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load(null);
            return (SecretKey) instance.getKey(str, null);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableKeyException | CertificateException e) {
            bnsl a = f89953a.mo26019b(aske.m74275a());
            a.mo68437a(e);
            a.mo68432a("atak", "c", (int) MfiClientException.TYPE_ILLEGAL_CARD_OPERATION, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            a.mo68405a("Unable to get keyguard key");
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m75290b(String str) {
        SecretKey c = m75291c(str);
        if (c != null) {
            return m75288a(c);
        }
        throw new ataf();
    }

    /* renamed from: a */
    public static void m75287a(String str) {
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load(null);
            instance.deleteEntry(str);
        } catch (IOException | NullPointerException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            bnsl bnsl = (bnsl) f89953a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("atak", "a", 70, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unable to delete keyguard key");
        }
    }

    /* renamed from: a */
    public static boolean m75288a(SecretKey secretKey) {
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS7Padding");
            instance.init(1, secretKey);
            instance.doFinal();
            return true;
        } catch (UserNotAuthenticatedException e) {
            return false;
        } catch (NoSuchAlgorithmException | ProviderException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e2) {
            throw new atag(e2);
        } catch (KeyPermanentlyInvalidatedException e3) {
            throw new atag(e3);
        } catch (InvalidKeyException e4) {
            Throwable cause = e4.getCause();
            if (cause != null && cause.getClass().getSimpleName().equals("KeyStoreException")) {
                try {
                    Object invoke = cause.getClass().getMethod("getErrorCode", new Class[0]).invoke(cause, new Object[0]);
                    if ((invoke instanceof Integer) && ((Integer) invoke).intValue() == -16) {
                        return false;
                    }
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e5) {
                }
            }
            throw new ataf(e4);
        }
    }
}
