package p000;

/* renamed from: absz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class absz extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final absz f58185b;

    /* renamed from: d */
    private static volatile bxxk f58186d;

    /* renamed from: a */
    public long f58187a;

    /* renamed from: c */
    private int f58188c;

    static {
        absz absz = new absz();
        f58185b = absz;
        GeneratedMessageLite.m124024a(absz.class, absz);
    }

    private absz() {
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
            return GeneratedMessageLite.m124022a(f58185b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new absz();
        } else {
            if (i2 == 4) {
                return new bxvd(f58185b);
            }
            if (i2 == 5) {
                return f58185b;
            }
            bxxk bxxk = f58186d;
            if (bxxk == null) {
                synchronized (absz.class) {
                    bxxk = f58186d;
                    if (bxxk == null) {
                        bxxk = new bxve(f58185b);
                        f58186d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
