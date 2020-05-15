package p000;

/* renamed from: amne */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amne extends bxvk implements bxxd {

    /* renamed from: f */
    public static final amne f75442f;

    /* renamed from: g */
    private static volatile bxxk f75443g;

    /* renamed from: a */
    public int f75444a;

    /* renamed from: b */
    public int f75445b;

    /* renamed from: c */
    public int f75446c;

    /* renamed from: d */
    public int f75447d;

    /* renamed from: e */
    public int f75448e;

    static {
        amne amne = new amne();
        f75442f = amne;
        bxvk.m124024a(amne.class, amne);
    }

    private amne() {
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
            return bxvk.m124022a(f75442f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", amkf.f75064a, "c", amke.m63000b(), "d", amkc.f75053a, "e", amjz.f75044a});
        } else if (i2 == 3) {
            return new amne();
        } else {
            if (i2 == 4) {
                return new bxvd(f75442f);
            }
            if (i2 == 5) {
                return f75442f;
            }
            bxxk bxxk = f75443g;
            if (bxxk == null) {
                synchronized (amne.class) {
                    bxxk = f75443g;
                    if (bxxk == null) {
                        bxxk = new bxve(f75442f);
                        f75443g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
