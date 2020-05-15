package p000;

/* renamed from: byvv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byvv extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final byvv f168518d;

    /* renamed from: e */
    private static volatile bxxk f168519e;

    /* renamed from: a */
    public int f168520a;

    /* renamed from: b */
    public int f168521b;

    /* renamed from: c */
    public long f168522c;

    static {
        byvv byvv = new byvv();
        f168518d = byvv;
        GeneratedMessageLite.m124024a(byvv.class, byvv);
    }

    private byvv() {
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
            return GeneratedMessageLite.m124022a(f168518d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new byvv();
        } else {
            if (i2 == 4) {
                return new bxvd(f168518d);
            }
            if (i2 == 5) {
                return f168518d;
            }
            bxxk bxxk = f168519e;
            if (bxxk == null) {
                synchronized (byvv.class) {
                    bxxk = f168519e;
                    if (bxxk == null) {
                        bxxk = new bxve(f168518d);
                        f168519e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
