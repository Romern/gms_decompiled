package p000;

/* renamed from: cimf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cimf extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final cimf f190703d;

    /* renamed from: e */
    private static volatile bxxk f190704e;

    /* renamed from: a */
    public int f190705a;

    /* renamed from: b */
    public int f190706b;

    /* renamed from: c */
    public bxun f190707c;

    static {
        cimf cimf = new cimf();
        f190703d = cimf;
        GeneratedMessageLite.m124024a(cimf.class, cimf);
    }

    private cimf() {
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
            return GeneratedMessageLite.m124022a(f190703d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဉ\u0002", new Object[]{"a", "b", cimc.f190700a, "c"});
        } else if (i2 == 3) {
            return new cimf();
        } else {
            if (i2 == 4) {
                return new bxvd(f190703d);
            }
            if (i2 == 5) {
                return f190703d;
            }
            bxxk bxxk = f190704e;
            if (bxxk == null) {
                synchronized (cimf.class) {
                    bxxk = f190704e;
                    if (bxxk == null) {
                        bxxk = new bxve(f190703d);
                        f190704e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
