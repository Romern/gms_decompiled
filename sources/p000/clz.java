package p000;

/* renamed from: clz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class clz extends cmb {
    /* renamed from: a */
    public final float mo3966a(int i, int i2, int i3, int i4) {
        if (f7046g) {
            return Math.min(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
        }
        int max = Math.max(i2 / i4, i / i3);
        if (max != 0) {
            return 1.0f / ((float) Integer.highestOneBit(max));
        }
        return 1.0f;
    }

    /* renamed from: b */
    public final int mo3967b(int i, int i2, int i3, int i4) {
        return f7046g ? 2 : 1;
    }
}
