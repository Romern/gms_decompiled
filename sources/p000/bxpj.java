package p000;

/* renamed from: bxpj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxpj extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bxpj f164274e;

    /* renamed from: f */
    private static volatile bxxk f164275f;

    /* renamed from: a */
    public int f164276a;

    /* renamed from: b */
    public bxtx f164277b = bxtx.f164797b;

    /* renamed from: c */
    public boolean f164278c;

    /* renamed from: d */
    public bxwc f164279d = bxxn.f165040b;

    static {
        bxpj bxpj = new bxpj();
        f164274e = bxpj;
        bxvk.m124024a(bxpj.class, bxpj);
    }

    private bxpj() {
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
            return bxvk.m124022a(f164274e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003\u001b", new Object[]{"a", "b", "c", "d", bxpi.class});
        } else if (i2 == 3) {
            return new bxpj();
        } else {
            if (i2 == 4) {
                return new bxvd(f164274e);
            }
            if (i2 == 5) {
                return f164274e;
            }
            bxxk bxxk = f164275f;
            if (bxxk == null) {
                synchronized (bxpj.class) {
                    bxxk = f164275f;
                    if (bxxk == null) {
                        bxxk = new bxve(f164274e);
                        f164275f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
