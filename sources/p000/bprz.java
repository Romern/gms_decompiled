package p000;

/* renamed from: bprz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bprz extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bprz f138920d;

    /* renamed from: e */
    private static volatile bxxk f138921e;

    /* renamed from: a */
    public int f138922a;

    /* renamed from: b */
    public long f138923b;

    /* renamed from: c */
    public int f138924c;

    static {
        bprz bprz = new bprz();
        f138920d = bprz;
        GeneratedMessageLite.m124024a(bprz.class, bprz);
    }

    private bprz() {
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
            return GeneratedMessageLite.m124022a(f138920d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဏ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bprz();
        } else {
            if (i2 == 4) {
                return new bxvd(f138920d);
            }
            if (i2 == 5) {
                return f138920d;
            }
            bxxk bxxk = f138921e;
            if (bxxk == null) {
                synchronized (bprz.class) {
                    bxxk = f138921e;
                    if (bxxk == null) {
                        bxxk = new bxve(f138920d);
                        f138921e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
