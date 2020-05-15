package p000;

/* renamed from: brbg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brbg extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final brbg f142246b;

    /* renamed from: d */
    private static volatile bxxk f142247d;

    /* renamed from: a */
    public bral f142248a;

    /* renamed from: c */
    private int f142249c;

    static {
        brbg brbg = new brbg();
        f142246b = brbg;
        GeneratedMessageLite.m124024a(brbg.class, brbg);
    }

    private brbg() {
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
            return GeneratedMessageLite.m124022a(f142246b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new brbg();
        } else {
            if (i2 == 4) {
                return new bxvd(f142246b);
            }
            if (i2 == 5) {
                return f142246b;
            }
            bxxk bxxk = f142247d;
            if (bxxk == null) {
                synchronized (brbg.class) {
                    bxxk = f142247d;
                    if (bxxk == null) {
                        bxxk = new bxve(f142246b);
                        f142247d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
