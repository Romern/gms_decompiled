package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidator;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: pku */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pku extends ptb {

    /* renamed from: a */
    public static final String f39527a = ptk.m31239c("com.google.cast.tp.deviceauth");

    /* renamed from: g */
    private static final String[] f39528g = {"success", "error received", "client auth cert malformed", "client auth cert not X509", "client auth cert not trusted", "SSL cert not trusted", "response malformed", "device capability not supported", "CRL is invalid", "CRL revocation check failed"};

    /* renamed from: h */
    private static final byte[] f39529h = {6, 10, 43, 6, 1, 4, 1, -42, 121, 2, 5, 2};

    /* renamed from: i */
    private static final boolean f39530i = ccyw.f180285a.mo6606a().mo77087a();

    /* renamed from: j */
    private static final boolean f39531j = ccyw.f180285a.mo6606a().mo77088b();

    /* renamed from: k */
    private static HashSet f39532k;

    /* renamed from: l */
    private static CertificateFactory f39533l;

    /* renamed from: b */
    public byte[] f39534b;

    /* renamed from: c */
    public final Object f39535c = new Object();

    /* renamed from: d */
    public final Context f39536d;

    /* renamed from: e */
    public final String f39537e;

    /* renamed from: f */
    final /* synthetic */ pjc f39538f;

    /* renamed from: m */
    private final CastDevice f39539m;

    /* renamed from: n */
    private final byte[] f39540n;

    /* renamed from: o */
    private int f39541o;

    static {
        try {
            f39532k = new HashSet();
            f39533l = CertificateFactory.getInstance("X.509");
            f39532k.add(new TrustAnchor(pkv.m30752a("MIIDwzCCAqugAwIBAgIBATANBgkqhkiG9w0BAQUFADB8MQswCQYDVQQGEwJVUzETMBEGA1UECAwKQ2FsaWZvcm5pYTEWMBQGA1UEBwwNTW91bnRhaW4gVmlldzETMBEGA1UECgwKR29vZ2xlIEluYzESMBAGA1UECwwJR29vZ2xlIFRWMRcwFQYDVQQDDA5FdXJla2EgUm9vdCBDQTAeFw0xMjEyMTcyMjM5MzNaFw0zMjEyMTIyMjM5MzNaMHwxCzAJBgNVBAYTAlVTMRMwEQYDVQQIDApDYWxpZm9ybmlhMRYwFAYDVQQHDA1Nb3VudGFpbiBWaWV3MRMwEQYDVQQKDApHb29nbGUgSW5jMRIwEAYDVQQLDAlHb29nbGUgVFYxFzAVBgNVBAMMDkV1cmVrYSBSb290IENBMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAuRHQ6hLcMuHfXDNrGXMdnZ7QOXa/pYQJpv1ubencjzZO6YgCvZ/06ET9TPWaAlZqRypjbFhFzHxmJNx5ecMqpLKLoPeitc0Gftu+7AyG8g0kYHSEyikjhALYp+078ewmR1TjsS3mZA/2csXpmFIXwPzyLCDIQPhHyTKeO5exi/WYJHBjZhnBUugEBT1fjbzYS693mG8feNG2UCdN5OwUaWcfWK+poBEmPJQyB3/X6Wkfrj9PY4qPidbyGXhcIY6xtlfYwOHufW7d8ToKavG6//mDL9y1pCAXYzbvyGIZzFbOsuoxiUt4WMG/AxOZ4BLyiKqblNrddnkXHjTRCsQHRQIDAQABo1AwTjAdBgNVHQ4EFgQURE4qR1jYuUiR9k/OdKkdMpqNjekwHwYDVR0jBBgwFoAURE4qR1jYuUiR9k/OdKkdMpqNjekwDAYDVR0TBAUwAwEB/zANBgkqhkiG9w0BAQUFAAOCAQEAP8gmoG5cBUB5oZipM95odIXurrccM1mwEd6f9E/T61EJfUd+blGF9FTNg5glsbqwV+yT2xLi7FFJepZzm8iWbYWM0+E9+jLiWAx3bYcMNAGqMKl24MDn214b6RAwpOAJSSa5WM1aB+VQdd6aO/ZTfrFTXkUnTxfjCDOyUAq79PwllyneQXUw+nc4qmWKc0/qEXvrfBdgJw68PnZS2IvtGvjrN7sR/a5wFwr+4K0Gsx9pinIEwsAzC9YvY0wzERS4YjaIxQNlARmj7wC7bw6S/zQcodYx0Fxen5l9x8q9fHIL9Fylfm4EqNKZLFEBFP6iSPB+voQNtNPi8w593ov1Mw=="), null));
            f39532k.add(new TrustAnchor(pkv.m30752a("MIIDxTCCAq2gAwIBAgIBAjANBgkqhkiG9w0BAQUFADB1MQswCQYDVQQGEwJVUzETMBEGA1UECAwKQ2FsaWZvcm5pYTEWMBQGA1UEBwwNTW91bnRhaW4gVmlldzETMBEGA1UECgwKR29vZ2xlIEluYzENMAsGA1UECwwEQ2FzdDEVMBMGA1UEAwwMQ2FzdCBSb290IENBMB4XDTE0MDQwMjE3MzQyNloXDTM0MDMyODE3MzQyNlowdTELMAkGA1UEBhMCVVMxEzARBgNVBAgMCkNhbGlmb3JuaWExFjAUBgNVBAcMDU1vdW50YWluIFZpZXcxEzARBgNVBAoMCkdvb2dsZSBJbmMxDTALBgNVBAsMBENhc3QxFTATBgNVBAMMDENhc3QgUm9vdCBDQTCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBALrZZZ3aOdPBd/bU0K6PWAhoOUqV7XDP/XkIqarl6binLaBnR4qeyc9wswWHaRHscJiXw+bDw+u9xrA9/E/BXjif2s9zMAZbeTfBXoyHR5SaQZIq1pXEcVwnXQixgMaSvRvjQZeh7HWfVZ4+n48cx2VkB9OzlqEEn5HE3gp7bNnIwHgxoBlCqeiD48788c7CLiRGlQkZysBGsuUButdP87/2aa2ZBPqgBzkO5t9RRwfA5KlcS5TFL7OgMH/nlWuyrzIN8YzVbct7R6cIq8sno03PSlrxBdH4YsUQKnRpquZLlvub2GPkWGbTrYpu/3te+aVWHi2CMVvw4iTmQUofrhMCAwEAAaNgMF4wDwYDVR0TBAgwBgEB/wIBAjAdBgNVHQ4EFgQUfJoefd95VLzXzF7KmYZFeWV0KBkwHwYDVR0jBBgwFoAUfJoefd95VLzXzF7KmYZFeWV0KBkwCwYDVR0PBAQDAgEGMA0GCSqGSIb3DQEBBQUAA4IBAQCA9Fr7PSgZUSDX1PsSl0pl8lg1kncwavHXtlEaf5rNx3sDQq1VagCv8OEGwr1reHXb/kERU0o5u5o6xlk0Lywz47LWXI/deOtxWznag5DFMeI/I+/a6ystd17ew0PSyWtZgsrV7fqhZFvL8Q0aYuGc6KcYcPBfF5b47Ybbrh3gzz5dLu4WbZUrPP2X8wVaJGhNObb45Fi69eAmeFHFW11OCeVsR4t6Wi6JU+bMNlsmPPhyQwKC0ivN8NOj7BM+UtWDPQfcHUNlejMCAaPOt9ZgUTsJwiOKMv6YGWBik4XNNEbb1SMPedp3ACoCbYNYzgN3NeGjIJPCSqKkRhx1LB9N"), null));
        } catch (CertificateException e) {
            Log.wtf("DeviceAuthChannel", "Error parsing built-in cert.", e);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pku(pjc pjc, Context context, CastDevice castDevice, String str, byte[] bArr, String str2) {
        super(f39527a, "DeviceAuthChannel", str2);
        this.f39538f = pjc;
        this.f39536d = context;
        this.f39539m = castDevice;
        this.f39540n = bArr;
        this.f39537e = str;
    }

    /* renamed from: a */
    public static int m30744a(blsj blsj, byte[] bArr, byte[] bArr2, CastDevice castDevice, ptx ptx) {
        boolean z;
        boolean z2;
        String str;
        blsj blsj2 = blsj;
        CastDevice castDevice2 = castDevice;
        ptx ptx2 = ptx;
        byte[] k = blsj2.f127592f.getKey();
        if (k == null || k.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if ((!f39530i && z) || Arrays.equals(k, bArr)) {
            ArrayList arrayList = new ArrayList();
            try {
                if (blsj2.f127589c.mo73744a() != 0) {
                    arrayList.add(pkv.m30753a(blsj2.f127589c.getKey()));
                }
                for (ByteString bxtx : blsj2.f127590d) {
                    arrayList.add(pkv.m30753a(bxtx.getKey()));
                }
                if (arrayList.isEmpty()) {
                    return 2;
                }
                try {
                    CertPath generateCertPath = f39533l.generateCertPath(arrayList);
                    PKIXParameters pKIXParameters = new PKIXParameters(f39532k);
                    pKIXParameters.setRevocationEnabled(false);
                    PKIXCertPathValidatorResult pKIXCertPathValidatorResult = (PKIXCertPathValidatorResult) CertPathValidator.getInstance("PKIX").validate(generateCertPath, pKIXParameters);
                    PublicKey publicKey = pKIXCertPathValidatorResult.getPublicKey();
                    TrustAnchor trustAnchor = pKIXCertPathValidatorResult.getTrustAnchor();
                    if (f39531j) {
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        pes pes = pes.f38974a;
                        long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                        pkt pkt = new pkt(ptx2);
                        pqu a = pra.m31049a();
                        a.f40077b = true;
                        pra.m31050a(pkt);
                        a.f40076a = pkt;
                        pqx a2 = a.mo23565a().mo23571a(blsj2.f127594h.getKey(), seconds);
                        if (a2 == null) {
                            return 8;
                        }
                        if (!a2.mo23568a(generateCertPath, trustAnchor, seconds)) {
                            return 9;
                        }
                    }
                    String a3 = m30745a(blsj);
                    if (a3 != null) {
                        try {
                            Signature instance = Signature.getInstance(a3);
                            instance.initVerify(publicKey);
                            instance.update(k);
                            instance.update(bArr2);
                            if (!instance.verify(blsj2.f127588b.getKey())) {
                                return 5;
                            }
                            if (castDevice2 != null && castDevice2.mo17496a(1)) {
                                int size = arrayList.size();
                                int i = 0;
                                while (i < size) {
                                    byte[] bArr3 = f39529h;
                                    byte[] extensionValue = ((X509Certificate) arrayList.get(i)).getExtensionValue("2.5.29.32");
                                    if (extensionValue == null) {
                                        z2 = false;
                                    } else {
                                        int i2 = 0;
                                        while (true) {
                                            if (i2 >= (extensionValue.length - bArr3.length) + 1) {
                                                z2 = false;
                                                break;
                                            }
                                            int i3 = 0;
                                            while (i3 < bArr3.length) {
                                                if (extensionValue[i2 + i3] == bArr3[i3]) {
                                                    i3++;
                                                } else {
                                                    i2++;
                                                }
                                            }
                                            z2 = i2 >= 0;
                                        }
                                    }
                                    i++;
                                    if (z2) {
                                        return 7;
                                    }
                                }
                            }
                            return 0;
                        } catch (NoSuchAlgorithmException e) {
                            Log.wtf("DeviceAuthChannel", String.format(Locale.ROOT, "NoSuchAlgorithm: %s", a3), e);
                            m30748a(ptx2, e);
                            return 6;
                        } catch (InvalidKeyException e2) {
                            m30748a(ptx2, e2);
                            return 2;
                        } catch (SignatureException e3) {
                            m30748a(ptx2, e3);
                            return 5;
                        }
                    } else {
                        ptx2.mo23677d("Invalid algorithm", new Object[0]);
                        return 6;
                    }
                } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException | CertificateException e4) {
                    m30748a(ptx2, e4);
                    return 2;
                } catch (CertPathValidatorException e5) {
                    m30748a(ptx2, e5);
                    return 4;
                }
            } catch (CertificateException e6) {
                m30748a(ptx2, e6);
                return 2;
            } catch (ClassCastException e7) {
                m30748a(ptx2, e7);
                return 3;
            }
        } else {
            Object[] objArr = new Object[1];
            if (!z) {
                str = "Unmatched";
            } else {
                str = "Empty";
            }
            objArr[0] = str;
            ptx2.mo23670a("%s sender nonce received", objArr);
            return 6;
        }
    }

    /* renamed from: a */
    public static String m30745a(blsj blsj) {
        String str;
        String str2;
        int a = blso.m107531a(blsj.f127591e);
        if (a == 0) {
            a = 2;
        }
        int i = a - 1;
        int i2 = 1;
        if (i == 1) {
            str = "withRSA";
        } else if (i != 2) {
            return null;
        } else {
            str = "withRSAandMGF1";
        }
        int a2 = blsm.m107529a(blsj.f127593g);
        if (a2 != 0) {
            i2 = a2;
        }
        if (i2 - 1 != 0) {
            str2 = "SHA256";
        } else {
            str2 = "SHA1";
        }
        return str.length() == 0 ? new String(str2) : str2.concat(str);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: pjc.a(int, boolean, bpes):void
     arg types: [int, int, bpes]
     candidates:
      pjc.a(int, java.lang.String, java.lang.String):void
      pjc.a(bpfk, blsw, int):void
      pjc.a(java.lang.String, java.lang.String, long):void
      pjc.a(java.lang.String, java.lang.String, com.google.android.gms.cast.JoinOptions):void
      pjc.a(java.lang.String, byte[], long):void
      pjc.a(pig, boolean, long):void
      pjc.a(double, double, boolean):boolean
      pjc.a(boolean, double, boolean):boolean
      pil.a(java.lang.String, java.lang.String, long):void
      pil.a(java.lang.String, java.lang.String, com.google.android.gms.cast.JoinOptions):void
      pil.a(java.lang.String, byte[], long):void
      pil.a(double, double, boolean):boolean
      pil.a(boolean, double, boolean):boolean
      pjc.a(int, boolean, bpes):void */
    /* renamed from: a */
    private final void m30746a(int i) {
        if (i == 0) {
            this.f40173s.mo23670a("Device authentication succeeded.", new Object[0]);
        } else if (i != 1) {
            this.f40173s.mo23670a(String.format(Locale.ROOT, "Device authentication failed: %d - %s", Integer.valueOf(i), f39528g[i]), new Object[0]);
        } else {
            ptx ptx = this.f40173s;
            Locale locale = Locale.ROOT;
            Object[] objArr = new Object[2];
            objArr[0] = f39528g[1];
            int i2 = this.f39541o;
            objArr[1] = i2 != 0 ? Integer.toString(i2 - 1) : "null";
            ptx.mo23670a(String.format(locale, "Device authentication failed: %s - %s", objArr), new Object[0]);
        }
        pjc pjc = this.f39538f;
        pku pku = pjc.f39319h;
        if (pku != null) {
            pjc.mo23247b(pku);
            this.f39538f.f39319h = null;
        }
        if (i == 0) {
            this.f40173s.mo23670a("authentication succeeded", new Object[0]);
            this.f39538f.mo23260n();
            return;
        }
        this.f39538f.mo23236a(2705, false, phy.m30367b(i));
    }

    /* renamed from: a */
    public static void m30747a(Context context) {
        SharedPreferences b = qay.m31785b(context);
        b.edit().remove("PREF_CAST_SENDER_NONCE").apply();
        b.edit().remove("PREF_CAST_SENDER_NONCE_GENERATED_TIME").apply();
    }

    /* renamed from: a */
    private static void m30748a(ptx ptx, Exception exc) {
        ptx.mo23675c("%s: %s", exc.getClass().getSimpleName(), exc.getMessage());
    }

    /* renamed from: a */
    public final void mo23348a(byte[] bArr) {
        byte[] bArr2;
        try {
            blsk blsk = (blsk) GeneratedMessageLite.m124016a(blsk.f127596e, bArr, bxus.m123744c());
            if (bArr.length <= 4096) {
                try {
                    this.f40173s.mo23670a("Received a protobuf: %s", blsk.toString());
                } catch (OutOfMemoryError e) {
                    this.f40173s.mo23670a("Received a very long protobuf", new Object[0]);
                }
            } else {
                this.f40173s.mo23670a("Received a very long protobuf", new Object[0]);
            }
            int i = blsk.f127598a;
            if ((i & 1) != 0) {
                this.f40173s.mo23670a("Received DeviceAuthMessage with challenge instead of response (ignored).", new Object[0]);
            } else if ((i & 4) != 0) {
                blsi blsi = blsk.f127601d;
                if (blsi == null) {
                    blsi = blsi.f127580b;
                }
                int a = blsh.m107524a(blsi.f127582a);
                if (a == 0) {
                    a = 1;
                }
                this.f39541o = a;
                m30746a(1);
            } else if ((i & 2) != 0) {
                blsj blsj = blsk.f127600c;
                if (blsj == null) {
                    blsj = blsj.f127585i;
                }
                synchronized (this.f39535c) {
                    bArr2 = this.f39534b;
                }
                m30746a(m30744a(blsj, bArr2, this.f39540n, this.f39539m, this.f40173s));
            } else {
                this.f40173s.mo23670a("Received DeviceAuthMessage with no response (ignored).", new Object[0]);
            }
        } catch (bxwf e2) {
            this.f40173s.mo23670a("Received an unparseable protobuf (ignored): %s", e2.getMessage());
        }
    }

    /* renamed from: a */
    public final byte[] mo23349a(SharedPreferences sharedPreferences) {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        sharedPreferences.edit().putString("PREF_CAST_SENDER_NONCE", Base64.encodeToString(bArr, 0)).apply();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        pes pes = pes.f38974a;
        edit.putLong("PREF_CAST_SENDER_NONCE_GENERATED_TIME", System.currentTimeMillis()).apply();
        this.f40173s.mo23673b("New nonce generated: %s", Arrays.toString(bArr));
        return bArr;
    }
}
