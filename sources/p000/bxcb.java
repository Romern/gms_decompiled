package p000;

/* renamed from: bxcb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxcb extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bxcb f162759d;

    /* renamed from: f */
    private static volatile bxxk f162760f;

    /* renamed from: a */
    public int f162761a;

    /* renamed from: b */
    public long f162762b;

    /* renamed from: c */
    public bxwc f162763c = bxxn.f165040b;

    /* renamed from: e */
    private int f162764e;

    static {
        bxcb bxcb = new bxcb();
        f162759d = bxcb;
        bxvk.m124024a(bxcb.class, bxcb);
    }

    private bxcb() {
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
            return bxvk.m124022a(f162759d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0003ဂ\u0001\u0004\u001b", new Object[]{"e", "a", bxbz.f162758a, "b", "c", bxby.class});
        } else if (i2 == 3) {
            return new bxcb();
        } else {
            if (i2 == 4) {
                return new bxvd(f162759d);
            }
            if (i2 == 5) {
                return f162759d;
            }
            bxxk bxxk = f162760f;
            if (bxxk == null) {
                synchronized (bxcb.class) {
                    bxxk = f162760f;
                    if (bxxk == null) {
                        bxxk = new bxve(f162759d);
                        f162760f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
