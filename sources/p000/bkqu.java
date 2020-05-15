package p000;

/* renamed from: bkqu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkqu {
    /* renamed from: a */
    public static int m106334a(int i, blgu blgu, blgs blgs, int i2) {
        int i3 = blgu.f126475b;
        int i4 = blgu.f126476c - i3;
        if (i < i3) {
            return i;
        }
        int i5 = i3 + i4;
        if (i >= i5) {
            return i - i4;
        }
        blgs blgs2 = blgs.SHIFT_AFTER_DELETE;
        int ordinal = blgs.ordinal();
        if (ordinal == 0) {
            return i2 + -1 != 0 ? i3 : i5;
        }
        if (ordinal == 1) {
            return i3 - 1;
        }
        if (ordinal == 2) {
            return -1;
        }
        throw new bkrk(blgs);
    }
}
