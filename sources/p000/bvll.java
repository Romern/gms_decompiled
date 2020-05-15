package p000;

/* renamed from: bvll */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvll extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bvll f156559d;

    /* renamed from: e */
    private static volatile bxxk f156560e;

    /* renamed from: a */
    public int f156561a;

    /* renamed from: b */
    public bxvw f156562b = bxwq.f165002b;

    /* renamed from: c */
    public String f156563c = "";

    static {
        bvll bvll = new bvll();
        f156559d = bvll;
        bxvk.m124024a(bvll.class, bvll);
    }

    private bvll() {
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
            return bxvk.m124022a(f156559d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u0017", new Object[]{"a", "c", "b"});
        } else if (i2 == 3) {
            return new bvll();
        } else {
            if (i2 == 4) {
                return new bxvd((short[]) null, (byte[][]) null);
            }
            if (i2 == 5) {
                return f156559d;
            }
            bxxk bxxk = f156560e;
            if (bxxk == null) {
                synchronized (bvll.class) {
                    bxxk = f156560e;
                    if (bxxk == null) {
                        bxxk = new bxve(f156559d);
                        f156560e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
