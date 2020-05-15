package p000;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* renamed from: bhdo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bhdo implements TypeEvaluator {

    /* renamed from: a */
    private final float[] f118333a = new float[9];

    /* renamed from: b */
    private final float[] f118334b = new float[9];

    /* renamed from: c */
    private final Matrix f118335c = new Matrix();

    /* renamed from: a */
    public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f118333a);
        matrix2.getValues(this.f118334b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f118334b;
            float f2 = fArr[i];
            float f3 = this.f118333a[i];
            fArr[i] = f3 + ((f2 - f3) * f);
        }
        this.f118335c.setValues(this.f118334b);
        return this.f118335c;
    }
}
