package p000;

/* renamed from: bxgs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxgs extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bxgs f163294c;

    /* renamed from: d */
    private static volatile bxxk f163295d;

    /* renamed from: a */
    public int f163296a;

    /* renamed from: b */
    public int f163297b;

    static {
        bxgs bxgs = new bxgs();
        f163294c = bxgs;
        bxvk.m124024a(bxgs.class, bxgs);
    }

    private bxgs() {
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
            return bxvk.m124022a(f163294c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bxgl.f163268a});
        } else if (i2 == 3) {
            return new bxgs();
        } else {
            if (i2 == 4) {
                return new bxvd(f163294c);
            }
            if (i2 == 5) {
                return f163294c;
            }
            bxxk bxxk = f163295d;
            if (bxxk == null) {
                synchronized (bxgs.class) {
                    bxxk = f163295d;
                    if (bxxk == null) {
                        bxxk = new bxve(f163294c);
                        f163295d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
