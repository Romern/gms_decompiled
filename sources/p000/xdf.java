package p000;

import android.security.keystore.KeyInfo;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;

/* renamed from: xdf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xdf {

    /* renamed from: a */
    public static final /* synthetic */ int f51991a = 0;

    /* renamed from: b */
    private static final sek f51992b = new sek(new String[]{"KeyStoreCryptoHelper"}, (short[]) null);

    /* renamed from: a */
    private static aczq m42701a() {
        try {
            return new aczq();
        } catch (aczp | IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            adbd a = adbe.m50105a();
            a.f61234c = 8;
            a.f61233b = e;
            a.f61232a = "Unable to access Android KeyStore";
            throw a.mo33301a();
        }
    }

    /* renamed from: b */
    public static final PublicKey m42703b(String str) {
        bmxy.m108582a(str, "keyStorageIdentifier cannot be null");
        bmxy.m108589a(!str.trim().isEmpty(), "keyStorageIdentifier cannot be empty");
        f51992b.mo25412b("Retrieving public key in Android KeyStore", new Object[0]);
        try {
            KeyStore.Entry c = m42701a().mo33280c(str);
            if (c != null) {
                return ((KeyStore.PrivateKeyEntry) c).getCertificate().getPublicKey();
            }
            return null;
        } catch (aczp | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException e) {
            adbd a = adbe.m50105a();
            a.f61234c = 8;
            a.f61233b = e;
            a.f61232a = "Unable to get the public key from Android Keystore";
            throw a.mo33301a();
        }
    }

    /* renamed from: c */
    public static final KeyInfo m42704c(String str) {
        try {
            return (KeyInfo) KeyFactory.getInstance("EC", "AndroidKeyStore").getKeySpec(m42702a(str), KeyInfo.class);
        } catch (NoSuchAlgorithmException | NoSuchProviderException | InvalidKeySpecException e) {
            adbd a = adbe.m50105a();
            a.f61234c = 8;
            a.f61233b = e;
            a.f61232a = "Failed to get the keyInfo.";
            throw a.mo33301a();
        }
    }

    /* renamed from: a */
    public static final PrivateKey m42702a(String str) {
        bmxy.m108581a(str);
        try {
            KeyStore.Entry c = new aczq().mo33280c(str);
            if (c != null) {
                return ((KeyStore.PrivateKeyEntry) c).getPrivateKey();
            }
            adbd a = adbe.m50105a();
            a.f61234c = 8;
            a.f61232a = "Unable to get the private key from Android Keystore";
            throw a.mo33301a();
        } catch (aczp | IOException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | CertificateException e) {
            adbd a2 = adbe.m50105a();
            a2.f61234c = 8;
            a2.f61233b = e;
            a2.f61232a = "Unable to get the private key from Android Keystore";
            throw a2.mo33301a();
        }
    }
}
