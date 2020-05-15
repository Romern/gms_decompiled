package p000;

/* renamed from: bwud */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwud extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bwud f161019b;

    /* renamed from: e */
    private static volatile bxxk f161020e;

    /* renamed from: a */
    public String f161021a = "";

    /* renamed from: c */
    private int f161022c;

    /* renamed from: d */
    private byte f161023d = 2;

    static {
        bwud bwud = new bwud();
        f161019b = bwud;
        GeneratedMessageLite.m124024a(bwud.class, bwud);
    }

    private bwud() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f161023d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f161023d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f161019b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔈ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bwud();
        } else {
            if (i2 == 4) {
                return new bxvd(f161019b);
            }
            if (i2 == 5) {
                return f161019b;
            }
            bxxk bxxk = f161020e;
            if (bxxk == null) {
                synchronized (bwud.class) {
                    bxxk = f161020e;
                    if (bxxk == null) {
                        bxxk = new bxve(f161019b);
                        f161020e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
