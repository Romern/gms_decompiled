package p000;

/* renamed from: aylv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aylv extends bxvk implements bxxd {

    /* renamed from: c */
    public static final aylv f97937c;

    /* renamed from: d */
    private static volatile bxxk f97938d;

    /* renamed from: a */
    public int f97939a;

    /* renamed from: b */
    public int f97940b;

    static {
        aylv aylv = new aylv();
        f97937c = aylv;
        bxvk.m124024a(aylv.class, aylv);
    }

    private aylv() {
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
            return bxvk.m124022a(f97937c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", aylw.f97941a});
        } else if (i2 == 3) {
            return new aylv();
        } else {
            if (i2 == 4) {
                return new bxvd(f97937c);
            }
            if (i2 == 5) {
                return f97937c;
            }
            bxxk bxxk = f97938d;
            if (bxxk == null) {
                synchronized (aylv.class) {
                    bxxk = f97938d;
                    if (bxxk == null) {
                        bxxk = new bxve(f97937c);
                        f97938d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
