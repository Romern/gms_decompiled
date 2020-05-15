package p000;

/* renamed from: bltr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bltr extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bltr f127727b;

    /* renamed from: d */
    private static volatile bxxk f127728d;

    /* renamed from: a */
    public int f127729a;

    /* renamed from: c */
    private int f127730c;

    static {
        bltr bltr = new bltr();
        f127727b = bltr;
        bxvk.m124024a(bltr.class, bltr);
    }

    private bltr() {
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
            return bxvk.m124022a(f127727b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", bltp.f127726a});
        } else if (i2 == 3) {
            return new bltr();
        } else {
            if (i2 == 4) {
                return new bxvd(f127727b);
            }
            if (i2 == 5) {
                return f127727b;
            }
            bxxk bxxk = f127728d;
            if (bxxk == null) {
                synchronized (bltr.class) {
                    bxxk = f127728d;
                    if (bxxk == null) {
                        bxxk = new bxve(f127727b);
                        f127728d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
