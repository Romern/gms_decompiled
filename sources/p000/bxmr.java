package p000;

/* renamed from: bxmr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxmr extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bxmr f163977d;

    /* renamed from: e */
    public static final bxvj f163978e;

    /* renamed from: f */
    private static volatile bxxk f163979f;

    /* renamed from: a */
    public int f163980a;

    /* renamed from: b */
    public int f163981b;

    /* renamed from: c */
    public double f163982c;

    static {
        bxmr bxmr = new bxmr();
        f163977d = bxmr;
        bxvk.m124024a(bxmr.class, bxmr);
        bxcf bxcf = bxcf.f162779a;
        bxmr bxmr2 = f163977d;
        f163978e = bxvk.m124006a(bxcf, bxmr2, bxmr2, 87654321, bxzf.MESSAGE);
    }

    private bxmr() {
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
            return bxvk.m124022a(f163977d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002က\u0001", new Object[]{"a", "b", bxmq.m122876b(), "c"});
        } else if (i2 == 3) {
            return new bxmr();
        } else {
            if (i2 == 4) {
                return new bxvd(f163977d);
            }
            if (i2 == 5) {
                return f163977d;
            }
            bxxk bxxk = f163979f;
            if (bxxk == null) {
                synchronized (bxmr.class) {
                    bxxk = f163979f;
                    if (bxxk == null) {
                        bxxk = new bxve(f163977d);
                        f163979f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
