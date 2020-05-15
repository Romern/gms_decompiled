package p000;

/* renamed from: bzka */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzka extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzka f170365c;

    /* renamed from: d */
    private static volatile bxxk f170366d;

    /* renamed from: a */
    public int f170367a;

    /* renamed from: b */
    public int f170368b = 1;

    static {
        bzka bzka = new bzka();
        f170365c = bzka;
        GeneratedMessageLite.m124024a(bzka.class, bzka);
    }

    private bzka() {
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
            return GeneratedMessageLite.m124022a(f170365c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bzjz.f170364a});
        } else if (i2 == 3) {
            return new bzka();
        } else {
            if (i2 == 4) {
                return new bxvd(f170365c);
            }
            if (i2 == 5) {
                return f170365c;
            }
            bxxk bxxk = f170366d;
            if (bxxk == null) {
                synchronized (bzka.class) {
                    bxxk = f170366d;
                    if (bxxk == null) {
                        bxxk = new bxve(f170365c);
                        f170366d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
