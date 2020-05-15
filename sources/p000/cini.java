package p000;

/* renamed from: cini */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cini extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cini f190934c;

    /* renamed from: d */
    private static volatile bxxk f190935d;

    /* renamed from: a */
    public int f190936a;

    /* renamed from: b */
    public int f190937b = -1;

    static {
        cini cini = new cini();
        f190934c = cini;
        bxvk.m124024a(cini.class, cini);
    }

    private cini() {
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
            return bxvk.m124022a(f190934c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", cing.f190933a});
        } else if (i2 == 3) {
            return new cini();
        } else {
            if (i2 == 4) {
                return new bxvd(f190934c);
            }
            if (i2 == 5) {
                return f190934c;
            }
            bxxk bxxk = f190935d;
            if (bxxk == null) {
                synchronized (cini.class) {
                    bxxk = f190935d;
                    if (bxxk == null) {
                        bxxk = new bxve(f190934c);
                        f190935d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
