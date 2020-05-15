package p000;

/* renamed from: eip */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eip extends bxvk implements bxxd {

    /* renamed from: h */
    public static final eip f15076h;

    /* renamed from: i */
    private static volatile bxxk f15077i;

    /* renamed from: a */
    public int f15078a = 0;

    /* renamed from: b */
    public Object f15079b;

    /* renamed from: c */
    public long f15080c;

    /* renamed from: d */
    public long f15081d;

    /* renamed from: e */
    public ein f15082e;

    /* renamed from: f */
    public bxwc f15083f = bxxn.f165040b;

    /* renamed from: g */
    public int f15084g;

    static {
        eip eip = new eip();
        f15076h = eip;
        bxvk.m124024a(eip.class, eip);
    }

    private eip() {
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
            return bxvk.m124022a(f15076h, "\u0000\u0007\u0001\u0000\u0001\t\u0007\u0000\u0001\u0000\u0001\t\u00027\u0000\u0003\u001b\u0004\u0002\u0006Ȼ\u0000\b\u0002\t\f", new Object[]{"b", "a", "e", "f", eio.class, "c", "d", "g"});
        } else if (i2 == 3) {
            return new eip();
        } else {
            if (i2 == 4) {
                return new bxvd(f15076h);
            }
            if (i2 == 5) {
                return f15076h;
            }
            bxxk bxxk = f15077i;
            if (bxxk == null) {
                synchronized (eip.class) {
                    bxxk = f15077i;
                    if (bxxk == null) {
                        bxxk = new bxve(f15076h);
                        f15077i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
