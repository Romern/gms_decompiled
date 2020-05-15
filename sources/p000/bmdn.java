package p000;

/* renamed from: bmdn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmdn extends bxvk implements bxxd {

    /* renamed from: k */
    public static final bmdn f128831k;

    /* renamed from: l */
    private static volatile bxxk f128832l;

    /* renamed from: a */
    public int f128833a;

    /* renamed from: b */
    public String f128834b = "";

    /* renamed from: c */
    public long f128835c;

    /* renamed from: d */
    public bxtx f128836d = bxtx.f164797b;

    /* renamed from: e */
    public String f128837e = "";

    /* renamed from: f */
    public bxwc f128838f = bxxn.f165040b;

    /* renamed from: g */
    public int f128839g;

    /* renamed from: h */
    public bxwc f128840h = bxxn.f165040b;

    /* renamed from: i */
    public int f128841i;

    /* renamed from: j */
    public int f128842j;

    static {
        bmdn bmdn = new bmdn();
        f128831k = bmdn;
        bxvk.m124024a(bmdn.class, bmdn);
    }

    private bmdn() {
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
            return bxvk.m124022a(f128831k, "\u0001\t\u0000\u0001\u0001\u0011\t\u0000\u0002\u0000\u0001ဈ\u0000\u0002ည\u0002\u0004ဈ\u0003\u0005\u001b\u0007ဂ\u0001\bဌ\u0004\r\u001b\u000eဌ\u0005\u0011ဌ\u0006", new Object[]{"a", "b", "d", "e", "f", bmnr.class, "c", "g", bmqn.f130412a, "h", bmlv.class, "i", bmng.f130102a, "j", bmad.f128435a});
        } else if (i2 == 3) {
            return new bmdn();
        } else {
            if (i2 == 4) {
                return new bxvd(f128831k);
            }
            if (i2 == 5) {
                return f128831k;
            }
            bxxk bxxk = f128832l;
            if (bxxk == null) {
                synchronized (bmdn.class) {
                    bxxk = f128832l;
                    if (bxxk == null) {
                        bxxk = new bxve(f128831k);
                        f128832l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
