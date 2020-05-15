package p000;

/* renamed from: bzwv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzwv extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bzwv f171681c;

    /* renamed from: d */
    private static volatile bxxk f171682d;

    /* renamed from: a */
    public int f171683a;

    /* renamed from: b */
    public int f171684b = 1;

    static {
        bzwv bzwv = new bzwv();
        f171681c = bzwv;
        bxvk.m124024a(bzwv.class, bzwv);
    }

    private bzwv() {
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
            return bxvk.m124022a(f171681c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bzwu.f171680a});
        } else if (i2 == 3) {
            return new bzwv();
        } else {
            if (i2 == 4) {
                return new bxvd(f171681c);
            }
            if (i2 == 5) {
                return f171681c;
            }
            bxxk bxxk = f171682d;
            if (bxxk == null) {
                synchronized (bzwv.class) {
                    bxxk = f171682d;
                    if (bxxk == null) {
                        bxxk = new bxve(f171681c);
                        f171682d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
