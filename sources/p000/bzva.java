package p000;

/* renamed from: bzva */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzva extends bxvk implements bxxd {

    /* renamed from: j */
    public static final bzva f171489j;

    /* renamed from: k */
    private static volatile bxxk f171490k;

    /* renamed from: a */
    public int f171491a = 0;

    /* renamed from: b */
    public Object f171492b;

    /* renamed from: c */
    public int f171493c = 0;

    /* renamed from: d */
    public Object f171494d;

    /* renamed from: e */
    public String f171495e = "";

    /* renamed from: f */
    public bzvb f171496f;

    /* renamed from: g */
    public bxwc f171497g = bxxn.f165040b;

    /* renamed from: h */
    public int f171498h;

    /* renamed from: i */
    public int f171499i;

    static {
        bzva bzva = new bzva();
        f171489j = bzva;
        bxvk.m124024a(bzva.class, bzva);
    }

    private bzva() {
        bxvm bxvm = bxvm.f164965b;
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
            return bxvk.m124022a(f171489j, "\u0000\r\u0002\u0000\u0001\u0019\r\u0000\u0001\u0000\u0001Ȉ\u0002\t\u0005\f\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000e<\u0001\u000f<\u0001\u0013\u001b\u0015\f\u0018<\u0000\u0019<\u0000", new Object[]{"b", "a", "d", "c", "e", "f", "h", bzuu.class, bzut.class, bzuw.class, bzux.class, bzuy.class, bzuz.class, "g", bzvc.class, "i", bzve.class, bzvd.class});
        } else if (i2 == 3) {
            return new bzva();
        } else {
            if (i2 == 4) {
                return new bxvd(f171489j);
            }
            if (i2 == 5) {
                return f171489j;
            }
            bxxk bxxk = f171490k;
            if (bxxk == null) {
                synchronized (bzva.class) {
                    bxxk = f171490k;
                    if (bxxk == null) {
                        bxxk = new bxve(f171489j);
                        f171490k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
