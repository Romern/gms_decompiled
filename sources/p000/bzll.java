package p000;

/* renamed from: bzll */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzll extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bzll f170540d;

    /* renamed from: e */
    private static volatile bxxk f170541e;

    /* renamed from: a */
    public int f170542a;

    /* renamed from: b */
    public int f170543b;

    /* renamed from: c */
    public long f170544c;

    static {
        bzll bzll = new bzll();
        f170540d = bzll;
        GeneratedMessageLite.m124024a(bzll.class, bzll);
    }

    private bzll() {
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
            return GeneratedMessageLite.m124022a(f170540d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", bzlj.f170539a, "c"});
        } else if (i2 == 3) {
            return new bzll();
        } else {
            if (i2 == 4) {
                return new bxvd(f170540d);
            }
            if (i2 == 5) {
                return f170540d;
            }
            bxxk bxxk = f170541e;
            if (bxxk == null) {
                synchronized (bzll.class) {
                    bxxk = f170541e;
                    if (bxxk == null) {
                        bxxk = new bxve(f170540d);
                        f170541e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
