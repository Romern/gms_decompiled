package p000;

/* renamed from: bezs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bezs extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bezs f113185b;

    /* renamed from: c */
    private static volatile bxxk f113186c;

    /* renamed from: a */
    public bxvt f113187a = bxvm.f164965b;

    static {
        bezs bezs = new bezs();
        f113185b = bezs;
        GeneratedMessageLite.m124024a(bezs.class, bezs);
    }

    private bezs() {
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
            return GeneratedMessageLite.m124022a(f113185b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001+", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bezs();
        } else {
            if (i2 == 4) {
                return new bxvd(f113185b);
            }
            if (i2 == 5) {
                return f113185b;
            }
            bxxk bxxk = f113186c;
            if (bxxk == null) {
                synchronized (bezs.class) {
                    bxxk = f113186c;
                    if (bxxk == null) {
                        bxxk = new bxve(f113185b);
                        f113186c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
