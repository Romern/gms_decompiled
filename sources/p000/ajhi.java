package p000;

/* renamed from: ajhi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajhi extends bxvk implements bxxd {

    /* renamed from: l */
    public static final ajhi f70635l;

    /* renamed from: m */
    private static volatile bxxk f70636m;

    /* renamed from: a */
    public int f70637a;

    /* renamed from: b */
    public bxtx f70638b = bxtx.f164797b;

    /* renamed from: c */
    public String f70639c = "";

    /* renamed from: d */
    public bxtx f70640d = bxtx.f164797b;

    /* renamed from: e */
    public long f70641e;

    /* renamed from: f */
    public long f70642f;

    /* renamed from: g */
    public bxvt f70643g = bxvm.f164965b;

    /* renamed from: h */
    public bxtx f70644h = bxtx.f164797b;

    /* renamed from: i */
    public String f70645i = "";

    /* renamed from: j */
    public String f70646j = "";

    /* renamed from: k */
    public String f70647k = "";

    static {
        ajhi ajhi = new ajhi();
        f70635l = ajhi;
        bxvk.m124024a(ajhi.class, ajhi);
    }

    private ajhi() {
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
            return bxvk.m124022a(f70635l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001ည\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006\u0016\u0007ည\u0005\bဈ\u0006\tဈ\u0007\nဈ\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        } else if (i2 == 3) {
            return new ajhi();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][][]) null, (short[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f70635l;
            }
            bxxk bxxk = f70636m;
            if (bxxk == null) {
                synchronized (ajhi.class) {
                    bxxk = f70636m;
                    if (bxxk == null) {
                        bxxk = new bxve(f70635l);
                        f70636m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
