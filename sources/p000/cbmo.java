package p000;

/* renamed from: cbmo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbmo extends bxvk implements bxxd {

    /* renamed from: h */
    public static final cbmo f177654h;

    /* renamed from: i */
    private static volatile bxxk f177655i;

    /* renamed from: a */
    public String f177656a = "";

    /* renamed from: b */
    public bxtx f177657b = bxtx.f164797b;

    /* renamed from: c */
    public String f177658c = "";

    /* renamed from: d */
    public bxtx f177659d = bxtx.f164797b;

    /* renamed from: e */
    public cbly f177660e;

    /* renamed from: f */
    public String f177661f = "";

    /* renamed from: g */
    public cbma f177662g;

    static {
        cbmo cbmo = new cbmo();
        f177654h = cbmo;
        bxvk.m124024a(cbmo.class, cbmo);
    }

    private cbmo() {
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
            return bxvk.m124022a(f177654h, "\u0000\u0007\u0000\u0000\u0001\n\u0007\u0000\u0000\u0000\u0001Ȉ\u0003Ȉ\u0006\n\u0007\t\bȈ\t\n\n\t", new Object[]{"a", "c", "d", "e", "f", "b", "g"});
        } else if (i2 == 3) {
            return new cbmo();
        } else {
            if (i2 == 4) {
                return new bxvd(f177654h);
            }
            if (i2 == 5) {
                return f177654h;
            }
            bxxk bxxk = f177655i;
            if (bxxk == null) {
                synchronized (cbmo.class) {
                    bxxk = f177655i;
                    if (bxxk == null) {
                        bxxk = new bxve(f177654h);
                        f177655i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
