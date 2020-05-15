package p000;

/* renamed from: bvly */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvly extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bvly f156620c;

    /* renamed from: e */
    private static volatile bxxk f156621e;

    /* renamed from: a */
    public bvow f156622a;

    /* renamed from: b */
    public bxwc f156623b = bxxn.f165040b;

    /* renamed from: d */
    private int f156624d;

    static {
        bvly bvly = new bvly();
        f156620c = bvly;
        bxvk.m124024a(bvly.class, bvly);
    }

    private bvly() {
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
            return bxvk.m124022a(f156620c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"d", "a", "b", bvof.class});
        } else if (i2 == 3) {
            return new bvly();
        } else {
            if (i2 == 4) {
                return new bxvd(f156620c);
            }
            if (i2 == 5) {
                return f156620c;
            }
            bxxk bxxk = f156621e;
            if (bxxk == null) {
                synchronized (bvly.class) {
                    bxxk = f156621e;
                    if (bxxk == null) {
                        bxxk = new bxve(f156620c);
                        f156621e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
