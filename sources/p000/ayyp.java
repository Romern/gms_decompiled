package p000;

/* renamed from: ayyp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayyp extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final ayyp f98751c;

    /* renamed from: d */
    private static volatile bxxk f98752d;

    /* renamed from: a */
    public int f98753a;

    /* renamed from: b */
    public long f98754b;

    static {
        ayyp ayyp = new ayyp();
        f98751c = ayyp;
        GeneratedMessageLite.m124024a(ayyp.class, ayyp);
    }

    private ayyp() {
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
            return GeneratedMessageLite.m124022a(f98751c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new ayyp();
        } else {
            if (i2 == 4) {
                return new bxvd(f98751c);
            }
            if (i2 == 5) {
                return f98751c;
            }
            bxxk bxxk = f98752d;
            if (bxxk == null) {
                synchronized (ayyp.class) {
                    bxxk = f98752d;
                    if (bxxk == null) {
                        bxxk = new bxve(f98751c);
                        f98752d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
