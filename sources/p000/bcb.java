package p000;

import android.graphics.Paint;

/* renamed from: bcb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcb {
    /* renamed from: a */
    public static Paint.Cap m2653a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Paint.Cap.BUTT;
        }
        if (i2 != 1) {
            return Paint.Cap.SQUARE;
        }
        return Paint.Cap.ROUND;
    }

    /* renamed from: a */
    public static int[] m2654a() {
        return new int[]{1, 2, 3};
    }
}
