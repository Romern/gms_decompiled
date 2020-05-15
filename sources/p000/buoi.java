package p000;

/* renamed from: buoi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buoi extends bxvk implements bxxd {

    /* renamed from: i */
    public static final buoi f154527i;

    /* renamed from: j */
    private static volatile bxxk f154528j;

    /* renamed from: a */
    public long f154529a;

    /* renamed from: b */
    public int f154530b;

    /* renamed from: c */
    public bxun f154531c;

    /* renamed from: d */
    public bxun f154532d;

    /* renamed from: e */
    public buop f154533e;

    /* renamed from: f */
    public buoh f154534f;

    /* renamed from: g */
    public buov f154535g;

    /* renamed from: h */
    public bxun f154536h;

    static {
        buoi buoi = new buoi();
        f154527i = buoi;
        bxvk.m124024a(buoi.class, buoi);
    }

    private buoi() {
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
            return bxvk.m124022a(f154527i, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0002\u0002\u0004\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t\b\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new buoi();
        } else {
            if (i2 == 4) {
                return new bxvd(f154527i);
            }
            if (i2 == 5) {
                return f154527i;
            }
            bxxk bxxk = f154528j;
            if (bxxk == null) {
                synchronized (buoi.class) {
                    bxxk = f154528j;
                    if (bxxk == null) {
                        bxxk = new bxve(f154527i);
                        f154528j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
