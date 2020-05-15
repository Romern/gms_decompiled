package p000;

import android.os.SystemClock;

/* renamed from: bgtj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgtj implements bgtk {

    /* renamed from: a */
    private final long f117493a;

    /* renamed from: b */
    private int f117494b;

    /* renamed from: c */
    private long f117495c;

    public bgtj(long j) {
        this.f117493a = j;
        this.f117495c = -j;
    }

    /* renamed from: b */
    public final long mo63144b(Runnable runnable) {
        long a = mo63142a();
        if (a > 0) {
            return a;
        }
        if (!mo63143a(runnable)) {
            return mo63142a();
        }
        return 0;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* renamed from: a */
    public final long mo63142a() {
        return Math.max(0L, (this.f117493a - (SystemClock.elapsedRealtime() - this.f117495c)) / 1000);
    }

    /* renamed from: a */
    public final boolean mo63143a(Runnable runnable) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f117495c < this.f117493a) {
            this.f117494b++;
            return false;
        }
        this.f117495c = elapsedRealtime;
        runnable.run();
        return true;
    }
}
