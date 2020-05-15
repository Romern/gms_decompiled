package p000;

/* renamed from: bhct */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhct {
    /* renamed from: a */
    public static float m100646a(int i, int i2) {
        if (i > 0) {
            return ((float) i2) / ((float) i);
        }
        return -1.0f;
    }

    /* renamed from: a */
    public static long m100648a(long j, long j2) {
        if (j2 < 0) {
            if (j <= Long.MIN_VALUE - j2) {
                return Long.MIN_VALUE;
            }
        } else if (j >= Long.MAX_VALUE - j2) {
            return Long.MAX_VALUE;
        }
        return j + j2;
    }

    /* renamed from: a */
    public static long m100647a(double d) {
        double floor = Math.floor(d);
        int i = (Math.random() > (d - floor) ? 1 : (Math.random() == (d - floor) ? 0 : -1));
        long j = (long) floor;
        return i < 0 ? j + 1 : j;
    }
}
