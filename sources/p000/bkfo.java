package p000;

import android.animation.TimeInterpolator;

/* renamed from: bkfo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkfo implements TimeInterpolator {

    /* renamed from: a */
    final /* synthetic */ float f124155a;

    public bkfo(float f) {
        this.f124155a = f;
    }

    public final float getInterpolation(float f) {
        double d = (double) f;
        Double.isNaN(d);
        Double.isNaN(d);
        return ((float) Math.sin((d + d) * 3.141592653589793d * 3.0d)) * (1.0f - f) * this.f124155a;
    }
}
