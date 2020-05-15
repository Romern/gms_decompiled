package p000;

/* renamed from: bzob */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzob extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bzob f170788d;

    /* renamed from: e */
    private static volatile bxxk f170789e;

    /* renamed from: a */
    public String f170790a = "";

    /* renamed from: b */
    public bxyk f170791b;

    /* renamed from: c */
    public long f170792c;

    static {
        bzob bzob = new bzob();
        f170788d = bzob;
        GeneratedMessageLite.m124024a(bzob.class, bzob);
    }

    private bzob() {
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
            return GeneratedMessageLite.m124022a(f170788d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003\u0002", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bzob();
        } else {
            if (i2 == 4) {
                return new bxvd(f170788d);
            }
            if (i2 == 5) {
                return f170788d;
            }
            bxxk bxxk = f170789e;
            if (bxxk == null) {
                synchronized (bzob.class) {
                    bxxk = f170789e;
                    if (bxxk == null) {
                        bxxk = new bxve(f170788d);
                        f170789e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
