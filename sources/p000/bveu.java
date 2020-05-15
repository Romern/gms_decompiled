package p000;

/* renamed from: bveu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bveu extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bveu f155796d;

    /* renamed from: e */
    private static volatile bxxk f155797e;

    /* renamed from: a */
    public int f155798a;

    /* renamed from: b */
    public int f155799b;

    /* renamed from: c */
    public int f155800c;

    static {
        bveu bveu = new bveu();
        f155796d = bveu;
        bxvk.m124024a(bveu.class, bveu);
    }

    private bveu() {
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
            return bxvk.m124022a(f155796d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"a", "b", bviw.f156297a, "c"});
        } else if (i2 == 3) {
            return new bveu();
        } else {
            if (i2 == 4) {
                return new bxvd(f155796d);
            }
            if (i2 == 5) {
                return f155796d;
            }
            bxxk bxxk = f155797e;
            if (bxxk == null) {
                synchronized (bveu.class) {
                    bxxk = f155797e;
                    if (bxxk == null) {
                        bxxk = new bxve(f155796d);
                        f155797e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
