package p000;

/* renamed from: biqq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biqq extends bxvk implements bxxd {

    /* renamed from: e */
    public static final biqq f121317e;

    /* renamed from: h */
    private static volatile bxxk f121318h;

    /* renamed from: a */
    public int f121319a = 1;

    /* renamed from: b */
    public int f121320b;

    /* renamed from: c */
    public boolean f121321c;

    /* renamed from: d */
    public bxwc f121322d = bxxn.f165040b;

    /* renamed from: f */
    private int f121323f;

    /* renamed from: g */
    private byte f121324g = 2;

    static {
        biqq biqq = new biqq();
        f121317e = biqq;
        bxvk.m124024a(biqq.class, biqq);
    }

    private biqq() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121324g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121324g = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f121317e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0004\u0001ᔌ\u0000\u0002ᔄ\u0001\u0003ᔇ\u0002\u0004Л", new Object[]{"f", "a", bisf.m102782b(), "b", "c", "d", bity.class});
        } else if (i2 == 3) {
            return new biqq();
        } else {
            if (i2 == 4) {
                return new bxvd(f121317e);
            }
            if (i2 == 5) {
                return f121317e;
            }
            bxxk bxxk = f121318h;
            if (bxxk == null) {
                synchronized (biqq.class) {
                    bxxk = f121318h;
                    if (bxxk == null) {
                        bxxk = new bxve(f121317e);
                        f121318h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
