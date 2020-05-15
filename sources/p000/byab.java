package p000;

/* renamed from: byab */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byab extends bxvk implements bxxd {

    /* renamed from: h */
    public static final byab f165222h;

    /* renamed from: i */
    private static volatile bxxk f165223i;

    /* renamed from: a */
    public int f165224a;

    /* renamed from: b */
    public bxtx f165225b = bxtx.f164797b;

    /* renamed from: c */
    public String f165226c = "";

    /* renamed from: d */
    public int f165227d;

    /* renamed from: e */
    public String f165228e = "";

    /* renamed from: f */
    public String f165229f = "";

    /* renamed from: g */
    public bxvt f165230g = bxvm.f164965b;

    static {
        byab byab = new byab();
        f165222h = byab;
        bxvk.m124024a(byab.class, byab);
    }

    private byab() {
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
            return bxvk.m124022a(f165222h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ည\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006\u001e", new Object[]{"a", "b", "c", "d", "e", "f", "g", blwq.m107724b()});
        } else if (i2 == 3) {
            return new byab();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][]) null, (short[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f165222h;
            }
            bxxk bxxk = f165223i;
            if (bxxk == null) {
                synchronized (byab.class) {
                    bxxk = f165223i;
                    if (bxxk == null) {
                        bxxk = new bxve(f165222h);
                        f165223i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
