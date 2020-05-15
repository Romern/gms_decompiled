package p000;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Base64;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: akms */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akms extends akmx {

    /* renamed from: a */
    final bytm f72273a;

    /* renamed from: b */
    private final SecureRandom f72274b = new SecureRandom();

    public akms() {
        SecretKey secretKey;
        SecretKey secretKey2;
        byte[] bArr;
        byte[] bArr2;
        int i = Build.VERSION.SDK_INT;
        if (cfpd.m142369i()) {
            secretKey = m60026c("gms.netrec.AESKey");
            if (secretKey == null) {
                eoa.m10826b("NetRec", "Generating AES key", new Object[0]);
                KeyGenerator instance = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                instance.init(new KeyGenParameterSpec.Builder("gms.netrec.AESKey", 3).setBlockModes("CTR").setEncryptionPaddings("NoPadding").setRandomizedEncryptionRequired(false).setUserAuthenticationRequired(false).build());
                secretKey = instance.generateKey();
            }
        } else {
            String str = (String) akka.f72129d.mo10351a();
            if (!TextUtils.isEmpty(str)) {
                bArr2 = Base64.decode(str, 2);
            } else {
                eoa.m10826b("NetRec", "Generating AES key", new Object[0]);
                bArr2 = new byte[16];
                this.f72274b.nextBytes(bArr2);
                akka.f72129d.mo10352a(Base64.encodeToString(bArr2, 2));
            }
            secretKey = new SecretKeySpec(bArr2, "AES");
        }
        int i2 = Build.VERSION.SDK_INT;
        if (cfpd.m142369i()) {
            secretKey2 = m60026c("gms.netrec.HMACKey_v2");
            if (secretKey2 == null) {
                eoa.m10826b("NetRec", "Generating HMAC key", new Object[0]);
                KeyGenerator instance2 = KeyGenerator.getInstance("HmacSHA1", "AndroidKeyStore");
                instance2.init(new KeyGenParameterSpec.Builder("gms.netrec.HMACKey_v2", 12).setRandomizedEncryptionRequired(false).setUserAuthenticationRequired(false).build());
                secretKey2 = instance2.generateKey();
            }
        } else {
            String str2 = (String) akka.f72128c.mo10351a();
            if (!TextUtils.isEmpty(str2)) {
                bArr = Base64.decode(str2, 2);
            } else {
                eoa.m10826b("NetRec", "Generating HMAC key", new Object[0]);
                bArr = new byte[16];
                this.f72274b.nextBytes(bArr);
                akka.f72128c.mo10352a(Base64.encodeToString(bArr, 2));
            }
            secretKey2 = new SecretKeySpec(bArr, "HmacSHA1");
        }
        this.f72273a = new bytm(secretKey, secretKey2);
    }

    /* renamed from: c */
    private static SecretKey m60026c(String str) {
        KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
        try {
            instance.load(null);
            if (instance.containsAlias(str)) {
                return (SecretKey) instance.getKey(str, null);
            }
            return null;
        } catch (IOException e) {
            throw new GeneralSecurityException("Error loading keystore", e);
        }
    }

    /* renamed from: a */
    public final String mo39561a() {
        return "standard";
    }

    /* renamed from: b */
    public final String mo39563b(String str) {
        sdo.m34975b(!TextUtils.isEmpty(str), "String cannot be empty");
        byte[] decode = Base64.decode(str, 2);
        try {
            bytm bytm = this.f72273a;
            int length = decode.length;
            if (length >= 8) {
                byte[] copyOf = Arrays.copyOf(decode, 8);
                byte[] doFinal = bytm.mo74503a(2, copyOf).doFinal(decode, 8, length - 8);
                if (MessageDigest.isEqual(copyOf, bytm.mo74505b(doFinal))) {
                    return new String(doFinal);
                }
                throw new GeneralSecurityException("Digest not verified");
            }
            throw new IllegalArgumentException("Message too short to contain an IV");
        } catch (RuntimeException e) {
            if (e.getCause() instanceof GeneralSecurityException) {
                throw ((GeneralSecurityException) e.getCause());
            }
            throw e;
        }
    }

    /* renamed from: a */
    public final String mo39562a(String str) {
        sdo.m34975b(!TextUtils.isEmpty(str), "String cannot be empty");
        try {
            return Base64.encodeToString(this.f72273a.mo74504a(str.getBytes(StandardCharsets.UTF_8)), 2);
        } catch (RuntimeException e) {
            if (e.getCause() instanceof GeneralSecurityException) {
                throw ((GeneralSecurityException) e.getCause());
            }
            throw e;
        }
    }
}
