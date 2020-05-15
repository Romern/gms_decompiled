package p000;

/* renamed from: aylx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aylx extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final aylx f97942d;

    /* renamed from: e */
    private static volatile bxxk f97943e;

    /* renamed from: a */
    public int f97944a;

    /* renamed from: b */
    public String f97945b = "";

    /* renamed from: c */
    public int f97946c;

    static {
        aylx aylx = new aylx();
        f97942d = aylx;
        GeneratedMessageLite.m124024a(aylx.class, aylx);
    }

    private aylx() {
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
            return GeneratedMessageLite.m124022a(f97942d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", aylt.f97931a});
        } else if (i2 == 3) {
            return new aylx();
        } else {
            if (i2 == 4) {
                return new bxvd(f97942d);
            }
            if (i2 == 5) {
                return f97942d;
            }
            bxxk bxxk = f97943e;
            if (bxxk == null) {
                synchronized (aylx.class) {
                    bxxk = f97943e;
                    if (bxxk == null) {
                        bxxk = new bxve(f97942d);
                        f97943e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
