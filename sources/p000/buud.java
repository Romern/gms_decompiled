package p000;

/* renamed from: buud */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buud extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final buud f154932d;

    /* renamed from: e */
    private static volatile bxxk f154933e;

    /* renamed from: a */
    public int f154934a;

    /* renamed from: b */
    public int f154935b;

    /* renamed from: c */
    public ByteString f154936c = ByteString.f164797b;

    static {
        buud buud = new buud();
        f154932d = buud;
        GeneratedMessageLite.m124024a(buud.class, buud);
    }

    private buud() {
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
            return GeneratedMessageLite.m124022a(f154932d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new buud();
        } else {
            if (i2 == 4) {
                return new bxvd(f154932d);
            }
            if (i2 == 5) {
                return f154932d;
            }
            bxxk bxxk = f154933e;
            if (bxxk == null) {
                synchronized (buud.class) {
                    bxxk = f154933e;
                    if (bxxk == null) {
                        bxxk = new bxve(f154932d);
                        f154933e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
