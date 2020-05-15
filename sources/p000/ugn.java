package p000;

import android.os.SystemClock;

/* renamed from: ugn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ugn {

    /* renamed from: a */
    private long f47555a;

    /* renamed from: a */
    public final void mo27346a() {
        this.f47555a = SystemClock.uptimeMillis();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(long, long):long} */
    /* renamed from: b */
    public final int mo27347b() {
        return (int) Math.min(SystemClock.uptimeMillis() - this.f47555a, 2147483647L);
    }
}
