package p000;

/* renamed from: boli */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boli extends bxvk implements bxxd {

    /* renamed from: n */
    public static final boli f133531n;

    /* renamed from: o */
    private static volatile bxxk f133532o;

    /* renamed from: a */
    public int f133533a;

    /* renamed from: b */
    public int f133534b;

    /* renamed from: c */
    public int f133535c;

    /* renamed from: d */
    public int f133536d;

    /* renamed from: e */
    public String f133537e = "";

    /* renamed from: f */
    public String f133538f = "";

    /* renamed from: g */
    public long f133539g;

    /* renamed from: h */
    public int f133540h;

    /* renamed from: i */
    public int f133541i;

    /* renamed from: j */
    public int f133542j;

    /* renamed from: k */
    public int f133543k;

    /* renamed from: l */
    public boolean f133544l;

    /* renamed from: m */
    public boolean f133545m;

    static {
        boli boli = new boli();
        f133531n = boli;
        bxvk.m124024a(boli.class, boli);
    }

    private boli() {
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
            return bxvk.m124022a(f133531n, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဌ\u0006\bဌ\u0007\tဌ\b\nဌ\t\u000bဇ\n\fဇ\u000b", new Object[]{"a", "b", bolq.f133569a, "c", bolk.f133555a, "d", bolk.f133555a, "e", "f", "g", "h", boll.f133556a, "i", bolm.f133557a, "j", bolk.f133555a, "k", boll.f133556a, "l", "m"});
        } else if (i2 == 3) {
            return new boli();
        } else {
            if (i2 == 4) {
                return new bxvd(f133531n);
            }
            if (i2 == 5) {
                return f133531n;
            }
            bxxk bxxk = f133532o;
            if (bxxk == null) {
                synchronized (boli.class) {
                    bxxk = f133532o;
                    if (bxxk == null) {
                        bxxk = new bxve(f133531n);
                        f133532o = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
