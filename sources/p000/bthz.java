package p000;

/* renamed from: bthz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bthz extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bthz f148923e;

    /* renamed from: f */
    private static volatile bxxk f148924f;

    /* renamed from: a */
    public int f148925a = 0;

    /* renamed from: b */
    public Object f148926b;

    /* renamed from: c */
    public int f148927c;

    /* renamed from: d */
    public bxvt f148928d = bxvm.f164965b;

    static {
        bthz bthz = new bthz();
        f148923e = bthz;
        bxvk.m124024a(bthz.class, bthz);
    }

    private bthz() {
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
            return bxvk.m124022a(f148923e, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001:\u0000\u0002=\u0000\u0003=\u0000\u0004=\u0000\u0005=\u0000\u0006\u0004\u0007'", new Object[]{"b", "a", "c", "d"});
        } else if (i2 == 3) {
            return new bthz();
        } else {
            if (i2 == 4) {
                return new bxvd(f148923e);
            }
            if (i2 == 5) {
                return f148923e;
            }
            bxxk bxxk = f148924f;
            if (bxxk == null) {
                synchronized (bthz.class) {
                    bxxk = f148924f;
                    if (bxxk == null) {
                        bxxk = new bxve(f148923e);
                        f148924f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
