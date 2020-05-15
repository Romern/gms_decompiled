package p000;

import android.view.animation.Interpolator;

/* renamed from: bkdk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkdk implements Interpolator {

    /* renamed from: a */
    private final float f124044a;

    /* renamed from: b */
    private final float f124045b;

    /* renamed from: c */
    private final Interpolator f124046c;

    public bkdk(Interpolator interpolator, float f) {
        this.f124044a = f;
        this.f124046c = interpolator;
        this.f124045b = 1.0f - (f * 0.5f);
    }

    public final float getInterpolation(float f) {
        float interpolation = this.f124046c.getInterpolation(f);
        float f2 = this.f124045b;
        double d = (double) f;
        Double.isNaN(d);
        return (interpolation * f2) + (this.f124044a * ((f * 0.5f) + (((float) Math.sin(d * 3.141592653589793d)) * 0.15915494f)));
    }
}
