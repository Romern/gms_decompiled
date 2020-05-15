package p000;

/* renamed from: bzlf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzlf extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bzlf f170517e;

    /* renamed from: f */
    private static volatile bxxk f170518f;

    /* renamed from: a */
    public int f170519a;

    /* renamed from: b */
    public bzlb f170520b;

    /* renamed from: c */
    public bzla f170521c;

    /* renamed from: d */
    public bzlc f170522d;

    static {
        bzlf bzlf = new bzlf();
        f170517e = bzlf;
        GeneratedMessageLite.m124024a(bzlf.class, bzlf);
    }

    private bzlf() {
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
            return GeneratedMessageLite.m124022a(f170517e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bzlf();
        } else {
            if (i2 == 4) {
                return new bxvd(f170517e);
            }
            if (i2 == 5) {
                return f170517e;
            }
            bxxk bxxk = f170518f;
            if (bxxk == null) {
                synchronized (bzlf.class) {
                    bxxk = f170518f;
                    if (bxxk == null) {
                        bxxk = new bxve(f170517e);
                        f170518f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
