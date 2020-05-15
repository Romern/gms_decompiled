package p000;

/* renamed from: buif */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buif extends bxvk implements bxxd {

    /* renamed from: d */
    public static final buif f153928d;

    /* renamed from: f */
    private static volatile bxxk f153929f;

    /* renamed from: a */
    public boolean f153930a;

    /* renamed from: b */
    public bxwc f153931b = bxxn.f165040b;

    /* renamed from: c */
    public int f153932c;

    /* renamed from: e */
    private int f153933e;

    static {
        buif buif = new buif();
        f153928d = buif;
        bxvk.m124024a(buif.class, buif);
    }

    private buif() {
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
            return bxvk.m124022a(f153928d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဇ\u0000\u0002\u001b\u0003ဌ\u0001", new Object[]{"e", "a", "b", buik.class, "c", buid.f153927a});
        } else if (i2 == 3) {
            return new buif();
        } else {
            if (i2 == 4) {
                return new bxvd(f153928d);
            }
            if (i2 == 5) {
                return f153928d;
            }
            bxxk bxxk = f153929f;
            if (bxxk == null) {
                synchronized (buif.class) {
                    bxxk = f153929f;
                    if (bxxk == null) {
                        bxxk = new bxve(f153928d);
                        f153929f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
