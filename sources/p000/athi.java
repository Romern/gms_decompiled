package p000;

import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyInfo;
import android.util.Pair;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.ProviderException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.GCMParameterSpec;

/* renamed from: athi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class athi {

    /* renamed from: a */
    private static final srn f90369a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    private static final boolean f90370b = true;

    /* renamed from: a */
    private static SecretKey m75888a(String str) {
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load(null);
            try {
                if (instance.containsAlias(str)) {
                    return m75889a((SecretKey) instance.getKey(str, null));
                }
            } catch (NullPointerException e) {
            }
            KeyGenerator instance2 = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            instance2.init(new KeyGenParameterSpec.Builder(str, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setUserAuthenticationRequired(f90370b).setUserAuthenticationValidityDurationSeconds(3600).build());
            return m75889a(instance2.generateKey());
        } catch (IOException | GeneralSecurityException | ProviderException e2) {
            bnsl bnsl = (bnsl) f90369a.mo68387b();
            bnsl.mo68437a(e2);
            bnsl.mo68432a("athi", "a", 122, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("getOrCreateKeyInSecureHardware error");
            return null;
        }
    }

    /* renamed from: a */
    private static SecretKey m75889a(SecretKey secretKey) {
        if (!((KeyInfo) SecretKeyFactory.getInstance(secretKey.getAlgorithm(), "AndroidKeyStore").getKeySpec(secretKey, KeyInfo.class)).isInsideSecureHardware()) {
            return null;
        }
        return secretKey;
    }

    /* renamed from: a */
    public final Pair mo49988a(String str, byte[] bArr) {
        SecretKey a = m75888a(str);
        if (a == null) {
            return null;
        }
        try {
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            instance.init(1, a);
            return Pair.create(instance.doFinal(bArr), instance.getIV());
        } catch (GeneralSecurityException e) {
            bnsl bnsl = (bnsl) f90369a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("athi", "a", 60, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Encryption error");
            return null;
        }
    }

    /* renamed from: a */
    public final byte[] mo49989a(String str, byte[] bArr, byte[] bArr2) {
        SecretKey a = m75888a(str);
        if (a == null) {
            return null;
        }
        try {
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            instance.init(2, a, new GCMParameterSpec(128, bArr2));
            return instance.doFinal(bArr);
        } catch (GeneralSecurityException e) {
            bnsl bnsl = (bnsl) f90369a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("athi", "a", 89, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Decryption error");
            return null;
        }
    }
}
