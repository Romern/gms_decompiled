package p000;

/* renamed from: bzfr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzfr extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bzfr f169857e;

    /* renamed from: f */
    private static volatile bxxk f169858f;

    /* renamed from: a */
    public int f169859a;

    /* renamed from: b */
    public bzfx f169860b;

    /* renamed from: c */
    public bzgf f169861c;

    /* renamed from: d */
    public bzgc f169862d;

    static {
        bzfr bzfr = new bzfr();
        f169857e = bzfr;
        GeneratedMessageLite.m124024a(bzfr.class, bzfr);
    }

    private bzfr() {
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
            return GeneratedMessageLite.m124022a(f169857e, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0002\u0006ဉ\u0005", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bzfr();
        } else {
            if (i2 == 4) {
                return new bxvd(f169857e);
            }
            if (i2 == 5) {
                return f169857e;
            }
            bxxk bxxk = f169858f;
            if (bxxk == null) {
                synchronized (bzfr.class) {
                    bxxk = f169858f;
                    if (bxxk == null) {
                        bxxk = new bxve(f169857e);
                        f169858f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
