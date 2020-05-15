package p000;

/* renamed from: bvpp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvpp extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bvpp f157332d;

    /* renamed from: e */
    private static volatile bxxk f157333e;

    /* renamed from: a */
    public int f157334a;

    /* renamed from: b */
    public String f157335b = "";

    /* renamed from: c */
    public String f157336c = "";

    static {
        bvpp bvpp = new bvpp();
        f157332d = bvpp;
        GeneratedMessageLite.m124024a(bvpp.class, bvpp);
    }

    private bvpp() {
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
            return GeneratedMessageLite.m124022a(f157332d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bvpp();
        } else {
            if (i2 == 4) {
                return new bxvd(f157332d);
            }
            if (i2 == 5) {
                return f157332d;
            }
            bxxk bxxk = f157333e;
            if (bxxk == null) {
                synchronized (bvpp.class) {
                    bxxk = f157333e;
                    if (bxxk == null) {
                        bxxk = new bxve(f157332d);
                        f157333e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
