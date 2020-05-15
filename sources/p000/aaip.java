package p000;

/* renamed from: aaip */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaip extends bxvk implements bxxd {

    /* renamed from: d */
    public static final aaip f28209d;

    /* renamed from: e */
    private static volatile bxxk f28210e;

    /* renamed from: a */
    public int f28211a;

    /* renamed from: b */
    public int f28212b;

    /* renamed from: c */
    public bxtx f28213c = bxtx.f164797b;

    static {
        aaip aaip = new aaip();
        f28209d = aaip;
        bxvk.m124024a(aaip.class, aaip);
    }

    private aaip() {
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
            return bxvk.m124022a(f28209d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ည\u0001", new Object[]{"a", "b", aain.f28208a, "c"});
        } else if (i2 == 3) {
            return new aaip();
        } else {
            if (i2 == 4) {
                return new bxvd(f28209d);
            }
            if (i2 == 5) {
                return f28209d;
            }
            bxxk bxxk = f28210e;
            if (bxxk == null) {
                synchronized (aaip.class) {
                    bxxk = f28210e;
                    if (bxxk == null) {
                        bxxk = new bxve(f28209d);
                        f28210e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
