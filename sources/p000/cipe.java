package p000;

/* renamed from: cipe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cipe extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final cipe f191190d;

    /* renamed from: e */
    private static volatile bxxk f191191e;

    /* renamed from: a */
    public int f191192a;

    /* renamed from: b */
    public ciox f191193b;

    /* renamed from: c */
    public int f191194c;

    static {
        cipe cipe = new cipe();
        f191190d = cipe;
        GeneratedMessageLite.m124024a(cipe.class, cipe);
    }

    private cipe() {
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
            return GeneratedMessageLite.m124022a(f191190d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\t\u0003\f", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new cipe();
        } else {
            if (i2 == 4) {
                return new bxvd(f191190d);
            }
            if (i2 == 5) {
                return f191190d;
            }
            bxxk bxxk = f191191e;
            if (bxxk == null) {
                synchronized (cipe.class) {
                    bxxk = f191191e;
                    if (bxxk == null) {
                        bxxk = new bxve(f191190d);
                        f191191e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
