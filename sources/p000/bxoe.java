package p000;

/* renamed from: bxoe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxoe extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bxoe f164138e;

    /* renamed from: g */
    private static volatile bxxk f164139g;

    /* renamed from: a */
    public int f164140a;

    /* renamed from: b */
    public int f164141b;

    /* renamed from: c */
    public String f164142c = "";

    /* renamed from: d */
    public String f164143d = "";

    /* renamed from: f */
    private int f164144f;

    static {
        bxoe bxoe = new bxoe();
        f164138e = bxoe;
        bxvk.m124024a(bxoe.class, bxoe);
    }

    private bxoe() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m122917a(bxoe bxoe) {
        bxoe.f164140a |= 8;
        bxoe.f164144f = 0;
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
            return bxvk.m124022a(f164138e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003", new Object[]{"a", "b", bxqd.f164367a, "c", "d", "f"});
        } else if (i2 == 3) {
            return new bxoe();
        } else {
            if (i2 == 4) {
                return new bxvd(f164138e);
            }
            if (i2 == 5) {
                return f164138e;
            }
            bxxk bxxk = f164139g;
            if (bxxk == null) {
                synchronized (bxoe.class) {
                    bxxk = f164139g;
                    if (bxxk == null) {
                        bxxk = new bxve(f164138e);
                        f164139g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
