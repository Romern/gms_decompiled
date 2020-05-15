package p000;

/* renamed from: aufk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aufk extends bxvk implements bxxd {

    /* renamed from: h */
    public static final aufk f91684h;

    /* renamed from: i */
    private static volatile bxxk f91685i;

    /* renamed from: a */
    public int f91686a;

    /* renamed from: b */
    public int f91687b;

    /* renamed from: c */
    public boolean f91688c;

    /* renamed from: d */
    public String f91689d = "";

    /* renamed from: e */
    public int f91690e;

    /* renamed from: f */
    public String f91691f = "";

    /* renamed from: g */
    public bxtx f91692g = bxtx.f164797b;

    static {
        aufk aufk = new aufk();
        f91684h = aufk;
        bxvk.m124024a(aufk.class, aufk);
    }

    private aufk() {
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
            return bxvk.m124022a(f91684h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဈ\u0004\u0006ည\u0005", new Object[]{"a", "b", aufi.f91683a, "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new aufk();
        } else {
            if (i2 == 4) {
                return new bxvd(f91684h);
            }
            if (i2 == 5) {
                return f91684h;
            }
            bxxk bxxk = f91685i;
            if (bxxk == null) {
                synchronized (aufk.class) {
                    bxxk = f91685i;
                    if (bxxk == null) {
                        bxxk = new bxve(f91684h);
                        f91685i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
