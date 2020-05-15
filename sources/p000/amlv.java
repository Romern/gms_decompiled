package p000;

/* renamed from: amlv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amlv extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final amlv f75221d;

    /* renamed from: e */
    private static volatile bxxk f75222e;

    /* renamed from: a */
    public int f75223a;

    /* renamed from: b */
    public int f75224b;

    /* renamed from: c */
    public long f75225c;

    static {
        amlv amlv = new amlv();
        f75221d = amlv;
        GeneratedMessageLite.m124024a(amlv.class, amlv);
    }

    private amlv() {
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
            return GeneratedMessageLite.m124022a(f75221d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", amlu.f75220a, "c"});
        } else if (i2 == 3) {
            return new amlv();
        } else {
            if (i2 == 4) {
                return new bxvd(f75221d);
            }
            if (i2 == 5) {
                return f75221d;
            }
            bxxk bxxk = f75222e;
            if (bxxk == null) {
                synchronized (amlv.class) {
                    bxxk = f75222e;
                    if (bxxk == null) {
                        bxxk = new bxve(f75221d);
                        f75222e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
