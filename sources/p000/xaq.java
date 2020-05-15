package p000;

/* renamed from: xaq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xaq extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final xaq f51812d;

    /* renamed from: e */
    private static volatile bxxk f51813e;

    /* renamed from: a */
    public int f51814a;

    /* renamed from: b */
    public int f51815b;

    /* renamed from: c */
    public String f51816c = "";

    static {
        xaq xaq = new xaq();
        f51812d = xaq;
        GeneratedMessageLite.m124024a(xaq.class, xaq);
    }

    private xaq() {
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
            return GeneratedMessageLite.m124022a(f51812d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new xaq();
        } else {
            if (i2 == 4) {
                return new bxvd(f51812d);
            }
            if (i2 == 5) {
                return f51812d;
            }
            bxxk bxxk = f51813e;
            if (bxxk == null) {
                synchronized (xaq.class) {
                    bxxk = f51813e;
                    if (bxxk == null) {
                        bxxk = new bxve(f51812d);
                        f51813e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
