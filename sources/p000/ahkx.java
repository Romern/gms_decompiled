package p000;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.mfc.mfi.MfiClientException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.ProviderException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import javax.security.auth.x500.X500Principal;

/* renamed from: ahkx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahkx {

    /* renamed from: a */
    public final ahkw f67411a = new ahkw();

    /* renamed from: b */
    private final SecureRandom f67412b = new SecureRandom();

    /* renamed from: a */
    private final byte[] m56077a() {
        byte[] bArr = new byte[72];
        this.f67412b.nextBytes(bArr);
        return bArr;
    }

    /* renamed from: c */
    private static String m56078c(String str) {
        return String.format("%s.%s", "nearby.connections", str);
    }

    /* renamed from: b */
    public final void mo36753b(String str) {
        try {
            ahkw ahkw = this.f67411a;
            String c = m56078c(str);
            KeyStore keyStore = ahkw.f67410a;
            if (keyStore == null) {
                throw new KeyStoreException("No AndroidKeyStore found on device.");
            } else if (keyStore.containsAlias(c)) {
                ahkw.f67410a.deleteEntry(c);
            }
        } catch (KeyStoreException e) {
            bnsl bnsl = (bnsl) ahkm.f67363a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("ahkx", "b", 263, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Failed to delete key store entry %s", str);
        }
    }

    /* renamed from: a */
    public final boolean mo36750a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (!cfnv.m140801y()) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        try {
            KeyFactory instance = KeyFactory.getInstance("EC");
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(bArr);
            try {
                PublicKey generatePublic = instance.generatePublic(x509EncodedKeySpec);
                try {
                    Signature instance2 = Signature.getInstance("SHA256withECDSA");
                    try {
                        instance2.initVerify(generatePublic);
                        try {
                            instance2.update(bArr2);
                            return instance2.verify(bArr3);
                        } catch (SignatureException e) {
                            bnsl bnsl = (bnsl) ahkm.f67363a.mo68388c();
                            bnsl.mo68437a(e);
                            bnsl.mo68432a("ahkx", "a", 254, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl.mo68405a("Failed to verify bytes with paired key.");
                            return false;
                        }
                    } catch (InvalidKeyException e2) {
                        bnsl bnsl2 = (bnsl) ahkm.f67363a.mo68388c();
                        bnsl2.mo68437a(e2);
                        bnsl2.mo68432a("ahkx", "a", 246, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68405a("Failed to verify bytes with paired key.");
                        return false;
                    }
                } catch (NoSuchAlgorithmException e3) {
                    bnsl bnsl3 = (bnsl) ahkm.f67363a.mo68388c();
                    bnsl3.mo68437a(e3);
                    bnsl3.mo68432a("ahkx", "a", 238, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68420a("Failed to verify bytes with paired key: %s", "SHA256withECDSA");
                    return false;
                }
            } catch (InvalidKeySpecException e4) {
                bnsl bnsl4 = (bnsl) ahkm.f67363a.mo68388c();
                bnsl4.mo68437a(e4);
                bnsl4.mo68432a("ahkx", "a", 229, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68420a("Failed to verify bytes with paired key: %s", x509EncodedKeySpec.getFormat());
                return false;
            }
        } catch (NoSuchAlgorithmException e5) {
            bnsl bnsl5 = (bnsl) ahkm.f67363a.mo68388c();
            bnsl5.mo68437a(e5);
            bnsl5.mo68432a("ahkx", "a", (int) BaseMfiEventCallback.TYPE_OPSRV_REQUIRED_LIB_UNAVAILABLE, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl5.mo68420a("Failed to verify bytes with paired key: %s", "EC");
            return false;
        }
    }

    /* renamed from: a */
    public final byte[] mo36751a(String str) {
        if (!cfnv.m140801y()) {
            return null;
        }
        int i = Build.VERSION.SDK_INT;
        String c = m56078c(str);
        try {
            Certificate a = this.f67411a.mo36748a(c);
            if (a != null) {
                return a.getPublicKey().getEncoded();
            }
            try {
                KeyPairGenerator instance = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
                try {
                    instance.initialize(new KeyGenParameterSpec.Builder(c, 12).setDigests("SHA-256").setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1")).setCertificateSubject(new X500Principal("O=Google, OU=Android, C=US")).setRandomizedEncryptionRequired(false).build());
                    try {
                        instance.generateKeyPair();
                        srn srn = ahkm.f67363a;
                        try {
                            return this.f67411a.mo36748a(c).getPublicKey().getEncoded();
                        } catch (KeyStoreException e) {
                            bnsl bnsl = (bnsl) ahkm.f67363a.mo68388c();
                            bnsl.mo68437a(e);
                            bnsl.mo68432a("ahkx", "a", 130, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl.mo68405a("Failed to create paired key.");
                            return null;
                        }
                    } catch (ProviderException e2) {
                        bnsl bnsl2 = (bnsl) ahkm.f67363a.mo68388c();
                        bnsl2.mo68437a(e2);
                        bnsl2.mo68432a("ahkx", "a", 122, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68405a("Failed to create paired key.");
                        return null;
                    }
                } catch (InvalidAlgorithmParameterException e3) {
                    bnsl bnsl3 = (bnsl) ahkm.f67363a.mo68388c();
                    bnsl3.mo68437a(e3);
                    bnsl3.mo68432a("ahkx", "a", 115, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68405a("Failed to create paired key.");
                    return null;
                }
            } catch (NoSuchAlgorithmException | NoSuchProviderException e4) {
                bnsl bnsl4 = (bnsl) ahkm.f67363a.mo68388c();
                bnsl4.mo68437a(e4);
                bnsl4.mo68432a("ahkx", "a", 101, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68405a("Failed to create paired key.");
                return null;
            }
        } catch (KeyStoreException e5) {
            bnsl bnsl5 = (bnsl) ahkm.f67363a.mo68388c();
            bnsl5.mo68437a(e5);
            bnsl5.mo68432a("ahkx", "a", 92, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl5.mo68405a("Failed to create paired key.");
            return null;
        }
    }

    /* renamed from: a */
    public final byte[] mo36752a(String str, byte[] bArr) {
        if (!cfnv.m140801y()) {
            return m56077a();
        }
        int i = Build.VERSION.SDK_INT;
        try {
            String c = m56078c(str);
            KeyStore keyStore = this.f67411a.f67410a;
            if (keyStore != null) {
                PrivateKey privateKey = (PrivateKey) keyStore.getKey(c, null);
                X509Certificate x509Certificate = (X509Certificate) this.f67411a.mo36748a(c);
                if (privateKey == null) {
                    bnsl bnsl = (bnsl) ahkm.f67363a.mo68388c();
                    bnsl.mo68432a("ahkx", "a", 164, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("No private key is available. Failed to sign with paired key.");
                    return m56077a();
                }
                if (!(x509Certificate == null || x509Certificate.getPublicKey() == null)) {
                    srn srn = ahkm.f67363a;
                    Arrays.toString(x509Certificate.getPublicKey().getEncoded());
                }
                try {
                    Signature instance = Signature.getInstance("SHA256withECDSA");
                    try {
                        instance.initSign(privateKey);
                        try {
                            instance.update(bArr);
                            return instance.sign();
                        } catch (SignatureException e) {
                            bnsl bnsl2 = (bnsl) ahkm.f67363a.mo68388c();
                            bnsl2.mo68437a(e);
                            bnsl2.mo68432a("ahkx", "a", 196, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl2.mo68405a("Failed to sign with paired key.");
                            return m56077a();
                        }
                    } catch (InvalidKeyException e2) {
                        bnsl bnsl3 = (bnsl) ahkm.f67363a.mo68388c();
                        bnsl3.mo68437a(e2);
                        bnsl3.mo68432a("ahkx", "a", 187, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl3.mo68420a("Failed to sign with paired key: %s", privateKey.getAlgorithm());
                        return m56077a();
                    }
                } catch (NoSuchAlgorithmException e3) {
                    bnsl bnsl4 = (bnsl) ahkm.f67363a.mo68388c();
                    bnsl4.mo68437a(e3);
                    bnsl4.mo68432a("ahkx", "a", 180, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl4.mo68405a("Failed to sign with paired key.");
                    return m56077a();
                }
            } else {
                throw new KeyStoreException("No AndroidKeyStore found on device.");
            }
        } catch (KeyStoreException | NoSuchAlgorithmException | UnrecoverableKeyException e4) {
            bnsl bnsl5 = (bnsl) ahkm.f67363a.mo68388c();
            bnsl5.mo68437a(e4);
            bnsl5.mo68432a("ahkx", "a", (int) MfiClientException.TYPE_MFICLIENT_CURRENTLY_ONLINE, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl5.mo68405a("Failed to sign with paired key.");
            return m56077a();
        }
    }
}
