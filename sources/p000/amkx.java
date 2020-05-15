package p000;

/* renamed from: amkx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amkx extends bxvk implements bxxd {

    /* renamed from: e */
    public static final amkx f75126e;

    /* renamed from: f */
    private static volatile bxxk f75127f;

    /* renamed from: a */
    public int f75128a;

    /* renamed from: b */
    public int f75129b;

    /* renamed from: c */
    public int f75130c;

    /* renamed from: d */
    public int f75131d;

    static {
        amkx amkx = new amkx();
        f75126e = amkx;
        bxvk.m124024a(amkx.class, amkx);
    }

    private amkx() {
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
            return bxvk.m124022a(f75126e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", amkq.f75075a, "c", amkp.f75074a, "d", amjy.f75043a});
        } else if (i2 == 3) {
            return new amkx();
        } else {
            if (i2 == 4) {
                return new bxvd(f75126e);
            }
            if (i2 == 5) {
                return f75126e;
            }
            bxxk bxxk = f75127f;
            if (bxxk == null) {
                synchronized (amkx.class) {
                    bxxk = f75127f;
                    if (bxxk == null) {
                        bxxk = new bxve(f75126e);
                        f75127f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
