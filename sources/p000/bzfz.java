package p000;

/* renamed from: bzfz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzfz extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bzfz f169893c;

    /* renamed from: d */
    private static volatile bxxk f169894d;

    /* renamed from: a */
    public int f169895a;

    /* renamed from: b */
    public int f169896b;

    static {
        bzfz bzfz = new bzfz();
        f169893c = bzfz;
        bxvk.m124024a(bzfz.class, bzfz);
    }

    private bzfz() {
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
            return bxvk.m124022a(f169893c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bzfy.f169892a});
        } else if (i2 == 3) {
            return new bzfz();
        } else {
            if (i2 == 4) {
                return new bxvd(f169893c);
            }
            if (i2 == 5) {
                return f169893c;
            }
            bxxk bxxk = f169894d;
            if (bxxk == null) {
                synchronized (bzfz.class) {
                    bxxk = f169894d;
                    if (bxxk == null) {
                        bxxk = new bxve(f169893c);
                        f169894d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
