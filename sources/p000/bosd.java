package p000;

/* renamed from: bosd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bosd extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bosd f134560h;

    /* renamed from: i */
    private static volatile bxxk f134561i;

    /* renamed from: a */
    public int f134562a;

    /* renamed from: b */
    public int f134563b;

    /* renamed from: c */
    public int f134564c;

    /* renamed from: d */
    public int f134565d;

    /* renamed from: e */
    public int f134566e;

    /* renamed from: f */
    public int f134567f;

    /* renamed from: g */
    public int f134568g;

    static {
        bosd bosd = new bosd();
        f134560h = bosd;
        GeneratedMessageLite.m124024a(bosd.class, bosd);
    }

    private bosd() {
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
            return GeneratedMessageLite.m124022a(f134560h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bosd();
        } else {
            if (i2 == 4) {
                return new bxvd(f134560h);
            }
            if (i2 == 5) {
                return f134560h;
            }
            bxxk bxxk = f134561i;
            if (bxxk == null) {
                synchronized (bosd.class) {
                    bxxk = f134561i;
                    if (bxxk == null) {
                        bxxk = new bxve(f134560h);
                        f134561i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
