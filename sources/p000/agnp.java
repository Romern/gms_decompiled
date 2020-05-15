package p000;

/* renamed from: agnp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agnp extends bxvk implements bxxd {

    /* renamed from: d */
    public static final agnp f66140d;

    /* renamed from: e */
    private static volatile bxxk f66141e;

    /* renamed from: a */
    public int f66142a;

    /* renamed from: b */
    public int f66143b;

    /* renamed from: c */
    public bxvw f66144c = bxwq.f165002b;

    static {
        agnp agnp = new agnp();
        f66140d = agnp;
        bxvk.m124024a(agnp.class, agnp);
    }

    private agnp() {
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
            return bxvk.m124022a(f66140d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new agnp();
        } else {
            if (i2 == 4) {
                return new bxvd((char[]) null, (float[][][]) null);
            }
            if (i2 == 5) {
                return f66140d;
            }
            bxxk bxxk = f66141e;
            if (bxxk == null) {
                synchronized (agnp.class) {
                    bxxk = f66141e;
                    if (bxxk == null) {
                        bxxk = new bxve(f66140d);
                        f66141e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
