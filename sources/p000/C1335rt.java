package p000;

import android.view.animation.Interpolator;

/* renamed from: rt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1335rt implements Interpolator {
    public final float getInterpolation(float f) {
        float f2 = f - 4.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
