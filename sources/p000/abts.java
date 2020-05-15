package p000;

/* renamed from: abts */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abts extends bxvk implements bxxd {

    /* renamed from: d */
    public static final abts f58301d;

    /* renamed from: e */
    private static volatile bxxk f58302e;

    /* renamed from: a */
    public int f58303a;

    /* renamed from: b */
    public bxtx f58304b = bxtx.f164797b;

    /* renamed from: c */
    public bxtx f58305c = bxtx.f164797b;

    static {
        abts abts = new abts();
        f58301d = abts;
        bxvk.m124024a(abts.class, abts);
    }

    private abts() {
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
            return bxvk.m124022a(f58301d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new abts();
        } else {
            if (i2 == 4) {
                return new bxvd(f58301d);
            }
            if (i2 == 5) {
                return f58301d;
            }
            bxxk bxxk = f58302e;
            if (bxxk == null) {
                synchronized (abts.class) {
                    bxxk = f58302e;
                    if (bxxk == null) {
                        bxxk = new bxve(f58301d);
                        f58302e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
