package p000;

/* renamed from: bxbu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxbu extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bxvu f162733d = new bxbr();

    /* renamed from: e */
    public static final bxbu f162734e;

    /* renamed from: g */
    private static volatile bxxk f162735g;

    /* renamed from: a */
    public int f162736a;

    /* renamed from: b */
    public long f162737b;

    /* renamed from: c */
    public bxvt f162738c = bxvm.f164965b;

    /* renamed from: f */
    private int f162739f;

    static {
        bxbu bxbu = new bxbu();
        f162734e = bxbu;
        bxvk.m124024a(bxbu.class, bxbu);
    }

    private bxbu() {
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
            return bxvk.m124022a(f162734e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003\u001e", new Object[]{"f", "a", bxbs.f162732a, "b", "c", bxki.m122802b()});
        } else if (i2 == 3) {
            return new bxbu();
        } else {
            if (i2 == 4) {
                return new bxvd(f162734e);
            }
            if (i2 == 5) {
                return f162734e;
            }
            bxxk bxxk = f162735g;
            if (bxxk == null) {
                synchronized (bxbu.class) {
                    bxxk = f162735g;
                    if (bxxk == null) {
                        bxxk = new bxve(f162734e);
                        f162735g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
