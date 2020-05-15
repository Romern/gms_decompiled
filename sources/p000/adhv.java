package p000;

/* renamed from: adhv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adhv extends bxvk implements bxxd {

    /* renamed from: m */
    public static final adhv f61728m;

    /* renamed from: n */
    private static volatile bxxk f61729n;

    /* renamed from: a */
    public bxwc f61730a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f61731b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f61732c = bxxn.f165040b;

    /* renamed from: d */
    public int f61733d;

    /* renamed from: e */
    public bxtx f61734e = bxtx.f164797b;

    /* renamed from: f */
    public String f61735f = "";

    /* renamed from: g */
    public long f61736g;

    /* renamed from: h */
    public bxtx f61737h = bxtx.f164797b;

    /* renamed from: i */
    public int f61738i;

    /* renamed from: j */
    public int f61739j;

    /* renamed from: k */
    public bxwc f61740k = bxxn.f165040b;

    /* renamed from: l */
    public int f61741l;

    static {
        adhv adhv = new adhv();
        f61728m = adhv;
        bxvk.m124024a(adhv.class, adhv);
    }

    private adhv() {
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
            return bxvk.m124022a(f61728m, "\u0000\f\u0000\u0000\u0001\r\f\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u0004\u0004\n\u0005Ȉ\u0006\u0002\b\u001b\t\n\nȚ\u000b\u0004\f\u0004\r\u0004", new Object[]{"a", adig.class, "b", adib.class, "d", "e", "f", "g", "c", adih.class, "h", "k", "l", "i", "j"});
        } else if (i2 == 3) {
            return new adhv();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][]) null, (char[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f61728m;
            }
            bxxk bxxk = f61729n;
            if (bxxk == null) {
                synchronized (adhv.class) {
                    bxxk = f61729n;
                    if (bxxk == null) {
                        bxxk = new bxve(f61728m);
                        f61729n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
