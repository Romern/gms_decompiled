package p000;

import android.os.Build;
import android.security.keystore.KeyExpiredException;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyPermanentlyInvalidatedException;
import android.util.Base64;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.ProviderException;
import java.security.Signature;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.spec.ECGenParameterSpec;
import java.util.Arrays;

/* renamed from: egx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class egx {
    /* renamed from: a */
    public static final KeyPair m10383a(byte[] bArr, boolean z, byte[] bArr2, boolean z2, boolean z3, int i) {
        try {
            KeyPairGenerator instance = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
            KeyGenParameterSpec.Builder attestationChallenge = new KeyGenParameterSpec.Builder(m10390e(bArr), 4).setDigests("SHA-256").setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1")).setAttestationChallenge(m10389d(bArr2));
            int i2 = Build.VERSION.SDK_INT;
            attestationChallenge.setIsStrongBoxBacked(z).setUserPresenceRequired(z2);
            attestationChallenge.setUserAuthenticationRequired(z3);
            attestationChallenge.setUserAuthenticationValidityDurationSeconds(i);
            attestationChallenge.setInvalidatedByBiometricEnrollment(false);
            instance.initialize(attestationChallenge.build());
            return instance.generateKeyPair();
        } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException | ProviderException e) {
            throw new ehf(ehh.CLIENT_INTERNAL_ERROR, "Failed to generate Key Store key.", e);
        }
    }

    /* renamed from: b */
    public static final KeyStore.Entry m10387b(byte[] bArr) {
        try {
            KeyStore a = m10384a();
            String e = m10390e(bArr);
            KeyStore.Entry entry = a.getEntry(e, null);
            if (entry != null) {
                return entry;
            }
            String valueOf = String.valueOf(e);
            throw new ehf(valueOf.length() == 0 ? new String("Key does not exist in Android KeyStore: ") : "Key does not exist in Android KeyStore: ".concat(valueOf), ehh.CLIENT_INTERNAL_ERROR);
        } catch (RuntimeException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException e2) {
            throw new ehf(ehh.CLIENT_INTERNAL_ERROR, "Error retrieving Android KeyStore entry", e2);
        }
    }

    /* renamed from: c */
    public static final byte[] m10388c(byte[] bArr) {
        try {
            return CertificateFactory.getInstance("X.509").generateCertPath(Arrays.asList(((KeyStore.PrivateKeyEntry) m10387b(bArr)).getCertificateChain())).getEncoded("PkiPath");
        } catch (CertificateException e) {
            throw new ehf(ehh.CLIENT_INTERNAL_ERROR, "Error getting certificate chain.", e);
        }
    }

    /* renamed from: d */
    private static byte[] m10389d(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA-256").digest(bArr);
        } catch (NoSuchAlgorithmException e) {
            throw e;
        }
    }

    /* renamed from: e */
    private static String m10390e(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    /* renamed from: a */
    private static KeyStore m10384a() {
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load(null);
            return instance;
        } catch (IOException | RuntimeException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            throw new ehf(ehh.CLIENT_INTERNAL_ERROR, "Unable to access Android KeyStore.", e);
        }
    }

    /* renamed from: a */
    public static final void m10385a(byte[] bArr) {
        try {
            m10384a().deleteEntry(m10390e(bArr));
        } catch (RuntimeException | KeyStoreException e) {
            throw new ehf(ehh.CLIENT_INTERNAL_ERROR, "Error deleting Android KeyStore key", e);
        }
    }

    /* renamed from: a */
    public static boolean m10386a(KeyStore.Entry entry) {
        try {
            Signature.getInstance("SHA256withECDSA").initSign(((KeyStore.PrivateKeyEntry) entry).getPrivateKey());
            return false;
        } catch (NoSuchAlgorithmException e) {
            throw new ehf(ehh.CLIENT_INTERNAL_ERROR, "Error initializing signature", e);
        } catch (InvalidKeyException e2) {
            if ((e2 instanceof KeyPermanentlyInvalidatedException) || (e2 instanceof KeyExpiredException)) {
                return true;
            }
            return false;
        }
    }
}
