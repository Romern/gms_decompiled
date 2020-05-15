package p000;

/* renamed from: bzgf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzgf extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bzgf f169924e;

    /* renamed from: f */
    private static volatile bxxk f169925f;

    /* renamed from: a */
    public int f169926a;

    /* renamed from: b */
    public bzgh f169927b;

    /* renamed from: c */
    public bzfg f169928c;

    /* renamed from: d */
    public bzgk f169929d;

    static {
        bzgf bzgf = new bzgf();
        f169924e = bzgf;
        GeneratedMessageLite.m124024a(bzgf.class, bzgf);
    }

    private bzgf() {
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
            return GeneratedMessageLite.m124022a(f169924e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0004ဉ\u0003", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bzgf();
        } else {
            if (i2 == 4) {
                return new bxvd(f169924e);
            }
            if (i2 == 5) {
                return f169924e;
            }
            bxxk bxxk = f169925f;
            if (bxxk == null) {
                synchronized (bzgf.class) {
                    bxxk = f169925f;
                    if (bxxk == null) {
                        bxxk = new bxve(f169924e);
                        f169925f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
