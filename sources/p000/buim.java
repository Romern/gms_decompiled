package p000;

/* renamed from: buim */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buim extends bxvk implements bxxd {

    /* renamed from: d */
    public static final buim f153954d;

    /* renamed from: e */
    private static volatile bxxk f153955e;

    /* renamed from: a */
    public bxtx f153956a = bxtx.f164797b;

    /* renamed from: b */
    public bxtx f153957b = bxtx.f164797b;

    /* renamed from: c */
    public bxtx f153958c = bxtx.f164797b;

    static {
        buim buim = new buim();
        f153954d = buim;
        bxvk.m124024a(buim.class, buim);
    }

    private buim() {
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
            return bxvk.m124022a(f153954d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002\n\u0003\n", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new buim();
        } else {
            if (i2 == 4) {
                return new bxvd(f153954d);
            }
            if (i2 == 5) {
                return f153954d;
            }
            bxxk bxxk = f153955e;
            if (bxxk == null) {
                synchronized (buim.class) {
                    bxxk = f153955e;
                    if (bxxk == null) {
                        bxxk = new bxve(f153954d);
                        f153955e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
