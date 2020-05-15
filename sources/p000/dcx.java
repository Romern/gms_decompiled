package p000;

/* renamed from: dcx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dcx extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final dcx f12900d;

    /* renamed from: e */
    private static volatile bxxk f12901e;

    /* renamed from: a */
    public int f12902a;

    /* renamed from: b */
    public int f12903b;

    /* renamed from: c */
    public dcw f12904c;

    static {
        dcx dcx = new dcx();
        f12900d = dcx;
        GeneratedMessageLite.m124024a(dcx.class, dcx);
    }

    private dcx() {
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
            return GeneratedMessageLite.m124022a(f12900d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", dcz.f12906a, "c"});
        } else if (i2 == 3) {
            return new dcx();
        } else {
            if (i2 == 4) {
                return new bxvd(f12900d);
            }
            if (i2 == 5) {
                return f12900d;
            }
            bxxk bxxk = f12901e;
            if (bxxk == null) {
                synchronized (dcx.class) {
                    bxxk = f12901e;
                    if (bxxk == null) {
                        bxxk = new bxve(f12900d);
                        f12901e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
