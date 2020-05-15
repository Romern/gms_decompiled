package p000;

/* renamed from: bpsv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpsv extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bpsv f139020g;

    /* renamed from: h */
    private static volatile bxxk f139021h;

    /* renamed from: a */
    public int f139022a;

    /* renamed from: b */
    public int f139023b;

    /* renamed from: c */
    public double f139024c;

    /* renamed from: d */
    public double f139025d;

    /* renamed from: e */
    public double f139026e;

    /* renamed from: f */
    public double f139027f;

    static {
        bpsv bpsv = new bpsv();
        f139020g = bpsv;
        bxvk.m124024a(bpsv.class, bpsv);
    }

    private bpsv() {
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
            return bxvk.m124022a(f139020g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဋ\u0000\u0002က\u0001\u0003က\u0002\u0004က\u0003\u0005က\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bpsv();
        } else {
            if (i2 == 4) {
                return new bxvd(f139020g);
            }
            if (i2 == 5) {
                return f139020g;
            }
            bxxk bxxk = f139021h;
            if (bxxk == null) {
                synchronized (bpsv.class) {
                    bxxk = f139021h;
                    if (bxxk == null) {
                        bxxk = new bxve(f139020g);
                        f139021h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
