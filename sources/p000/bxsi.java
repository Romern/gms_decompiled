package p000;

/* renamed from: bxsi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxsi extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bxsi f164681e;

    /* renamed from: f */
    private static volatile bxxk f164682f;

    /* renamed from: a */
    public int f164683a;

    /* renamed from: b */
    public int f164684b;

    /* renamed from: c */
    public int f164685c;

    /* renamed from: d */
    public int f164686d;

    static {
        bxsi bxsi = new bxsi();
        f164681e = bxsi;
        bxvk.m124024a(bxsi.class, bxsi);
    }

    private bxsi() {
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
            return bxvk.m124022a(f164681e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", bxsm.f164713a, "d", bxsg.f164680a});
        } else if (i2 == 3) {
            return new bxsi();
        } else {
            if (i2 == 4) {
                return new bxvd(f164681e);
            }
            if (i2 == 5) {
                return f164681e;
            }
            bxxk bxxk = f164682f;
            if (bxxk == null) {
                synchronized (bxsi.class) {
                    bxxk = f164682f;
                    if (bxxk == null) {
                        bxxk = new bxve(f164681e);
                        f164682f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
