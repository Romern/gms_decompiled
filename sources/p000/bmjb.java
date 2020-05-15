package p000;

/* renamed from: bmjb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmjb extends bxvk implements bxxd {

    /* renamed from: l */
    public static final bmjb f129661l;

    /* renamed from: m */
    private static volatile bxxk f129662m;

    /* renamed from: a */
    public int f129663a;

    /* renamed from: b */
    public bmdn f129664b;

    /* renamed from: c */
    public int f129665c;

    /* renamed from: d */
    public bxtx f129666d = bxtx.f164797b;

    /* renamed from: e */
    public String f129667e = "";

    /* renamed from: f */
    public bmqf f129668f;

    /* renamed from: g */
    public bmqf f129669g;

    /* renamed from: h */
    public String f129670h = "";

    /* renamed from: i */
    public bmjf f129671i;

    /* renamed from: j */
    public bxwc f129672j = bxxn.f165040b;

    /* renamed from: k */
    public bmiy f129673k;

    static {
        bmjb bmjb = new bmjb();
        f129661l = bmjb;
        bxvk.m124024a(bmjb.class, bmjb);
    }

    private bmjb() {
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
            return bxvk.m124022a(f129661l, "\u0001\n\u0000\u0001\u0002\r\n\u0000\u0001\u0000\u0002ဌ\u0001\u0004ည\u0002\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဈ\u0006\bဉ\u0007\nဈ\u0003\u000bဉ\u0000\fဉ\b\r\u001b", new Object[]{"a", "c", bmiz.f129660a, "d", "f", "g", "h", "i", "e", "b", "k", "j", bmqf.class});
        } else if (i2 == 3) {
            return new bmjb();
        } else {
            if (i2 == 4) {
                return new bxvd(f129661l);
            }
            if (i2 == 5) {
                return f129661l;
            }
            bxxk bxxk = f129662m;
            if (bxxk == null) {
                synchronized (bmjb.class) {
                    bxxk = f129662m;
                    if (bxxk == null) {
                        bxxk = new bxve(f129661l);
                        f129662m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
