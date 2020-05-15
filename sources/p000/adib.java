package p000;

/* renamed from: adib */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adib extends bxvk implements bxxd {

    /* renamed from: h */
    public static final adib f61762h;

    /* renamed from: i */
    private static volatile bxxk f61763i;

    /* renamed from: a */
    public String f61764a = "";

    /* renamed from: b */
    public String f61765b = "";

    /* renamed from: c */
    public bxwc f61766c = bxxn.f165040b;

    /* renamed from: d */
    public bxvt f61767d = bxvm.f164965b;

    /* renamed from: e */
    public int f61768e;

    /* renamed from: f */
    public bxtx f61769f = bxtx.f164797b;

    /* renamed from: g */
    public boolean f61770g;

    static {
        adib adib = new adib();
        f61762h = adib;
        bxvk.m124024a(adib.class, adib);
    }

    private adib() {
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
            return bxvk.m124022a(f61762h, "\u0000\u0007\u0000\u0000\u0001\b\u0007\u0000\u0002\u0000\u0001Ȉ\u0003Ȉ\u0004Ț\u0005\u0004\u0006\n\u0007'\b\u0007", new Object[]{"a", "b", "c", "e", "f", "d", "g"});
        } else if (i2 == 3) {
            return new adib();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][][]) null, (byte[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f61762h;
            }
            bxxk bxxk = f61763i;
            if (bxxk == null) {
                synchronized (adib.class) {
                    bxxk = f61763i;
                    if (bxxk == null) {
                        bxxk = new bxve(f61762h);
                        f61763i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
