package p000;

/* renamed from: bmhr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmhr extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bmhr f129473e;

    /* renamed from: g */
    private static volatile bxxk f129474g;

    /* renamed from: a */
    public int f129475a;

    /* renamed from: b */
    public long f129476b;

    /* renamed from: c */
    public bxvw f129477c = bxwq.f165002b;

    /* renamed from: d */
    public bxvt f129478d = bxvm.f164965b;

    /* renamed from: f */
    private int f129479f;

    static {
        bmhr bmhr = new bmhr();
        f129473e = bmhr;
        bxvk.m124024a(bmhr.class, bmhr);
    }

    private bmhr() {
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
            return bxvk.m124022a(f129473e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001င\u0000\u0002ဂ\u0001\u0003%\u0004'", new Object[]{"f", "a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bmhr();
        } else {
            if (i2 == 4) {
                return new bxvd(f129473e);
            }
            if (i2 == 5) {
                return f129473e;
            }
            bxxk bxxk = f129474g;
            if (bxxk == null) {
                synchronized (bmhr.class) {
                    bxxk = f129474g;
                    if (bxxk == null) {
                        bxxk = new bxve(f129473e);
                        f129474g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
