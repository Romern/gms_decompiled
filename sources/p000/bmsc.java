package p000;

/* renamed from: bmsc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmsc extends bxvk implements bxxd {

    /* renamed from: l */
    public static final bmsc f130646l;

    /* renamed from: n */
    private static volatile bxxk f130647n;

    /* renamed from: a */
    public int f130648a;

    /* renamed from: b */
    public int f130649b = 0;

    /* renamed from: c */
    public Object f130650c;

    /* renamed from: d */
    public bmav f130651d;

    /* renamed from: e */
    public bmaq f130652e;

    /* renamed from: f */
    public bmar f130653f;

    /* renamed from: g */
    public boolean f130654g;

    /* renamed from: h */
    public int f130655h;

    /* renamed from: i */
    public String f130656i = "";

    /* renamed from: j */
    public long f130657j;

    /* renamed from: k */
    public bmag f130658k;

    /* renamed from: m */
    private byte f130659m = 2;

    static {
        bmsc bmsc = new bmsc();
        f130646l = bmsc;
        bxvk.m124024a(bmsc.class, bmsc);
    }

    private bmsc() {
        bxtx bxtx = bxtx.f164797b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f130659m);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f130659m = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f130646l, "\u0001\n\u0001\u0001\u0001\f\n\u0000\u0000\u0001\u0001ဈ\u0005\u0002ᐼ\u0000\u0003ဉ\u0000\u0004ဉ\u0001\u0005ဇ\u0003\u0006်\u0000\u0007ဂ\b\bဉ\u0002\tဌ\u0004\fဉ\n", new Object[]{"c", "b", "a", "i", bmrx.class, "d", "e", "g", "j", "f", "h", bwgz.m121953b(), "k"});
        } else if (i2 == 3) {
            return new bmsc();
        } else {
            if (i2 == 4) {
                return new bxvd(f130646l);
            }
            if (i2 == 5) {
                return f130646l;
            }
            bxxk bxxk = f130647n;
            if (bxxk == null) {
                synchronized (bmsc.class) {
                    bxxk = f130647n;
                    if (bxxk == null) {
                        bxxk = new bxve(f130646l);
                        f130647n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
