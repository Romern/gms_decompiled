package p000;

/* renamed from: ghj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ghj extends bxvk implements bxxd {

    /* renamed from: h */
    public static final ghj f18244h;

    /* renamed from: i */
    private static volatile bxxk f18245i;

    /* renamed from: a */
    public int f18246a;

    /* renamed from: b */
    public int f18247b;

    /* renamed from: c */
    public int f18248c;

    /* renamed from: d */
    public int f18249d;

    /* renamed from: e */
    public String f18250e = "";

    /* renamed from: f */
    public int f18251f;

    /* renamed from: g */
    public int f18252g;

    static {
        ghj ghj = new ghj();
        f18244h = ghj;
        bxvk.m124024a(ghj.class, ghj);
    }

    private ghj() {
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
            return bxvk.m124022a(f18244h, "\u0001\u0006\u0000\u0001\u0002\u0007\u0006\u0000\u0000\u0000\u0002ဌ\u0000\u0003ဌ\u0001\u0004ဌ\u0002\u0005ဈ\u0003\u0006င\u0004\u0007င\u0005", new Object[]{"a", "b", ghh.f18242a, "c", ghg.f18241a, "d", ghi.f18243a, "e", "f", "g"});
        } else if (i2 == 3) {
            return new ghj();
        } else {
            if (i2 == 4) {
                return new bxvd(f18244h);
            }
            if (i2 == 5) {
                return f18244h;
            }
            bxxk bxxk = f18245i;
            if (bxxk == null) {
                synchronized (ghj.class) {
                    bxxk = f18245i;
                    if (bxxk == null) {
                        bxxk = new bxve(f18244h);
                        f18245i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
