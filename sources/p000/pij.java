package p000;

import android.content.Context;
import android.security.KeyPairGeneratorSpec;
import android.util.Base64;
import java.io.IOException;
import java.math.BigInteger;
import java.net.Socket;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.UnrecoverableEntryException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.net.ssl.X509KeyManager;
import javax.security.auth.x500.X500Principal;

/* renamed from: pij */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pij implements X509KeyManager {

    /* renamed from: a */
    private static final qav f39223a = new qav("CastClientAuthKeyManager");

    /* renamed from: b */
    private static final int f39224b = ((int) ccxy.f180226a.mo6606a().mo77040b());

    /* renamed from: g */
    private static pij f39225g = null;

    /* renamed from: c */
    private final Context f39226c;

    /* renamed from: d */
    private final pjd f39227d;

    /* renamed from: e */
    private KeyStore.PrivateKeyEntry f39228e;

    /* renamed from: f */
    private byte[] f39229f;

    public pij(Context context, pjd pjd) {
        this.f39226c = context;
        try {
            pjd.f39338a = KeyStore.getInstance("AndroidKeyStore");
            pjd.f39338a.load(null);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            f39223a.mo23676c(e, "Can't retrieve keystore", new Object[0]);
            pjd = null;
        }
        this.f39227d = pjd;
    }

    /* renamed from: a */
    public static pij m30443a(Context context) {
        if (f39225g == null) {
            f39225g = new pij(context, new pjd());
        }
        return f39225g;
    }

    /* renamed from: b */
    private final void m30444b() {
        if (this.f39227d != null) {
            int i = 0;
            while (i < 3) {
                try {
                    f39223a.mo23861b("Attempting to retrieve client auth cert.");
                    this.f39229f = null;
                    KeyStore keyStore = this.f39227d.f39338a;
                    if (keyStore != null) {
                        KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) keyStore.getEntry("cast_nearby_client_auth", null);
                        this.f39228e = privateKeyEntry;
                        if (privateKeyEntry == null) {
                            f39223a.mo23861b("Attempting to create a new client auth cert.");
                            Context context = this.f39226c;
                            int i2 = f39224b;
                            f39223a.mo23861b("Creating a new privatekey pair for Cast auth.");
                            GregorianCalendar gregorianCalendar = new GregorianCalendar();
                            GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
                            gregorianCalendar2.add(12, i2);
                            KeyPairGeneratorSpec build = new KeyPairGeneratorSpec.Builder(context).setAlias("cast_nearby_client_auth").setSubject(new X500Principal("CN=cast_nearby_client_auth")).setSerialNumber(new BigInteger(512, new SecureRandom())).setStartDate(gregorianCalendar.getTime()).setEndDate(gregorianCalendar2.getTime()).build();
                            KeyPairGenerator instance = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                            instance.initialize(build);
                            instance.generateKeyPair();
                        } else {
                            Certificate certificate = privateKeyEntry.getCertificate();
                            X509Certificate x509Certificate = (X509Certificate) certificate;
                            if (x509Certificate != null) {
                                x509Certificate.checkValidity(new Date(new Date().getTime() + 60000));
                                byte[] digest = MessageDigest.getInstance("SHA-256").digest(certificate.getPublicKey().getEncoded());
                                this.f39229f = digest;
                                f39223a.mo23856a("successfully created hash of public key. %s", Base64.encodeToString(digest, 0));
                                return;
                            } else if (!m30445c()) {
                                return;
                            }
                        }
                        i++;
                    } else {
                        throw new IllegalStateException("The KeyStore is not loaded.");
                    }
                } catch (UnrecoverableEntryException e) {
                    f39223a.mo23860a(e, "UnrecoverableEntryException detected.");
                    if (m30445c()) {
                        f39223a.mo23671a(e, "deleting key and regenerating.", new Object[0]);
                    } else {
                        return;
                    }
                } catch (RuntimeException e2) {
                    f39223a.mo23860a(e2, "RuntimeExeception detected.");
                    if (m30445c()) {
                        f39223a.mo23671a(e2, "deleting key and regenerating.", new Object[0]);
                    } else {
                        return;
                    }
                } catch (CertificateExpiredException e3) {
                    if (m30445c()) {
                        f39223a.mo23671a(e3, "deleting key and regenerating.", new Object[0]);
                    } else {
                        return;
                    }
                } catch (CertificateNotYetValidException e4) {
                    if (m30445c()) {
                        f39223a.mo23671a(e4, "deleting key and regenerating.", new Object[0]);
                    } else {
                        return;
                    }
                } catch (NoSuchAlgorithmException e5) {
                    f39223a.mo23676c(e5, "No algorithm available.", new Object[0]);
                    return;
                } catch (KeyStoreException e6) {
                    f39223a.mo23676c(e6, "unable to use key from keystore.", new Object[0]);
                    return;
                } catch (NoSuchProviderException e7) {
                    f39223a.mo23676c(e7, "no provider.", new Object[0]);
                    return;
                } catch (InvalidAlgorithmParameterException e8) {
                    f39223a.mo23676c(e8, "invalid algorithm parameter.", new Object[0]);
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    private final boolean m30445c() {
        f39223a.mo23673b("Deleting key %s.", "cast_nearby_client_auth");
        this.f39229f = null;
        this.f39228e = null;
        try {
            KeyStore keyStore = this.f39227d.f39338a;
            if (keyStore != null) {
                keyStore.deleteEntry("cast_nearby_client_auth");
                return true;
            }
            throw new IllegalStateException("The KeyStore is not loaded.");
        } catch (KeyStoreException e) {
            f39223a.mo23676c(e, "unable to delete key from keystore.", new Object[0]);
            return false;
        }
    }

    public final String chooseClientAlias(String[] strArr, Principal[] principalArr, Socket socket) {
        return "cast_nearby_client_auth";
    }

    public final String chooseServerAlias(String str, Principal[] principalArr, Socket socket) {
        return null;
    }

    public final X509Certificate[] getCertificateChain(String str) {
        m30444b();
        KeyStore.PrivateKeyEntry privateKeyEntry = this.f39228e;
        return privateKeyEntry != null ? (X509Certificate[]) privateKeyEntry.getCertificateChain() : new X509Certificate[0];
    }

    public final String[] getClientAliases(String str, Principal[] principalArr) {
        return new String[]{"cast_nearby_client_auth"};
    }

    public final PrivateKey getPrivateKey(String str) {
        m30444b();
        KeyStore.PrivateKeyEntry privateKeyEntry = this.f39228e;
        if (privateKeyEntry != null) {
            return privateKeyEntry.getPrivateKey();
        }
        return null;
    }

    public final String[] getServerAliases(String str, Principal[] principalArr) {
        return new String[0];
    }

    /* renamed from: a */
    public final byte[] mo23174a() {
        m30444b();
        return this.f39229f;
    }
}
