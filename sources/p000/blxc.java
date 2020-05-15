package p000;

/* renamed from: blxc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blxc extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final blxc f128037e;

    /* renamed from: f */
    private static volatile bxxk f128038f;

    /* renamed from: a */
    public int f128039a;

    /* renamed from: b */
    public int f128040b;

    /* renamed from: c */
    public int f128041c;

    /* renamed from: d */
    public int f128042d;

    static {
        blxc blxc = new blxc();
        f128037e = blxc;
        GeneratedMessageLite.m124024a(blxc.class, blxc);
    }

    private blxc() {
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
            return GeneratedMessageLite.m124022a(f128037e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new blxc();
        } else {
            if (i2 == 4) {
                return new bxvd(f128037e);
            }
            if (i2 == 5) {
                return f128037e;
            }
            bxxk bxxk = f128038f;
            if (bxxk == null) {
                synchronized (blxc.class) {
                    bxxk = f128038f;
                    if (bxxk == null) {
                        bxxk = new bxve(f128037e);
                        f128038f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
