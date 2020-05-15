package p000;

import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* renamed from: caua */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caua {

    /* renamed from: a */
    public final String f175976a;

    /* renamed from: b */
    public final List f175977b;

    /* renamed from: c */
    public final List f175978c;

    private caua(String str, List list, List list2) {
        this.f175976a = str;
        this.f175977b = list;
        this.f175978c = list2;
    }

    /* renamed from: a */
    public static caua m127195a(SSLSession sSLSession) {
        Certificate[] certificateArr;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite != null) {
            try {
                certificateArr = sSLSession.getPeerCertificates();
            } catch (SSLPeerUnverifiedException e) {
                certificateArr = null;
            }
            List emptyList = certificateArr == null ? Collections.emptyList() : cavk.m127307a(certificateArr);
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            return new caua(cipherSuite, emptyList, localCertificates != null ? cavk.m127307a(localCertificates) : Collections.emptyList());
        }
        throw new IllegalStateException("cipherSuite == null");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof caua) {
            caua caua = (caua) obj;
            return this.f175976a.equals(caua.f175976a) && this.f175977b.equals(caua.f175977b) && this.f175978c.equals(caua.f175978c);
        }
    }

    public final int hashCode() {
        return ((((this.f175976a.hashCode() + 527) * 31) + this.f175977b.hashCode()) * 31) + this.f175978c.hashCode();
    }
}
