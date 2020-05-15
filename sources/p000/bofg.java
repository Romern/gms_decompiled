package p000;

/* renamed from: bofg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bofg extends bxvk implements bxxd {

    /* renamed from: j */
    public static final bofg f132892j;

    /* renamed from: k */
    private static volatile bxxk f132893k;

    /* renamed from: a */
    public int f132894a;

    /* renamed from: b */
    public boolean f132895b;

    /* renamed from: c */
    public boolean f132896c;

    /* renamed from: d */
    public boolean f132897d;

    /* renamed from: e */
    public int f132898e;

    /* renamed from: f */
    public boolean f132899f;

    /* renamed from: g */
    public boolean f132900g;

    /* renamed from: h */
    public boolean f132901h;

    /* renamed from: i */
    public bxvt f132902i = bxvm.f164965b;

    static {
        bofg bofg = new bofg();
        f132892j = bofg;
        bxvk.m124024a(bofg.class, bofg);
    }

    private bofg() {
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
            return bxvk.m124022a(f132892j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဋ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\b\u0016", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new bofg();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][]) null, (short[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f132892j;
            }
            bxxk bxxk = f132893k;
            if (bxxk == null) {
                synchronized (bofg.class) {
                    bxxk = f132893k;
                    if (bxxk == null) {
                        bxxk = new bxve(f132892j);
                        f132893k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
