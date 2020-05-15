package p000;

/* renamed from: sxi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sxi extends bxvk implements bxxd {

    /* renamed from: d */
    public static final sxi f45356d;

    /* renamed from: f */
    private static volatile bxxk f45357f;

    /* renamed from: a */
    public int f45358a;

    /* renamed from: b */
    public bxwc f45359b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f45360c = bxxn.f165040b;

    /* renamed from: e */
    private int f45361e;

    static {
        sxi sxi = new sxi();
        f45356d = sxi;
        bxvk.m124024a(sxi.class, sxi);
    }

    private sxi() {
        bxxn bxxn = bxxn.f165040b;
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
            return bxvk.m124022a(f45356d, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0002\u0000\u0002ဌ\u0000\u0003\u001b\u0004\u001b", new Object[]{"e", "a", sxg.f45355a, "b", sxj.class, "c", sxb.class});
        } else if (i2 == 3) {
            return new sxi();
        } else {
            if (i2 == 4) {
                return new bxvd(f45356d);
            }
            if (i2 == 5) {
                return f45356d;
            }
            bxxk bxxk = f45357f;
            if (bxxk == null) {
                synchronized (sxi.class) {
                    bxxk = f45357f;
                    if (bxxk == null) {
                        bxxk = new bxve(f45356d);
                        f45357f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
