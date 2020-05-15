package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: chxj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class chxj implements Runnable {

    /* renamed from: a */
    final /* synthetic */ long f189456a;

    /* renamed from: b */
    final /* synthetic */ chqr f189457b;

    /* renamed from: c */
    final /* synthetic */ chxr f189458c;

    public chxj(chxr chxr, long j, chqr chqr) {
        this.f189458c = chxr;
        this.f189456a = j;
        this.f189457b = chqr;
    }

    public final void run() {
        chxr chxr = this.f189458c;
        long j = this.f189456a;
        ciao ciao = new ciao();
        chxr.f189480f.mo85761a(ciao);
        long abs = Math.abs(j) / TimeUnit.SECONDS.toNanos(1);
        long abs2 = Math.abs(j) % TimeUnit.SECONDS.toNanos(1);
        StringBuilder sb = new StringBuilder();
        sb.append("deadline exceeded after ");
        if (j < 0) {
            sb.append('-');
        }
        sb.append(abs);
        sb.append(String.format(".%09d", Long.valueOf(abs2)));
        sb.append("s. ");
        sb.append(ciao);
        this.f189458c.mo85801a(chuv.f189219f.mo85690b(sb.toString()), this.f189457b);
    }
}
