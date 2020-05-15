package p000;

/* renamed from: ayuh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayuh extends bxvk implements bxxd {

    /* renamed from: c */
    public static final ayuh f98521c;

    /* renamed from: d */
    private static volatile bxxk f98522d;

    /* renamed from: a */
    public int f98523a;

    /* renamed from: b */
    public bxtx f98524b = bxtx.f164797b;

    static {
        ayuh ayuh = new ayuh();
        f98521c = ayuh;
        bxvk.m124024a(ayuh.class, ayuh);
    }

    private ayuh() {
        bxtx bxtx = bxtx.f164797b;
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
            return bxvk.m124022a(f98521c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ည\u0001", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new ayuh();
        } else {
            if (i2 == 4) {
                return new bxvd(f98521c);
            }
            if (i2 == 5) {
                return f98521c;
            }
            bxxk bxxk = f98522d;
            if (bxxk == null) {
                synchronized (ayuh.class) {
                    bxxk = f98522d;
                    if (bxxk == null) {
                        bxxk = new bxve(f98521c);
                        f98522d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
