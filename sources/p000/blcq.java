package p000;

/* renamed from: blcq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blcq extends bxvk implements bxxd {

    /* renamed from: b */
    public static final blcq f125965b;

    /* renamed from: d */
    private static volatile bxxk f125966d;

    /* renamed from: a */
    public blcp f125967a;

    /* renamed from: c */
    private int f125968c;

    static {
        blcq blcq = new blcq();
        f125965b = blcq;
        bxvk.m124024a(blcq.class, blcq);
    }

    private blcq() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return bxvk.m124022a(f125965b, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဉ\u0003", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new blcq();
        } else {
            if (i2 == 4) {
                return new bxvd(f125965b);
            }
            if (i2 == 5) {
                return f125965b;
            }
            bxxk bxxk = f125966d;
            if (bxxk == null) {
                synchronized (blcq.class) {
                    bxxk = f125966d;
                    if (bxxk == null) {
                        bxxk = new bxve(f125965b);
                        f125966d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
