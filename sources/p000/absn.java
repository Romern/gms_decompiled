package p000;

/* renamed from: absn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class absn extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final absn f58118c;

    /* renamed from: e */
    private static volatile bxxk f58119e;

    /* renamed from: a */
    public String f58120a = "";

    /* renamed from: b */
    public absp f58121b;

    /* renamed from: d */
    private int f58122d;

    static {
        absn absn = new absn();
        f58118c = absn;
        GeneratedMessageLite.m124024a(absn.class, absn);
    }

    private absn() {
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
            return GeneratedMessageLite.m124022a(f58118c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new absn();
        } else {
            if (i2 == 4) {
                return new bxvd(f58118c);
            }
            if (i2 == 5) {
                return f58118c;
            }
            bxxk bxxk = f58119e;
            if (bxxk == null) {
                synchronized (absn.class) {
                    bxxk = f58119e;
                    if (bxxk == null) {
                        bxxk = new bxve(f58118c);
                        f58119e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
