package p000;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyExpiredException;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyInfo;
import android.security.keystore.KeyPermanentlyInvalidatedException;
import android.security.keystore.UserNotAuthenticatedException;
import android.security.keystore.UserPresenceUnavailableException;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.InvalidKeySpecException;

/* renamed from: xde */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xde {

    /* renamed from: a */
    private static final xly f51988a = xly.SECP256R1;

    /* renamed from: c */
    private static final sek f51989c = new sek(new String[]{"KeyStoreCryptoHelper"}, (short[]) null);

    /* renamed from: b */
    private final Context f51990b;

    public xde(Context context) {
        bmxy.m108581a(context);
        this.f51990b = context;
    }

    /* renamed from: a */
    private static aczq m42692a() {
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
    private static aczo m42695b() {
        try {
            return new aczo();
        } catch (aczp | NoSuchAlgorithmException | NoSuchProviderException e) {
            adbd a = adbe.m50105a();
            a.f61234c = 8;
            a.f61233b = e;
            a.f61232a = "Unable to access KeyPairGenerator";
            throw a.mo33301a();
        }
    }

    /* renamed from: c */
    public static final PublicKey m42697c(String str) {
        bmxy.m108582a(str, "keyStorageIdentifier cannot be null");
        bmxy.m108589a(!str.trim().isEmpty(), "keyStorageIdentifier cannot be empty");
        f51989c.mo25412b("Retrieving public key in Android KeyStore", new Object[0]);
        try {
            KeyStore.Entry c = m42692a().mo33280c(str);
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

    /* renamed from: d */
    public static final boolean m42698d(String str) {
        bmxy.m108581a(str);
        aczq a = m42692a();
        if (!cdvz.m135147b()) {
            try {
                return a.mo33278a(str);
            } catch (aczp | KeyStoreException e) {
                adbd a2 = adbe.m50105a();
                a2.f61234c = 8;
                a2.f61233b = e;
                a2.f61232a = "Unable to check if the key exist in Android Keystore";
                throw a2.mo33301a();
            }
        } else {
            try {
                KeyStore.Entry c = a.mo33280c(str);
                if (c == null) {
                    return false;
                }
                Signature.getInstance("SHA256withECDSA").initSign(((KeyStore.PrivateKeyEntry) c).getPrivateKey());
                return true;
            } catch (aczp | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException e2) {
                adbd a3 = adbe.m50105a();
                a3.f61234c = 8;
                a3.f61233b = e2;
                a3.f61232a = "Error looking up Android KeyStore key";
                throw a3.mo33301a();
            } catch (InvalidKeyException e3) {
                return m42694a(a, str, e3);
            }
        }
    }

    /* renamed from: e */
    public static final KeyInfo m42699e(String str) {
        try {
            return (KeyInfo) KeyFactory.getInstance("EC", "AndroidKeyStore").getKeySpec(m42696b(str), KeyInfo.class);
        } catch (NoSuchAlgorithmException | NoSuchProviderException | InvalidKeySpecException e) {
            adbd a = adbe.m50105a();
            a.f61234c = 8;
            a.f61233b = e;
            a.f61232a = "Failed to get the keyInfo.";
            throw a.mo33301a();
        }
    }

    /* renamed from: a */
    public static final void m42693a(String str) {
        bmxy.m108582a(str, "keyStorageIdentifier cannot be null");
        bmxy.m108589a(!str.trim().isEmpty(), "keyStorageIdentifier cannot be empty");
        f51989c.mo25412b("Deleting key in Android KeyStore", new Object[0]);
        try {
            m42692a().mo33279b(str);
        } catch (aczp | KeyStoreException e) {
            adbd a = adbe.m50105a();
            a.f61234c = 8;
            a.f61233b = e;
            a.f61232a = "Unable to delete the key from Android Keystore";
            throw a.mo33301a();
        }
    }

    /* renamed from: b */
    public static final PrivateKey m42696b(String str) {
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

    /* renamed from: a */
    private static boolean m42694a(aczq aczq, String str, InvalidKeyException invalidKeyException) {
        int i = Build.VERSION.SDK_INT;
        if (invalidKeyException instanceof UserNotAuthenticatedException) {
            return true;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (invalidKeyException instanceof UserPresenceUnavailableException) {
            return true;
        }
        if ((invalidKeyException instanceof KeyPermanentlyInvalidatedException) || (invalidKeyException instanceof KeyExpiredException)) {
            try {
                aczq.mo33279b(str);
                return false;
            } catch (aczp | KeyStoreException e) {
                return false;
            }
        } else {
            adbd a = adbe.m50105a();
            a.f61234c = 8;
            a.f61233b = invalidKeyException;
            a.f61232a = "Error looking up Android KeyStore key";
            throw a.mo33301a();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bmxy.a(boolean, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      bmxy.a(java.lang.Object, java.lang.Object):java.lang.Object
      bmxy.a(int, int):void
      bmxy.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo29647a(String str, xmq xmq) {
        KeyGenParameterSpec.Builder builder;
        bmxy.m108582a(str, "keyStorageIdentifier cannot be null");
        bmxy.m108589a(!str.trim().isEmpty(), "keyStorageIdentifier cannot be empty");
        bmxy.m108589a(xmq == xmq.KEYSTORE || xmq == xmq.STRONGBOX, "keyStorageType can only be KEYSTORE or STRONGBOX");
        f51989c.mo25412b("Creating a key pair in Android KeyStore", new Object[0]);
        aczo b = m42695b();
        try {
            KeyGenParameterSpec.Builder algorithmParameterSpec = new KeyGenParameterSpec.Builder(str, 4).setDigests("SHA-256").setAlgorithmParameterSpec(new ECGenParameterSpec(bmwb.m108442a(f51988a.name())));
            int ordinal = xmq.ordinal();
            if (ordinal == 0) {
                builder = algorithmParameterSpec.setUserAuthenticationRequired(true).setUserAuthenticationValidityDurationSeconds(((Integer) xmn.f52756f.mo58455c()).intValue());
            } else if (ordinal == 2) {
                int i = Build.VERSION.SDK_INT;
                bmxy.m108589a(true, (Object) "the platform version must be at least P");
                bmxy.m108589a(this.f51990b.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore"), "Strongbox feature is not supported");
                builder = algorithmParameterSpec.setIsStrongBoxBacked(true).setUserPresenceRequired(true);
            } else {
                throw new IllegalStateException("Not supported key storage type");
            }
            b.f61170a.initialize(builder.build());
            b.f61170a.generateKeyPair();
        } catch (RuntimeException e) {
            throw new aczp("Unable to initialize keyPairGenerator", e);
        } catch (RuntimeException e2) {
            throw new aczp("Unable to generate key pair via keyPairGenerator", e2);
        } catch (aczp | InvalidAlgorithmParameterException e3) {
            adbd a = adbe.m50105a();
            a.f61234c = 8;
            a.f61233b = e3;
            a.f61232a = "Unable to generate Android Keystore key pair";
            throw a.mo33301a();
        }
    }
}
