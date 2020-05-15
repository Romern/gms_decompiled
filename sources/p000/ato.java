package p000;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* renamed from: ato */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ato implements TypeEvaluator {

    /* renamed from: a */
    final float[] f2212a = new float[9];

    /* renamed from: b */
    final float[] f2213b = new float[9];

    /* renamed from: c */
    final Matrix f2214c = new Matrix();

    public final /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        ((Matrix) obj).getValues(this.f2212a);
        ((Matrix) obj2).getValues(this.f2213b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f2213b;
            float f2 = fArr[i];
            float f3 = this.f2212a[i];
            fArr[i] = f3 + ((f2 - f3) * f);
        }
        this.f2214c.setValues(this.f2213b);
        return this.f2214c;
    }
}
