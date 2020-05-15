package p000;

/* renamed from: bmei */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmei extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bmei f128941d;

    /* renamed from: e */
    private static volatile bxxk f128942e;

    /* renamed from: a */
    public int f128943a;

    /* renamed from: b */
    public bmej f128944b;

    /* renamed from: c */
    public bmeh f128945c;

    static {
        bmei bmei = new bmei();
        f128941d = bmei;
        GeneratedMessageLite.m124024a(bmei.class, bmei);
    }

    private bmei() {
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
            return GeneratedMessageLite.m124022a(f128941d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0001\u0002ဉ\u0002", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bmei();
        } else {
            if (i2 == 4) {
                return new bxvd(f128941d);
            }
            if (i2 == 5) {
                return f128941d;
            }
            bxxk bxxk = f128942e;
            if (bxxk == null) {
                synchronized (bmei.class) {
                    bxxk = f128942e;
                    if (bxxk == null) {
                        bxxk = new bxve(f128941d);
                        f128942e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
