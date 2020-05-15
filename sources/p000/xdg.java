package p000;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyExpiredException;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyPermanentlyInvalidatedException;
import android.security.keystore.UserNotAuthenticatedException;
import android.security.keystore.UserPresenceUnavailableException;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import java.security.spec.ECGenParameterSpec;
import java.util.Locale;

/* renamed from: xdg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xdg implements xdm {

    /* renamed from: a */
    private static final xly f51993a = xly.SECP256R1;

    /* renamed from: b */
    private final Context f51994b;

    public xdg(Context context) {
        bmxy.m108581a(context);
        this.f51994b = context;
    }

    /* renamed from: a */
    private static final aczq m42705a() {
        try {
            return new aczq();
        } catch (aczp | IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            throw new xma("Unable to access Android KeyStore.", e);
        }
    }

    /* renamed from: b */
    private static final KeyStore.Entry m42707b(xjx xjx) {
        bmxy.m108581a(xjx);
        try {
            KeyStore.Entry c = m42705a().mo33280c(xjx.mo29848b());
            if (c != null) {
                return c;
            }
            String valueOf = String.valueOf(xjx);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
            sb.append("Key does not exist in Android KeyStore: ");
            sb.append(valueOf);
            throw new xma(sb.toString());
        } catch (aczp | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException e) {
            throw new xma("Error retrieving Android KeyStore entry", e);
        }
    }

    /* renamed from: c */
    public final Signature mo29653c(xjx xjx, byte[] bArr) {
        bmxy.m108581a(xjx);
        PrivateKey privateKey = ((KeyStore.PrivateKeyEntry) m42707b(xjx)).getPrivateKey();
        try {
            Signature instance = Signature.getInstance("SHA256withECDSA");
            instance.initSign(privateKey);
            return instance;
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw new xma("Unable to initialize signature", e);
        }
    }

    /* renamed from: a */
    private static boolean m42706a(aczq aczq, String str, InvalidKeyException invalidKeyException) {
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
            throw new xma("Error looking up Android KeyStore key", invalidKeyException);
        }
    }

    /* renamed from: b */
    public final PublicKey mo29652b(xjx xjx, byte[] bArr) {
        bmxy.m108581a(xjx);
        return ((KeyStore.PrivateKeyEntry) m42707b(xjx)).getCertificate().getPublicKey();
    }

    /* renamed from: a */
    public final xlu mo29648a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return xlu.m43152a(bypx.m125087b(bArr));
        } catch (bypq e) {
            throw new xma("Unable to decode Cable credential data", e);
        }
    }

    /* renamed from: a */
    public final void mo29649a(xjx xjx) {
        bmxy.m108581a(xjx);
        try {
            m42705a().mo33279b(xjx.mo29848b());
        } catch (aczp | KeyStoreException e) {
            throw new xma("Error deleting Android KeyStore key", e);
        }
    }

    /* renamed from: a */
    public final boolean mo29650a(xjx xjx, byte[] bArr) {
        bmxy.m108581a(xjx);
        String b = xjx.mo29848b();
        aczq a = m42705a();
        if (!cdvz.m135147b()) {
            try {
                return a.mo33278a(b);
            } catch (aczp | KeyStoreException e) {
                throw new xma("Error looking up Android KeyStore key", e);
            }
        } else {
            try {
                KeyStore.Entry c = a.mo33280c(b);
                if (c == null) {
                    return false;
                }
                Signature.getInstance("SHA256withECDSA").initSign(((KeyStore.PrivateKeyEntry) c).getPrivateKey());
                return true;
            } catch (aczp | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException e2) {
                throw new xma("Error looking up Android KeyStore key", e2);
            } catch (InvalidKeyException e3) {
                return m42706a(a, b, e3);
            }
        }
    }

    /* renamed from: a */
    public final byte[] mo29651a(xjx xjx, boolean z) {
        KeyGenParameterSpec.Builder builder;
        bmxy.m108581a(xjx);
        try {
            KeyPairGenerator instance = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
            KeyGenParameterSpec.Builder algorithmParameterSpec = new KeyGenParameterSpec.Builder(xjx.mo29848b(), 4).setDigests("SHA-256").setAlgorithmParameterSpec(new ECGenParameterSpec(f51993a.name().toLowerCase(Locale.US)));
            if (((xjz) xjx).f52482a.equals(xka.STRONGBOX_KEY)) {
                int i = Build.VERSION.SDK_INT;
                bmxy.m108588a(true);
                bmxy.m108588a(this.f51994b.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore"));
                builder = algorithmParameterSpec.setIsStrongBoxBacked(true).setUserPresenceRequired(true);
            } else {
                builder = algorithmParameterSpec.setUserAuthenticationRequired(true).setUserAuthenticationValidityDurationSeconds(((Integer) xmn.f52756f.mo58455c()).intValue());
            }
            instance.initialize(builder.build());
            instance.generateKeyPair();
            if (z) {
                return xlu.m43153a(new SecureRandom()).mo29922a().mo74444c();
            }
            return null;
        } catch (bypr e) {
            throw new xma("Unable to encode Cable credential data", e);
        } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException e2) {
            throw new xma("Could not create Android KeyStore key pair", e2);
        }
    }
}
