package p000;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: bhdl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhdl {

    /* renamed from: a */
    public static final TimeInterpolator f118327a = new LinearInterpolator();

    /* renamed from: b */
    public static final TimeInterpolator f118328b = new akc();

    /* renamed from: c */
    public static final TimeInterpolator f118329c = new akb();

    /* renamed from: d */
    public static final TimeInterpolator f118330d = new akd();

    /* renamed from: e */
    public static final TimeInterpolator f118331e = new DecelerateInterpolator();

    /* renamed from: a */
    public static float m100675a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: a */
    public static int m100676a(int i, int i2, float f) {
        return i + Math.round(f * ((float) (i2 - i)));
    }
}
