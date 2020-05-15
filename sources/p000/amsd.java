package p000;

/* renamed from: amsd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amsd extends bxvk implements bxxd {

    /* renamed from: f */
    public static final amsd f75840f;

    /* renamed from: g */
    private static volatile bxxk f75841g;

    /* renamed from: a */
    public int f75842a;

    /* renamed from: b */
    public boolean f75843b;

    /* renamed from: c */
    public String f75844c = "";

    /* renamed from: d */
    public bxvt f75845d = bxvm.f164965b;

    /* renamed from: e */
    public amsc f75846e;

    static {
        amsd amsd = new amsd();
        f75840f = amsd;
        bxvk.m124024a(amsd.class, amsd);
    }

    private amsd() {
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
            return bxvk.m124022a(f75840f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0001\u0002\u0016\u0003ဇ\u0000\u0004ဉ\u0002", new Object[]{"a", "c", "d", "b", "e"});
        } else if (i2 == 3) {
            return new amsd();
        } else {
            if (i2 == 4) {
                return new bxvd((float[]) null, (short[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f75840f;
            }
            bxxk bxxk = f75841g;
            if (bxxk == null) {
                synchronized (amsd.class) {
                    bxxk = f75841g;
                    if (bxxk == null) {
                        bxxk = new bxve(f75840f);
                        f75841g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo41297a() {
        if (!this.f75845d.mo73666a()) {
            this.f75845d = bxvk.m124019a(this.f75845d);
        }
    }
}
