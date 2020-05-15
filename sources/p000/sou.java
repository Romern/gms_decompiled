package p000;

import android.view.animation.AccelerateDecelerateInterpolator;

/* renamed from: sou */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class sou extends AccelerateDecelerateInterpolator {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(float, float):float}
     arg types: [int, float]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(long, long):long}
      ClspMth{java.lang.Math.max(float, float):float} */
    public final float getInterpolation(float f) {
        float f2 = f - 8.0f;
        return super.getInterpolation(Math.max(0.0f, f2 + f2));
    }
}
