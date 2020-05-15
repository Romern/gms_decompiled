package p000;

/* renamed from: cbnb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbnb extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final cbnb f177710e;

    /* renamed from: f */
    private static volatile bxxk f177711f;

    /* renamed from: a */
    public int f177712a = 0;

    /* renamed from: b */
    public Object f177713b;

    /* renamed from: c */
    public cbmo f177714c;

    /* renamed from: d */
    public int f177715d;

    static {
        cbnb cbnb = new cbnb();
        f177710e = cbnb;
        GeneratedMessageLite.m124024a(cbnb.class, cbnb);
    }

    private cbnb() {
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
            return GeneratedMessageLite.m124022a(f177710e, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002\t\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"b", "a", "d", "c", cbma.class, cbma.class, cbmb.class});
        } else if (i2 == 3) {
            return new cbnb();
        } else {
            if (i2 == 4) {
                return new bxvd(f177710e);
            }
            if (i2 == 5) {
                return f177710e;
            }
            bxxk bxxk = f177711f;
            if (bxxk == null) {
                synchronized (cbnb.class) {
                    bxxk = f177711f;
                    if (bxxk == null) {
                        bxxk = new bxve(f177710e);
                        f177711f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
