package p000;

/* renamed from: abtr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abtr extends bxvk implements bxxd {

    /* renamed from: d */
    public static final abtr f58296d;

    /* renamed from: e */
    private static volatile bxxk f58297e;

    /* renamed from: a */
    public int f58298a;

    /* renamed from: b */
    public bxtx f58299b = bxtx.f164797b;

    /* renamed from: c */
    public bxtx f58300c = bxtx.f164797b;

    static {
        abtr abtr = new abtr();
        f58296d = abtr;
        bxvk.m124024a(abtr.class, abtr);
    }

    private abtr() {
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
            return bxvk.m124022a(f58296d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new abtr();
        } else {
            if (i2 == 4) {
                return new bxvd(f58296d);
            }
            if (i2 == 5) {
                return f58296d;
            }
            bxxk bxxk = f58297e;
            if (bxxk == null) {
                synchronized (abtr.class) {
                    bxxk = f58297e;
                    if (bxxk == null) {
                        bxxk = new bxve(f58296d);
                        f58297e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
