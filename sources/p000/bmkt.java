package p000;

/* renamed from: bmkt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmkt extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bmkt f129883g;

    /* renamed from: h */
    private static volatile bxxk f129884h;

    /* renamed from: a */
    public int f129885a;

    /* renamed from: b */
    public String f129886b = "";

    /* renamed from: c */
    public bmdn f129887c;

    /* renamed from: d */
    public String f129888d = "";

    /* renamed from: e */
    public bxwc f129889e = bxxn.f165040b;

    /* renamed from: f */
    public bwhm f129890f;

    static {
        bmkt bmkt = new bmkt();
        f129883g = bmkt;
        bxvk.m124024a(bmkt.class, bmkt);
    }

    private bmkt() {
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
            return bxvk.m124022a(f129883g, "\u0001\u0005\u0000\u0001\u0001\u0010\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0004\u001b\u0007ဉ\u0001\u0010ဉ\u0003", new Object[]{"a", "b", "d", "e", bmqf.class, "c", "f"});
        } else if (i2 == 3) {
            return new bmkt();
        } else {
            if (i2 == 4) {
                return new bxvd(f129883g);
            }
            if (i2 == 5) {
                return f129883g;
            }
            bxxk bxxk = f129884h;
            if (bxxk == null) {
                synchronized (bmkt.class) {
                    bxxk = f129884h;
                    if (bxxk == null) {
                        bxxk = new bxve(f129883g);
                        f129884h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
