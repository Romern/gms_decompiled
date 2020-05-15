package p000;

/* renamed from: bisa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bisa extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bisa f121490h;

    /* renamed from: i */
    private static volatile bxxk f121491i;

    /* renamed from: a */
    public int f121492a;

    /* renamed from: b */
    public int f121493b = 1;

    /* renamed from: c */
    public String f121494c = "";

    /* renamed from: d */
    public int f121495d;

    /* renamed from: e */
    public boolean f121496e;

    /* renamed from: f */
    public boolean f121497f;

    /* renamed from: g */
    public boolean f121498g;

    static {
        bisa bisa = new bisa();
        f121490h = bisa;
        bxvk.m124024a(bisa.class, bisa);
    }

    private bisa() {
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
            return bxvk.m124022a(f121490h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဋ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"a", "b", biry.f121489a, "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bisa();
        } else {
            if (i2 == 4) {
                return new bxvd(f121490h);
            }
            if (i2 == 5) {
                return f121490h;
            }
            bxxk bxxk = f121491i;
            if (bxxk == null) {
                synchronized (bisa.class) {
                    bxxk = f121491i;
                    if (bxxk == null) {
                        bxxk = new bxve(f121490h);
                        f121491i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
