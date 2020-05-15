package p000;

/* renamed from: buzb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buzb extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bxvu f155364e = new buza();

    /* renamed from: f */
    public static final buzb f155365f;

    /* renamed from: g */
    private static volatile bxxk f155366g;

    /* renamed from: a */
    public int f155367a;

    /* renamed from: b */
    public int f155368b;

    /* renamed from: c */
    public int f155369c;

    /* renamed from: d */
    public bxvt f155370d = bxvm.f164965b;

    static {
        buzb buzb = new buzb();
        f155365f = buzb;
        bxvk.m124024a(buzb.class, buzb);
    }

    private buzb() {
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
            return bxvk.m124022a(f155365f, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003\u001e", new Object[]{"a", "b", buze.f155372a, "c", buyv.m120789b(), "d", buyz.m120795b()});
        } else if (i2 == 3) {
            return new buzb();
        } else {
            if (i2 == 4) {
                return new bxvd((int[]) null, (int[][][]) null);
            }
            if (i2 == 5) {
                return f155365f;
            }
            bxxk bxxk = f155366g;
            if (bxxk == null) {
                synchronized (buzb.class) {
                    bxxk = f155366g;
                    if (bxxk == null) {
                        bxxk = new bxve(f155365f);
                        f155366g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
