package p000;

/* renamed from: blel */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blel extends bxvk implements bxxd {

    /* renamed from: d */
    public static final blel f126222d;

    /* renamed from: e */
    private static volatile bxxk f126223e;

    /* renamed from: a */
    public int f126224a;

    /* renamed from: b */
    public bleu f126225b;

    /* renamed from: c */
    public String f126226c = "";

    static {
        blel blel = new blel();
        f126222d = blel;
        bxvk.m124024a(blel.class, blel);
    }

    private blel() {
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
            return bxvk.m124022a(f126222d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new blel();
        } else {
            if (i2 == 4) {
                return new bxvd(f126222d);
            }
            if (i2 == 5) {
                return f126222d;
            }
            bxxk bxxk = f126223e;
            if (bxxk == null) {
                synchronized (blel.class) {
                    bxxk = f126223e;
                    if (bxxk == null) {
                        bxxk = new bxve(f126222d);
                        f126223e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
