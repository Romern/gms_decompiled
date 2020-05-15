package p000;

/* renamed from: bvlo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvlo extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bvlo f156575c;

    /* renamed from: e */
    private static volatile bxxk f156576e;

    /* renamed from: a */
    public String f156577a = "";

    /* renamed from: b */
    public bxwc f156578b = bxxn.f165040b;

    /* renamed from: d */
    private int f156579d;

    static {
        bvlo bvlo = new bvlo();
        f156575c = bvlo;
        bxvk.m124024a(bvlo.class, bvlo);
    }

    private bvlo() {
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
            return bxvk.m124022a(f156575c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"d", "a", "b", bvln.class});
        } else if (i2 == 3) {
            return new bvlo();
        } else {
            if (i2 == 4) {
                return new bxvd(f156575c);
            }
            if (i2 == 5) {
                return f156575c;
            }
            bxxk bxxk = f156576e;
            if (bxxk == null) {
                synchronized (bvlo.class) {
                    bxxk = f156576e;
                    if (bxxk == null) {
                        bxxk = new bxve(f156575c);
                        f156576e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
