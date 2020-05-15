package p000;

/* renamed from: buej */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buej extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final buej f153592e;

    /* renamed from: g */
    private static volatile bxxk f153593g;

    /* renamed from: a */
    public long f153594a;

    /* renamed from: b */
    public int f153595b;

    /* renamed from: c */
    public int f153596c;

    /* renamed from: d */
    public float f153597d;

    /* renamed from: f */
    private int f153598f;

    static {
        buej buej = new buej();
        f153592e = buej;
        GeneratedMessageLite.m124024a(buej.class, buej);
    }

    private buej() {
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
            return GeneratedMessageLite.m124022a(f153592e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဃ\u0000\u0002င\u0001\u0003င\u0002\u0004ခ\u0003", new Object[]{"f", "a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new buej();
        } else {
            if (i2 == 4) {
                return new bxvd(f153592e);
            }
            if (i2 == 5) {
                return f153592e;
            }
            bxxk bxxk = f153593g;
            if (bxxk == null) {
                synchronized (buej.class) {
                    bxxk = f153593g;
                    if (bxxk == null) {
                        bxxk = new bxve(f153592e);
                        f153593g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
