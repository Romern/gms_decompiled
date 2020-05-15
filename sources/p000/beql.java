package p000;

import android.animation.TimeInterpolator;

/* renamed from: beql */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beql implements TimeInterpolator {
    public final float getInterpolation(float f) {
        double exp = Math.exp((double) (-8.0f * f));
        double d = (double) f;
        Double.isNaN(d);
        return (float) ((exp * Math.cos((d * 31.41592653589793d) - 2.858407346410207d)) / 2.0d);
    }
}
