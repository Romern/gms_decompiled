package p000;

/* renamed from: bkkx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkkx extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bkkx f124663f;

    /* renamed from: g */
    private static volatile bxxk f124664g;

    /* renamed from: a */
    public int f124665a;

    /* renamed from: b */
    public int f124666b = 0;

    /* renamed from: c */
    public Object f124667c;

    /* renamed from: d */
    public String f124668d = "";

    /* renamed from: e */
    public int f124669e;

    static {
        bkkx bkkx = new bkkx();
        f124663f = bkkx;
        bxvk.m124024a(bkkx.class, bkkx);
    }

    private bkkx() {
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
            return bxvk.m124022a(f124663f, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ြ\u0000", new Object[]{"c", "b", "a", "d", "e", bybu.f165599a, bybv.class});
        } else if (i2 == 3) {
            return new bkkx();
        } else {
            if (i2 == 4) {
                return new bxvd(f124663f);
            }
            if (i2 == 5) {
                return f124663f;
            }
            bxxk bxxk = f124664g;
            if (bxxk == null) {
                synchronized (bkkx.class) {
                    bxxk = f124664g;
                    if (bxxk == null) {
                        bxxk = new bxve(f124663f);
                        f124664g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
