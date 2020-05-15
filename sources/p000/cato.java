package p000;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Map;

/* renamed from: cato */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cato {

    /* renamed from: a */
    public static final cato f175853a = new cato(new catn());

    /* renamed from: b */
    public final Map f175854b;

    public cato(catn catn) {
        this.f175854b = cavk.m127308a(catn.f175852a);
    }

    /* renamed from: a */
    public static cipx m127181a(X509Certificate x509Certificate) {
        return cavk.m127303a(cipx.m150786a(x509Certificate.getPublicKey().getEncoded()));
    }

    /* renamed from: a */
    public static String m127182a(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            String valueOf = String.valueOf(m127181a((X509Certificate) certificate).mo86341b());
            return valueOf.length() == 0 ? new String("sha1/") : "sha1/".concat(valueOf);
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }
}
