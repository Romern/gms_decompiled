package p000;

/* renamed from: bwuw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwuw extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bwuw f161080b;

    /* renamed from: c */
    public static final bxvj f161081c;

    /* renamed from: e */
    private static volatile bxxk f161082e;

    /* renamed from: a */
    public int f161083a;

    /* renamed from: d */
    private int f161084d;

    static {
        bwuw bwuw = new bwuw();
        f161080b = bwuw;
        bxvk.m124024a(bwuw.class, bwuw);
        bwxl bwxl = bwxl.f161383i;
        bwuw bwuw2 = f161080b;
        f161081c = bxvk.m124006a(bwxl, bwuw2, bwuw2, 220794720, bxzf.MESSAGE);
    }

    private bwuw() {
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
            return bxvk.m124022a(f161080b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"d", "a", bwus.f161065a});
        } else if (i2 == 3) {
            return new bwuw();
        } else {
            if (i2 == 4) {
                return new bxvd(f161080b);
            }
            if (i2 == 5) {
                return f161080b;
            }
            bxxk bxxk = f161082e;
            if (bxxk == null) {
                synchronized (bwuw.class) {
                    bxxk = f161082e;
                    if (bxxk == null) {
                        bxxk = new bxve(f161080b);
                        f161082e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
