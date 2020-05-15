package p000;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: pqx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pqx {

    /* renamed from: a */
    private final pqv f40081a;

    /* renamed from: b */
    private final pqy f40082b;

    /* renamed from: c */
    private final Set f40083c = new HashSet();

    /* renamed from: d */
    private final Map f40084d = new HashMap();

    public pqx(pqv pqv, blss blss, pqy pqy) {
        this.f40081a = pqv;
        this.f40082b = pqy;
        bxwc bxwc = blss.f127625d;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            this.f40083c.add(m31040a((ByteString) bxwc.get(i)));
        }
        bxwc bxwc2 = blss.f127626e;
        int size2 = bxwc2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            blsr blsr = (blsr) bxwc2.get(i2);
            ByteBuffer a = m31040a(blsr.f127616a);
            if (!this.f40084d.containsKey(a)) {
                this.f40084d.put(a, new HashSet());
            }
            ((Set) this.f40084d.get(a)).add(new pqw(blsr));
        }
    }

    /* renamed from: a */
    private static final ByteBuffer m31040a(ByteString bxtx) {
        boolean z = true;
        pra.m31051a(!bxtx.mo73779j(), "Missing SPKI hash.");
        if (bxtx.mo73744a() != 32) {
            z = false;
        }
        pra.m31051a(z, "Bad SPKI hash value.");
        return bxtx.mo73760e();
    }

    /* renamed from: a */
    public final boolean mo23568a(CertPath certPath, TrustAnchor trustAnchor, long j) {
        try {
            pqy pqy = this.f40082b;
            if (j > pqy.f40086b || j < pqy.f40085a) {
                return false;
            }
            if (this.f40083c.isEmpty()) {
                if (this.f40084d.isEmpty()) {
                    return true;
                }
            }
            List<? extends Certificate> certificates = certPath.getCertificates();
            X509Certificate trustedCert = trustAnchor.getTrustedCert();
            if (trustedCert != null) {
                ByteBuffer wrap = ByteBuffer.wrap(pqz.m31045b().digest(trustedCert.getPublicKey().getEncoded()));
                int size = certificates.size() - 1;
                while (size >= 0) {
                    ByteBuffer wrap2 = ByteBuffer.wrap(pqz.m31045b().digest(((Certificate) certificates.get(size)).getPublicKey().getEncoded()));
                    if (!this.f40083c.contains(wrap2)) {
                        if (this.f40084d.containsKey(wrap)) {
                            BigInteger serialNumber = ((X509Certificate) certificates.get(size)).getSerialNumber();
                            if (serialNumber.bitLength() <= 64) {
                                for (pqw pqw : (Set) this.f40084d.get(wrap)) {
                                    if (serialNumber.compareTo(pqw.f40079a) >= 0 && serialNumber.compareTo(pqw.f40080b) <= 0) {
                                        return false;
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                        size--;
                        wrap = wrap2;
                    } else {
                        this.f40081a.mo23346a("Certificate revoked by SPKI hash.");
                        return false;
                    }
                }
                return true;
            }
            throw new IllegalArgumentException("Trusted cert must be present in the trust anchor.");
        } catch (NoSuchAlgorithmException e) {
            this.f40081a.mo23347b("Revocation check failed due to exception");
            return false;
        }
    }
}
