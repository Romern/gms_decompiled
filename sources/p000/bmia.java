package p000;

/* renamed from: bmia */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmia extends bxvk implements bxxd {

    /* renamed from: m */
    public static final bmia f129522m;

    /* renamed from: n */
    private static volatile bxxk f129523n;

    /* renamed from: a */
    public int f129524a;

    /* renamed from: b */
    public String f129525b = "";

    /* renamed from: c */
    public String f129526c = "";

    /* renamed from: d */
    public String f129527d = "";

    /* renamed from: e */
    public String f129528e = "";

    /* renamed from: f */
    public int f129529f;

    /* renamed from: g */
    public int f129530g;

    /* renamed from: h */
    public bmbs f129531h;

    /* renamed from: i */
    public String f129532i = "";

    /* renamed from: j */
    public bxwc f129533j = bxxn.f165040b;

    /* renamed from: k */
    public bxtx f129534k = bxtx.f164797b;

    /* renamed from: l */
    public String f129535l = "";

    static {
        bmia bmia = new bmia();
        f129522m = bmia;
        bxvk.m124024a(bmia.class, bmia);
    }

    private bmia() {
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
            return bxvk.m124022a(f129522m, "\u0001\u000b\u0000\u0001\u0001\u000e\u000b\u0000\u0001\u0000\u0001ဈ\u0002\u0002ဈ\u0003\u0003င\u0004\u0004င\u0005\u0006ဈ\u0007\tဈ\u0001\nဉ\u0006\u000bည\b\fဈ\t\rဈ\u0000\u000e\u001b", new Object[]{"a", "d", "e", "f", "g", "i", "c", "h", "k", "l", "b", "j", bmik.class});
        } else if (i2 == 3) {
            return new bmia();
        } else {
            if (i2 == 4) {
                return new bmhz();
            }
            if (i2 == 5) {
                return f129522m;
            }
            bxxk bxxk = f129523n;
            if (bxxk == null) {
                synchronized (bmia.class) {
                    bxxk = f129523n;
                    if (bxxk == null) {
                        bxxk = new bxve(f129522m);
                        f129523n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
