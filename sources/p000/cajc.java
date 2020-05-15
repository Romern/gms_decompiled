package p000;

/* renamed from: cajc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cajc extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final cajc f174803d;

    /* renamed from: e */
    private static volatile bxxk f174804e;

    /* renamed from: a */
    public int f174805a;

    /* renamed from: b */
    public int f174806b;

    /* renamed from: c */
    public int f174807c;

    static {
        cajc cajc = new cajc();
        f174803d = cajc;
        GeneratedMessageLite.m124024a(cajc.class, cajc);
    }

    private cajc() {
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
            return GeneratedMessageLite.m124022a(f174803d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"a", "b", cajb.f174802a, "c"});
        } else if (i2 == 3) {
            return new cajc();
        } else {
            if (i2 == 4) {
                return new bxvd(f174803d);
            }
            if (i2 == 5) {
                return f174803d;
            }
            bxxk bxxk = f174804e;
            if (bxxk == null) {
                synchronized (cajc.class) {
                    bxxk = f174804e;
                    if (bxxk == null) {
                        bxxk = new bxve(f174803d);
                        f174804e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
