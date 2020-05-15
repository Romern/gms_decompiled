package p000;

/* renamed from: bvka */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvka extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bvka f156375c;

    /* renamed from: d */
    private static volatile bxxk f156376d;

    /* renamed from: a */
    public String f156377a = "";

    /* renamed from: b */
    public bxwc f156378b = bxxn.f165040b;

    static {
        bvka bvka = new bvka();
        f156375c = bvka;
        bxvk.m124024a(bvka.class, bvka);
    }

    private bvka() {
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
            return bxvk.m124022a(f156375c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"a", "b", bvke.class});
        } else if (i2 == 3) {
            return new bvka();
        } else {
            if (i2 == 4) {
                return new bxvd(f156375c);
            }
            if (i2 == 5) {
                return f156375c;
            }
            bxxk bxxk = f156376d;
            if (bxxk == null) {
                synchronized (bvka.class) {
                    bxxk = f156376d;
                    if (bxxk == null) {
                        bxxk = new bxve(f156375c);
                        f156376d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
