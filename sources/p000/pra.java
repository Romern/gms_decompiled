package p000;

import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertificateException;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: pra */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pra {

    /* renamed from: a */
    private final pqv f40088a;

    /* renamed from: b */
    private final Set f40089b;

    /* renamed from: c */
    private final Set f40090c;

    /* renamed from: d */
    private final boolean f40091d;

    /* renamed from: e */
    private final pqz f40092e;

    static {
        new qav("DeviceCertVerifier");
    }

    public pra(pqv pqv, Set set, Set set2, boolean z, pqz pqz) {
        m31050a(pqv);
        this.f40088a = pqv;
        m31050a(set);
        this.f40089b = set;
        m31050a(set2);
        this.f40090c = set2;
        this.f40091d = z;
        this.f40092e = pqz;
    }

    /* renamed from: a */
    public static pqu m31049a() {
        return new pqu();
    }

    /* renamed from: a */
    public static void m31050a(Object obj) {
        if (obj == null) {
            throw null;
        }
    }

    /* renamed from: a */
    public static void m31051a(boolean z, String str) {
        if (!z) {
            throw new pqt(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:94:0x020f, code lost:
        r1.f40088a.mo23347b("CRL verification failed due to an exception.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0208 A[ExcHandler: InvalidKeyException | SignatureException | CertificateException | pqt (e java.lang.Throwable), Splitter:B:1:0x0006] */
    /* renamed from: a */
    public final pqx mo23571a(byte[] bArr, long j) {
        boolean z;
        byte[] bArr2 = bArr;
        long j2 = j;
        try {
            blsq blsq = (blsq) bxvk.m124016a(blsq.f127611b, bArr2, bxus.m123744c());
            m31051a(blsq.f127613a.size() > 0, "Empty CRL bundle");
            for (blsp blsp : blsq.f127613a) {
                int i = blsp.f127607a;
                m31051a(((i & 1) == 0 || (i & 2) == 0) ? false : (i & 4) != 0, "CRL is missing a required field.");
                bxtx bxtx = blsp.f127608b;
                bxus c = bxus.m123744c();
                blss blss = blss.f127620f;
                bxuc h = bxtx.mo73764h();
                bxvk bxvk = (bxvk) blss.mo74142c(4);
                bxxv a = bxxm.f165037a.mo74228a(bxvk);
                a.mo74220a(bxvk, bxud.m123454a(h), c);
                a.mo74225d(bxvk);
                h.mo73787a(0);
                bxvk.m124027b(bxvk);
                blss blss2 = (blss) bxvk;
                long j3 = blss2.f127622a;
                if (j3 == 0) {
                    long j4 = blss2.f127623b;
                    boolean z2 = j4 > 0;
                    StringBuilder sb = new StringBuilder(47);
                    sb.append("Invalid CRL issuance time: ");
                    sb.append(j4);
                    m31051a(z2, sb.toString());
                    long j5 = blss2.f127623b;
                    if (j5 <= j2) {
                        long j6 = blss2.f127624c;
                        if (j6 > j5) {
                            z = true;
                        } else {
                            z = false;
                        }
                        StringBuilder sb2 = new StringBuilder(71);
                        sb2.append("Invalid CRL validity period: ");
                        sb2.append(j5);
                        sb2.append(", ");
                        sb2.append(j6);
                        m31051a(z, sb2.toString());
                        long j7 = blss2.f127624c;
                        if (j2 <= j7) {
                            m31051a((blsp.f127607a & 2) != 0, "CRL is missing a signer certificate.");
                            X509Certificate a2 = this.f40092e.mo23569a(blsp.f127609c.mo73780k());
                            try {
                                X509Certificate trustedCert = pqz.m31042a(this.f40092e.f40087a.generateCertPath(Arrays.asList(a2)), TimeUnit.SECONDS.toMillis(j2), this.f40090c).getTrustAnchor().getTrustedCert();
                                if (trustedCert != null) {
                                    Signature c2 = pqz.m31046c();
                                    c2.initVerify(a2.getPublicKey());
                                    c2.update(blsp.f127608b.mo73780k());
                                    if (c2.verify(blsp.f127610d.mo73780k())) {
                                        pqv pqv = this.f40088a;
                                        pqz.m31045b().digest(bArr2);
                                        return new pqx(pqv, blss2, new pqy(blss2.f127623b, blss2.f127624c, a2, trustedCert));
                                    }
                                    this.f40088a.mo23346a("CRL signature is invalid.");
                                    return null;
                                }
                                throw new AssertionError("Trust anchor missing a certificate. Unexpected failure because all CRL trust anchors are specified as certificates.");
                            } catch (CertPathValidatorException e) {
                                this.f40088a.mo23347b("CRL signer certificate path validation failed with exception.");
                                return null;
                            } catch (InvalidAlgorithmParameterException e2) {
                                this.f40088a.mo23347b("CRL signer certificate path validation failed with exception.");
                                return null;
                            }
                        } else {
                            pqv pqv2 = this.f40088a;
                            StringBuilder sb3 = new StringBuilder(86);
                            sb3.append("CRL has expired: expirationTime=");
                            sb3.append(j7);
                            sb3.append(", currentTime=");
                            sb3.append(j2);
                            pqv2.mo23346a(sb3.toString());
                            return null;
                        }
                    } else {
                        pqv pqv3 = this.f40088a;
                        StringBuilder sb4 = new StringBuilder(89);
                        sb4.append("CRL is not yet valid: issuanceTime=");
                        sb4.append(j5);
                        sb4.append(", currentTime=");
                        sb4.append(j2);
                        pqv3.mo23346a(sb4.toString());
                        return null;
                    }
                } else {
                    pqv pqv4 = this.f40088a;
                    StringBuilder sb5 = new StringBuilder(54);
                    sb5.append("Skipping unsupported CRL version: ");
                    sb5.append(j3);
                    pqv4.mo23346a(sb5.toString());
                }
            }
            this.f40088a.mo23346a("No supported CRL version found in a CRL bundle. CRL verification failed.");
            return null;
        } catch (IOException e3) {
            IOException iOException = e3;
            if (!(iOException.getCause() instanceof bxwf)) {
                throw new bxwf(iOException.getMessage());
            }
            throw ((bxwf) iOException.getCause());
        } catch (RuntimeException e4) {
            RuntimeException runtimeException = e4;
            if (runtimeException.getCause() instanceof bxwf) {
                throw ((bxwf) runtimeException.getCause());
            }
            throw runtimeException;
        } catch (bxwf e5) {
            throw e5;
        } catch (InvalidKeyException | SignatureException | CertificateException | pqt e6) {
        } catch (bxwf e7) {
            throw e7;
        }
    }

    /* renamed from: a */
    public final boolean mo23572a(List list, long j) {
        try {
            if (this.f40091d) {
                this.f40088a.mo23346a("Device certificate revocation check is required, but no CRL has been provided.");
                return false;
            } else if (!list.isEmpty()) {
                pqz pqz = this.f40092e;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(pqz.mo23569a((byte[]) it.next()));
                }
                PKIXCertPathValidatorResult a = pqz.m31042a(pqz.f40087a.generateCertPath(arrayList), TimeUnit.SECONDS.toMillis(j), this.f40089b);
                if (!this.f40091d) {
                    return true;
                }
                a.getTrustAnchor();
                throw null;
            } else {
                throw new IllegalArgumentException("Empty certificate path.");
            }
        } catch (InvalidAlgorithmParameterException | CertPathValidatorException | CertificateException e) {
            this.f40088a.mo23347b("Device certificate verification failed due to exception.");
            return false;
        }
    }
}
