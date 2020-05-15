package p000;

import android.util.Log;

/* renamed from: rvu */
final /* synthetic */ class rvu implements Runnable {

    /* renamed from: a */
    private final long f43779a;

    /* renamed from: b */
    private final rvl f43780b;

    public rvu(long j, rvl rvl) {
        this.f43779a = j;
        this.f43780b = rvl;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    public final void run() {
        long j = this.f43779a;
        rvl rvl = this.f43780b;
        try {
            Thread.sleep(Math.max(0L, j));
        } catch (InterruptedException e) {
            Log.e("RestartUtil", "Interrupted.", e);
        }
        rvw.m34543a(rvl);
    }
}
