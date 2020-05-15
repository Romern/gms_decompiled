package p000;

/* renamed from: bplu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bplu extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bplu f138167g;

    /* renamed from: h */
    private static volatile bxxk f138168h;

    /* renamed from: a */
    public int f138169a;

    /* renamed from: b */
    public long f138170b;

    /* renamed from: c */
    public bplm f138171c;

    /* renamed from: d */
    public long f138172d;

    /* renamed from: e */
    public int f138173e;

    /* renamed from: f */
    public boolean f138174f;

    static {
        bplu bplu = new bplu();
        f138167g = bplu;
        bxvk.m124024a(bplu.class, bplu);
    }

    private bplu() {
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
            return bxvk.m124022a(f138167g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001စ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004င\u0003\u0005ဇ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bplu();
        } else {
            if (i2 == 4) {
                return new bxvd(f138167g);
            }
            if (i2 == 5) {
                return f138167g;
            }
            bxxk bxxk = f138168h;
            if (bxxk == null) {
                synchronized (bplu.class) {
                    bxxk = f138168h;
                    if (bxxk == null) {
                        bxxk = new bxve(f138167g);
                        f138168h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
