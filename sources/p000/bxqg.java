package p000;

/* renamed from: bxqg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxqg extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bxqg f164380b;

    /* renamed from: d */
    private static volatile bxxk f164381d;

    /* renamed from: a */
    public bxpe f164382a;

    /* renamed from: c */
    private int f164383c;

    static {
        bxqg bxqg = new bxqg();
        f164380b = bxqg;
        GeneratedMessageLite.m124024a(bxqg.class, bxqg);
    }

    private bxqg() {
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
            return GeneratedMessageLite.m124022a(f164380b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bxqg();
        } else {
            if (i2 == 4) {
                return new bxvd(f164380b);
            }
            if (i2 == 5) {
                return f164380b;
            }
            bxxk bxxk = f164381d;
            if (bxxk == null) {
                synchronized (bxqg.class) {
                    bxxk = f164381d;
                    if (bxxk == null) {
                        bxxk = new bxve(f164380b);
                        f164381d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
