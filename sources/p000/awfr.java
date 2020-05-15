package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.UserNotAuthenticatedException;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.util.UUID;

/* renamed from: awfr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awfr {

    /* renamed from: a */
    private static final Charset f94279a = Charset.forName("UTF-8");

    /* renamed from: b */
    private final BuyFlowConfig f94280b;

    /* renamed from: c */
    private final Context f94281c;

    public awfr(Context context, BuyFlowConfig buyFlowConfig) {
        this.f94280b = buyFlowConfig;
        this.f94281c = context;
    }

    /* renamed from: a */
    public static awfr m79859a(Context context, BuyFlowConfig buyFlowConfig) {
        return new awfr(context.getApplicationContext(), buyFlowConfig);
    }

    /* renamed from: b */
    public final Signature mo52107b(int i) {
        int i2 = Build.VERSION.SDK_INT;
        try {
            return m79861a(m79860a(), i);
        } catch (IOException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableKeyException | CertificateException e) {
            m79863a(e);
            return null;
        }
    }

    /* renamed from: c */
    public final bmcv mo52108c(int i) {
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        String uuid = UUID.randomUUID().toString();
        int i4 = i - 1;
        if (i != 0) {
            if (i4 == 1) {
                i2 = -1;
            } else if (i4 == 2) {
                i2 = (int) chje.f188675a.mo6606a().mo85276b();
            } else {
                throw new AssertionError("Unsupported authenticator");
            }
            String e = mo52110e(i);
            String valueOf = String.valueOf(uuid);
            ECPublicKey a = m79862a("AndroidKeyStore", e, "secp256r1", i2, valueOf.length() == 0 ? new String("GooglePaymentsUserAuthKey:") : "GooglePaymentsUserAuthKey:".concat(valueOf));
            bxvd da = bmcv.f128750g.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmcv bmcv = (bmcv) da.f164949b;
            bmcv.f128756e = i4;
            int i5 = bmcv.f128752a | 8;
            bmcv.f128752a = i5;
            uuid.getClass();
            int i6 = i5 | 4;
            bmcv.f128752a = i6;
            bmcv.f128755d = uuid;
            bmcv.f128754c = 1;
            bmcv.f128752a = i6 | 2;
            String encodeToString = Base64.encodeToString(awfn.m79852a(a.getW()), 2);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmcv bmcv2 = (bmcv) da.f164949b;
            encodeToString.getClass();
            bmcv2.f128752a |= 1;
            bmcv2.f128753b = encodeToString;
            try {
                Certificate[] certificateChain = m79860a().getCertificateChain(mo52110e(i));
                if (certificateChain != null) {
                    bxvd da2 = bmco.f128726b.mo74144da();
                    for (Certificate certificate : certificateChain) {
                        ByteString a2 = ByteString.m123261a(certificate.getEncoded());
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bmco bmco = (bmco) da2.f164949b;
                        a2.getClass();
                        if (!bmco.f128728a.mo73666a()) {
                            bmco.f128728a = GeneratedMessageLite.m124021a(bmco.f128728a);
                        }
                        bmco.f128728a.add(a2);
                    }
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bmcv bmcv3 = (bmcv) da.f164949b;
                    bmco bmco2 = (bmco) da2.mo74062i();
                    bmco2.getClass();
                    bmcv3.f128757f = bmco2;
                    bmcv3.f128752a |= 16;
                }
                return (bmcv) da.mo74062i();
            } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e2) {
                throw new RuntimeException(e2);
            }
        } else {
            throw null;
        }
    }

    /* renamed from: d */
    public final void mo52109d(int i) {
        try {
            KeyStore a = m79860a();
            if (a.containsAlias(mo52110e(i))) {
                a.deleteEntry(mo52110e(i));
            }
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            awye.m81493a(this.f94281c, e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final String mo52110e(int i) {
        boolean z;
        ApplicationParameters applicationParameters = this.f94280b.f110418b;
        int i2 = applicationParameters.f110406a;
        Account account = applicationParameters.f110407b;
        awgg awgg = new awgg();
        awgg.mo52122a(i2);
        awgg.mo52123a(account.name);
        if (i != 2) {
            if (i == 3) {
                z = true;
            } else {
                z = false;
            }
            bmxy.m108601b(z, "Unsupported authenticator");
            awgg.mo52123a("LOCKSCREEN");
        }
        String valueOf = String.valueOf(awgg.mo52121a());
        return srv.m36160a((valueOf.length() == 0 ? new String("com.google.android.gms.wallet.keys:") : "com.google.android.gms.wallet.keys:".concat(valueOf)).getBytes(f94279a));
    }

    /* renamed from: a */
    static final KeyStore m79860a() {
        KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
        instance.load(null);
        return instance;
    }

    /* renamed from: a */
    private final Signature m79861a(KeyStore keyStore, int i) {
        if (!keyStore.containsAlias(mo52110e(i))) {
            return null;
        }
        Signature instance = Signature.getInstance("SHA256withECDSA");
        instance.initSign((PrivateKey) keyStore.getKey(mo52110e(i), null));
        return instance;
    }

    /* renamed from: a */
    static final ECPublicKey m79862a(String str, String str2, String str3, int i, String str4) {
        int i2 = Build.VERSION.SDK_INT;
        try {
            KeyPairGenerator instance = KeyPairGenerator.getInstance("EC", str);
            KeyGenParameterSpec.Builder userAuthenticationValidityDurationSeconds = new KeyGenParameterSpec.Builder(str2, 4).setAlgorithmParameterSpec(new ECGenParameterSpec(str3)).setDigests("SHA-256").setUserAuthenticationRequired(true).setUserAuthenticationValidityDurationSeconds(i);
            int i3 = Build.VERSION.SDK_INT;
            userAuthenticationValidityDurationSeconds.setAttestationChallenge(str4.getBytes(f94279a));
            instance.initialize(userAuthenticationValidityDurationSeconds.build());
            return (ECPublicKey) instance.generateKeyPair().getPublic();
        } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private final void m79863a(Throwable th) {
        if (sto.m36305a()) {
            Log.e("KeyStoreUtils", "UncaughtException", th);
        } else {
            awye.m81493a(this.f94281c, th);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003a, code lost:
        r5 = e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003a A[ExcHandler: IOException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableKeyException | CertificateException (e java.lang.Throwable), Splitter:B:1:0x0003] */
    /* renamed from: a */
    public final boolean mo52105a(int i) {
        int i2 = Build.VERSION.SDK_INT;
        try {
            KeyStore a = m79860a();
            if (i != 3) {
                return m79861a(a, i) != null;
            }
            if (!chje.f188675a.mo6606a().mo85275a()) {
                return a.containsAlias(mo52110e(3));
            }
            return m79861a(a, 3) != null;
        } catch (InvalidKeyException e) {
            if (e instanceof UserNotAuthenticatedException) {
                return true;
            }
            throw e;
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableKeyException | CertificateException e2) {
        } catch (InvalidKeyException e3) {
            e = e3;
            m79863a(e);
            return false;
        }
    }

    /* renamed from: a */
    public final byte[] mo52106a(byte[] bArr, Signature signature) {
        if (signature == null) {
            return null;
        }
        try {
            signature.update(bArr);
            return signature.sign();
        } catch (SignatureException e) {
            awye.m81493a(this.f94281c, e);
            return null;
        }
    }
}
