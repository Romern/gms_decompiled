package p000;

import java.security.cert.X509Certificate;
import java.util.concurrent.TimeUnit;

/* renamed from: pqy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pqy {

    /* renamed from: a */
    public final long f40085a;

    /* renamed from: b */
    public final long f40086b;

    public pqy() {
        this.f40085a = Long.MIN_VALUE;
        this.f40086b = Long.MAX_VALUE;
    }

    public pqy(long j, long j2, X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        this.f40085a = Math.max(Math.max(j, TimeUnit.MILLISECONDS.toSeconds(x509Certificate.getNotBefore().getTime())), TimeUnit.MILLISECONDS.toSeconds(x509Certificate2.getNotBefore().getTime()));
        this.f40086b = Math.min(Math.min(j2, TimeUnit.MILLISECONDS.toSeconds(x509Certificate.getNotAfter().getTime())), TimeUnit.MILLISECONDS.toSeconds(x509Certificate2.getNotAfter().getTime()));
    }
}
