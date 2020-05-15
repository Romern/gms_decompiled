package p000;

/* renamed from: bxpp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxpp extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bxpp f164297d;

    /* renamed from: e */
    private static volatile bxxk f164298e;

    /* renamed from: a */
    public int f164299a;

    /* renamed from: b */
    public String f164300b = "";

    /* renamed from: c */
    public int f164301c;

    static {
        bxpp bxpp = new bxpp();
        f164297d = bxpp;
        GeneratedMessageLite.m124024a(bxpp.class, bxpp);
    }

    private bxpp() {
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
            return GeneratedMessageLite.m124022a(f164297d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bxpp();
        } else {
            if (i2 == 4) {
                return new bxvd(f164297d);
            }
            if (i2 == 5) {
                return f164297d;
            }
            bxxk bxxk = f164298e;
            if (bxxk == null) {
                synchronized (bxpp.class) {
                    bxxk = f164298e;
                    if (bxxk == null) {
                        bxxk = new bxve(f164297d);
                        f164298e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
