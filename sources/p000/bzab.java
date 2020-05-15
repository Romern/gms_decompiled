package p000;

/* renamed from: bzab */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzab extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bzab f169208d;

    /* renamed from: e */
    private static volatile bxxk f169209e;

    /* renamed from: a */
    public int f169210a;

    /* renamed from: b */
    public String f169211b = "";

    /* renamed from: c */
    public bxtx f169212c = bxtx.f164797b;

    static {
        bzab bzab = new bzab();
        f169208d = bzab;
        bxvk.m124024a(bzab.class, bzab);
    }

    private bzab() {
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
            return bxvk.m124022a(f169208d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bzab();
        } else {
            if (i2 == 4) {
                return new bxvd(f169208d);
            }
            if (i2 == 5) {
                return f169208d;
            }
            bxxk bxxk = f169209e;
            if (bxxk == null) {
                synchronized (bzab.class) {
                    bxxk = f169209e;
                    if (bxxk == null) {
                        bxxk = new bxve(f169208d);
                        f169209e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
