package p000;

/* renamed from: bykb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bykb extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bykb f166726d;

    /* renamed from: f */
    private static volatile bxxk f166727f;

    /* renamed from: a */
    public int f166728a = 0;

    /* renamed from: b */
    public Object f166729b;

    /* renamed from: c */
    public int f166730c;

    /* renamed from: e */
    private int f166731e;

    static {
        bykb bykb = new bykb();
        f166726d = bykb;
        bxvk.m124024a(bykb.class, bykb);
    }

    private bykb() {
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
            return bxvk.m124022a(f166726d, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ြ\u0000", new Object[]{"b", "a", "e", "c", byka.m124894b(), byhk.class});
        } else if (i2 == 3) {
            return new bykb();
        } else {
            if (i2 == 4) {
                return new bxvd(f166726d);
            }
            if (i2 == 5) {
                return f166726d;
            }
            bxxk bxxk = f166727f;
            if (bxxk == null) {
                synchronized (bykb.class) {
                    bxxk = f166727f;
                    if (bxxk == null) {
                        bxxk = new bxve(f166726d);
                        f166727f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
