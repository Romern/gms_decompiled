package p000;

import android.view.animation.Interpolator;

/* renamed from: ake */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class ake implements Interpolator {

    /* renamed from: a */
    private final float[] f757a;

    /* renamed from: b */
    private final float f758b;

    protected ake(float[] fArr) {
        this.f757a = fArr;
        this.f758b = 1.0f / ((float) (fArr.length - 1));
    }

    public final float getInterpolation(float f) {
        float f2 = 1.0f;
        if (f < 1.0f) {
            f2 = 0.0f;
            if (f > 0.0f) {
                int length = this.f757a.length;
                int min = Math.min((int) (((float) (length - 1)) * f), length - 2);
                float f3 = this.f758b;
                float[] fArr = this.f757a;
                float f4 = fArr[min];
                return f4 + (((f - (((float) min) * f3)) / f3) * (fArr[min + 1] - f4));
            }
        }
        return f2;
    }
}
