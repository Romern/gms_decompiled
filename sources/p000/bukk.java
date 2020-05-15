package p000;

import java.lang.reflect.Array;

/* renamed from: bukk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bukk {

    /* renamed from: a */
    final float[][] f154093a;

    /* renamed from: b */
    final float[] f154094b;

    /* renamed from: c */
    final float[] f154095c;

    public bukk(int i, int i2) {
        int[] iArr = new int[2];
        iArr[1] = i2;
        iArr[0] = i;
        this.f154093a = (float[][]) Array.newInstance(float.class, iArr);
        this.f154094b = new float[i2];
        this.f154095c = new float[i2];
    }
}
