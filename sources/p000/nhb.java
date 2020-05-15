package p000;

import android.os.SystemClock;

/* renamed from: nhb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nhb {

    /* renamed from: a */
    public double f35558a;

    /* renamed from: b */
    private long f35559b;

    /* renamed from: c */
    private long f35560c;

    /* renamed from: a */
    public final void mo20636a() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f35560c;
        if (j > 0) {
            long j2 = this.f35559b;
            double d = this.f35558a;
            double d2 = (double) (elapsedRealtime - j2);
            double d3 = (double) j;
            Double.isNaN(d2);
            Double.isNaN(d3);
            this.f35558a = d + (d2 / d3);
        }
        this.f35559b = elapsedRealtime;
    }

    /* renamed from: a */
    public final void mo20637a(long j) {
        mo20636a();
        this.f35560c = j;
    }
}
