package p000;

/* renamed from: bmtc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmtc extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bmtc f130813c;

    /* renamed from: d */
    private static volatile bxxk f130814d;

    /* renamed from: a */
    public int f130815a = 0;

    /* renamed from: b */
    public Object f130816b;

    static {
        bmtc bmtc = new bmtc();
        f130813c = bmtc;
        bxvk.m124024a(bmtc.class, bmtc);
    }

    private bmtc() {
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
            return bxvk.m124022a(f130813c, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"b", "a", bmsp.class, bmta.class, bmts.class, bmte.class, bmsr.class, bmsq.class, bmss.class});
        } else if (i2 == 3) {
            return new bmtc();
        } else {
            if (i2 == 4) {
                return new bxvd(f130813c);
            }
            if (i2 == 5) {
                return f130813c;
            }
            bxxk bxxk = f130814d;
            if (bxxk == null) {
                synchronized (bmtc.class) {
                    bxxk = f130814d;
                    if (bxxk == null) {
                        bxxk = new bxve(f130813c);
                        f130814d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
