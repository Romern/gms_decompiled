package p000;

/* renamed from: bunb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bunb extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bunb f154300d;

    /* renamed from: e */
    private static volatile bxxk f154301e;

    /* renamed from: a */
    public int f154302a;

    /* renamed from: b */
    public int f154303b;

    /* renamed from: c */
    public int f154304c;

    static {
        bunb bunb = new bunb();
        f154300d = bunb;
        GeneratedMessageLite.m124024a(bunb.class, bunb);
    }

    private bunb() {
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
            return GeneratedMessageLite.m124022a(f154300d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bunb();
        } else {
            if (i2 == 4) {
                return new bxvd(f154300d);
            }
            if (i2 == 5) {
                return f154300d;
            }
            bxxk bxxk = f154301e;
            if (bxxk == null) {
                synchronized (bunb.class) {
                    bxxk = f154301e;
                    if (bxxk == null) {
                        bxxk = new bxve(f154300d);
                        f154301e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
