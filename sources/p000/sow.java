package p000;

import android.view.animation.AccelerateDecelerateInterpolator;

/* renamed from: sow */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class sow extends AccelerateDecelerateInterpolator {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(float, float):float}
     arg types: [int, float]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(long, long):long}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(float, float):float} */
    public final float getInterpolation(float f) {
        return super.getInterpolation(Math.min(1.0f, f + f));
    }
}
