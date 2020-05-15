package p000;

/* renamed from: asif */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asif extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final asif f89005g;

    /* renamed from: i */
    private static volatile bxxk f89006i;

    /* renamed from: a */
    public String f89007a = "";

    /* renamed from: b */
    public int f89008b;

    /* renamed from: c */
    public int f89009c;

    /* renamed from: d */
    public int f89010d;

    /* renamed from: e */
    public int f89011e;

    /* renamed from: f */
    public int f89012f;

    /* renamed from: h */
    private int f89013h;

    static {
        asif asif = new asif();
        f89005g = asif;
        GeneratedMessageLite.m124024a(asif.class, asif);
    }

    private asif() {
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
            return GeneratedMessageLite.m124022a(f89005g, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"h", "a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new asif();
        } else {
            if (i2 == 4) {
                return new bxvd(f89005g);
            }
            if (i2 == 5) {
                return f89005g;
            }
            bxxk bxxk = f89006i;
            if (bxxk == null) {
                synchronized (asif.class) {
                    bxxk = f89006i;
                    if (bxxk == null) {
                        bxxk = new bxve(f89005g);
                        f89006i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
