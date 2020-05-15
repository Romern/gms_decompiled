package p000;

/* renamed from: bztt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bztt extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bztt f171370b;

    /* renamed from: c */
    private static volatile bxxk f171371c;

    /* renamed from: a */
    public int f171372a;

    static {
        bztt bztt = new bztt();
        f171370b = bztt;
        GeneratedMessageLite.m124024a(bztt.class, bztt);
    }

    private bztt() {
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
            return GeneratedMessageLite.m124022a(f171370b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bztt();
        } else {
            if (i2 == 4) {
                return new bxvd(f171370b);
            }
            if (i2 == 5) {
                return f171370b;
            }
            bxxk bxxk = f171371c;
            if (bxxk == null) {
                synchronized (bztt.class) {
                    bxxk = f171371c;
                    if (bxxk == null) {
                        bxxk = new bxve(f171370b);
                        f171371c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
