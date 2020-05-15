package p000;

/* renamed from: btib */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btib extends bxvk implements bxxd {

    /* renamed from: m */
    public static final btib f148936m;

    /* renamed from: n */
    private static volatile bxxk f148937n;

    /* renamed from: a */
    public String f148938a = "";

    /* renamed from: b */
    public String f148939b = "";

    /* renamed from: c */
    public bxwc f148940c = bxxn.f165040b;

    /* renamed from: d */
    public String f148941d = "";

    /* renamed from: e */
    public String f148942e = "";

    /* renamed from: f */
    public came f148943f;

    /* renamed from: g */
    public bxwc f148944g = bxxn.f165040b;

    /* renamed from: h */
    public bxwc f148945h = bxxn.f165040b;

    /* renamed from: i */
    public bxtx f148946i = bxtx.f164797b;

    /* renamed from: j */
    public bxwc f148947j = bxxn.f165040b;

    /* renamed from: k */
    public bxtx f148948k = bxtx.f164797b;

    /* renamed from: l */
    public long f148949l;

    static {
        btib btib = new btib();
        f148936m = btib;
        bxvk.m124024a(btib.class, btib);
    }

    private btib() {
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
            return bxvk.m124022a(f148936m, "\u0000\f\u0000\u0000\u0001\u000e\f\u0000\u0004\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004Ȉ\u0005Ȉ\u0006\t\u0007\u001b\nȚ\u000b\n\f\u001b\r\u0002\u000e\n", new Object[]{"a", "b", "c", btir.class, "d", "e", "f", "g", btip.class, "h", "i", "j", camg.class, "l", "k"});
        } else if (i2 == 3) {
            return new btib();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[]) null, (boolean[][]) null);
            }
            if (i2 == 5) {
                return f148936m;
            }
            bxxk bxxk = f148937n;
            if (bxxk == null) {
                synchronized (btib.class) {
                    bxxk = f148937n;
                    if (bxxk == null) {
                        bxxk = new bxve(f148936m);
                        f148937n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
