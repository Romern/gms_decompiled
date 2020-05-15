package p000;

/* renamed from: byuz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byuz extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final byuz f168401d;

    /* renamed from: f */
    private static volatile bxxk f168402f;

    /* renamed from: a */
    public int f168403a;

    /* renamed from: b */
    public boolean f168404b;

    /* renamed from: c */
    public boolean f168405c;

    /* renamed from: e */
    private int f168406e;

    static {
        byuz byuz = new byuz();
        f168401d = byuz;
        GeneratedMessageLite.m124024a(byuz.class, byuz);
    }

    private byuz() {
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
            return GeneratedMessageLite.m124022a(f168401d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"e", "a", bzbu.m125628b(), "b", "c"});
        } else if (i2 == 3) {
            return new byuz();
        } else {
            if (i2 == 4) {
                return new bxvd(f168401d);
            }
            if (i2 == 5) {
                return f168401d;
            }
            bxxk bxxk = f168402f;
            if (bxxk == null) {
                synchronized (byuz.class) {
                    bxxk = f168402f;
                    if (bxxk == null) {
                        bxxk = new bxve(f168401d);
                        f168402f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
