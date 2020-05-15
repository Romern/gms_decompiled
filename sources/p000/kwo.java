package p000;

/* renamed from: kwo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kwo extends bxvk implements bxxd {

    /* renamed from: d */
    public static final kwo f25296d;

    /* renamed from: e */
    private static volatile bxxk f25297e;

    /* renamed from: a */
    public int f25298a;

    /* renamed from: b */
    public int f25299b;

    /* renamed from: c */
    public bxvt f25300c = bxvm.f164965b;

    static {
        kwo kwo = new kwo();
        f25296d = kwo;
        bxvk.m124024a(kwo.class, kwo);
    }

    private kwo() {
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
            return bxvk.m124022a(f25296d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0002\u0004\u0003'", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new kwo();
        } else {
            if (i2 == 4) {
                return new bxvd(f25296d);
            }
            if (i2 == 5) {
                return f25296d;
            }
            bxxk bxxk = f25297e;
            if (bxxk == null) {
                synchronized (kwo.class) {
                    bxxk = f25297e;
                    if (bxxk == null) {
                        bxxk = new bxve(f25296d);
                        f25297e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
