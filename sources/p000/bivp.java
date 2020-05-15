package p000;

/* renamed from: bivp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bivp extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bivp f122024b;

    /* renamed from: e */
    private static volatile bxxk f122025e;

    /* renamed from: a */
    public boolean f122026a;

    /* renamed from: c */
    private int f122027c;

    /* renamed from: d */
    private byte f122028d = 2;

    static {
        bivp bivp = new bivp();
        f122024b = bivp;
        bxvk.m124024a(bivp.class, bivp);
    }

    private bivp() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f122028d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f122028d = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f122024b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔇ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bivp();
        } else {
            if (i2 == 4) {
                return new bxvd(f122024b);
            }
            if (i2 == 5) {
                return f122024b;
            }
            bxxk bxxk = f122025e;
            if (bxxk == null) {
                synchronized (bivp.class) {
                    bxxk = f122025e;
                    if (bxxk == null) {
                        bxxk = new bxve(f122024b);
                        f122025e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
