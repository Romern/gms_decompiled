package p000;

/* renamed from: bzfv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzfv extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bzfv f169875e;

    /* renamed from: f */
    private static volatile bxxk f169876f;

    /* renamed from: a */
    public int f169877a;

    /* renamed from: b */
    public String f169878b = "";

    /* renamed from: c */
    public bzfq f169879c;

    /* renamed from: d */
    public String f169880d = "";

    static {
        bzfv bzfv = new bzfv();
        f169875e = bzfv;
        GeneratedMessageLite.m124024a(bzfv.class, bzfv);
    }

    private bzfv() {
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
            return GeneratedMessageLite.m124022a(f169875e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bzfv();
        } else {
            if (i2 == 4) {
                return new bxvd(f169875e);
            }
            if (i2 == 5) {
                return f169875e;
            }
            bxxk bxxk = f169876f;
            if (bxxk == null) {
                synchronized (bzfv.class) {
                    bxxk = f169876f;
                    if (bxxk == null) {
                        bxxk = new bxve(f169875e);
                        f169876f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
