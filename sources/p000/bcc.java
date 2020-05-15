package p000;

import android.graphics.Paint;

/* renamed from: bcc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcc {
    /* renamed from: a */
    public static Paint.Join m2655a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Paint.Join.MITER;
        }
        if (i2 != 2) {
            return Paint.Join.ROUND;
        }
        return Paint.Join.BEVEL;
    }

    /* renamed from: a */
    public static int[] m2656a() {
        return new int[]{1, 2, 3};
    }
}
