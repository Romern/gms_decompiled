package p000;

/* renamed from: buoq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buoq extends bxvk implements bxxd {

    /* renamed from: d */
    public static final buoq f154571d;

    /* renamed from: e */
    private static volatile bxxk f154572e;

    /* renamed from: a */
    public buot f154573a;

    /* renamed from: b */
    public buov f154574b;

    /* renamed from: c */
    public buoi f154575c;

    static {
        buoq buoq = new buoq();
        f154571d = buoq;
        bxvk.m124024a(buoq.class, buoq);
    }

    private buoq() {
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
            return bxvk.m124022a(f154571d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new buoq();
        } else {
            if (i2 == 4) {
                return new bxvd(f154571d);
            }
            if (i2 == 5) {
                return f154571d;
            }
            bxxk bxxk = f154572e;
            if (bxxk == null) {
                synchronized (buoq.class) {
                    bxxk = f154572e;
                    if (bxxk == null) {
                        bxxk = new bxve(f154571d);
                        f154572e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
