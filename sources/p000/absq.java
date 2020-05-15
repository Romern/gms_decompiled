package p000;

/* renamed from: absq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class absq extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final absq f58129c;

    /* renamed from: e */
    private static volatile bxxk f58130e;

    /* renamed from: a */
    public long f58131a;

    /* renamed from: b */
    public long f58132b;

    /* renamed from: d */
    private int f58133d;

    static {
        absq absq = new absq();
        f58129c = absq;
        GeneratedMessageLite.m124024a(absq.class, absq);
    }

    private absq() {
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
            return GeneratedMessageLite.m124022a(f58129c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဃ\u0000\u0003ဂ\u0002", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new absq();
        } else {
            if (i2 == 4) {
                return new bxvd(f58129c);
            }
            if (i2 == 5) {
                return f58129c;
            }
            bxxk bxxk = f58130e;
            if (bxxk == null) {
                synchronized (absq.class) {
                    bxxk = f58130e;
                    if (bxxk == null) {
                        bxxk = new bxve(f58129c);
                        f58130e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
