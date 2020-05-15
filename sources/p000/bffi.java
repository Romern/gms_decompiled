package p000;

import android.os.SystemClock;

/* renamed from: bffi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bffi {

    /* renamed from: a */
    public long f113637a = 0;

    /* renamed from: b */
    final /* synthetic */ bffj f113638b;

    /* renamed from: c */
    private long f113639c = SystemClock.elapsedRealtime();

    /* renamed from: d */
    private long f113640d = 200;

    /* renamed from: e */
    private long f113641e = 0;

    public bffi(bffj bffj) {
        this.f113638b = bffj;
        bgmk bgmk = this.f113638b.f113653a;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(long, long):long} */
    /* renamed from: a */
    public final synchronized boolean mo61577a() {
        boolean z;
        long j;
        long j2;
        long j3;
        synchronized (this) {
            bgmk bgmk = this.f113638b.f113653a;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - this.f113641e > this.f113640d) {
                bsax bsax = this.f113638b.f113654b;
                if (bsax != null) {
                    j = (long) bsax.mo70122c();
                } else {
                    j = 0;
                }
                bsax bsax2 = this.f113638b.f113655c;
                if (bsax2 != null) {
                    j2 = (long) bsax2.mo70122c();
                } else {
                    j2 = 0;
                }
                bsax bsax3 = this.f113638b.f113656d;
                if (bsax3 != null) {
                    j3 = (long) bsax3.mo70122c();
                } else {
                    j3 = 0;
                }
                long j4 = j + j2 + j3;
                long j5 = this.f113640d;
                if (j5 >= 100) {
                    long j6 = this.f113637a;
                    long j7 = this.f113641e;
                    double d = (double) (j4 - j6);
                    double d2 = (double) (elapsedRealtime - j7);
                    Double.isNaN(d);
                    Double.isNaN(d2);
                    double d3 = d / d2;
                    if (j7 <= 0 || d3 <= 0.0d || j4 >= 204800) {
                        j5 = 200;
                    } else {
                        double d4 = (double) (204800 - j4);
                        Double.isNaN(d4);
                        double d5 = d4 / d3;
                        j5 = Math.min(2000L, ((long) (d5 + d5)) / 3);
                    }
                }
                this.f113640d = j5;
                this.f113637a = j4;
                this.f113641e = elapsedRealtime;
            }
            z = this.f113637a >= 204800 || elapsedRealtime - this.f113639c > 60000;
        }
        return z;
    }

    /* renamed from: b */
    public final synchronized void mo61578b() {
        bgmk bgmk = this.f113638b.f113653a;
        this.f113639c = SystemClock.elapsedRealtime();
        this.f113640d = 200;
        this.f113637a = 0;
        this.f113641e = 0;
    }
}
