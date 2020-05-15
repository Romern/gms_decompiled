package p000;

/* renamed from: bzwn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzwn extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bzwn f171653d;

    /* renamed from: e */
    private static volatile bxxk f171654e;

    /* renamed from: a */
    public int f171655a;

    /* renamed from: b */
    public bzwl f171656b;

    /* renamed from: c */
    public bzvu f171657c;

    static {
        bzwn bzwn = new bzwn();
        f171653d = bzwn;
        GeneratedMessageLite.m124024a(bzwn.class, bzwn);
    }

    private bzwn() {
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
            return GeneratedMessageLite.m124022a(f171653d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bzwn();
        } else {
            if (i2 == 4) {
                return new bxvd(f171653d);
            }
            if (i2 == 5) {
                return f171653d;
            }
            bxxk bxxk = f171654e;
            if (bxxk == null) {
                synchronized (bzwn.class) {
                    bxxk = f171654e;
                    if (bxxk == null) {
                        bxxk = new bxve(f171653d);
                        f171654e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
