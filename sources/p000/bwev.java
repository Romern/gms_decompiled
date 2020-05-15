package p000;

/* renamed from: bwev */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwev extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bwev f159029d;

    /* renamed from: e */
    private static volatile bxxk f159030e;

    /* renamed from: a */
    public int f159031a;

    /* renamed from: b */
    public int f159032b;

    /* renamed from: c */
    public String f159033c = "";

    static {
        bwev bwev = new bwev();
        f159029d = bwev;
        bxvk.m124024a(bwev.class, bwev);
    }

    private bwev() {
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
            return bxvk.m124022a(f159029d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", bwet.f159028a, "c"});
        } else if (i2 == 3) {
            return new bwev();
        } else {
            if (i2 == 4) {
                return new bxvd(f159029d);
            }
            if (i2 == 5) {
                return f159029d;
            }
            bxxk bxxk = f159030e;
            if (bxxk == null) {
                synchronized (bwev.class) {
                    bxxk = f159030e;
                    if (bxxk == null) {
                        bxxk = new bxve(f159029d);
                        f159030e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
