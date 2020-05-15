package p000;

/* renamed from: bmim */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmim extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bmim f129596f;

    /* renamed from: g */
    private static volatile bxxk f129597g;

    /* renamed from: a */
    public int f129598a;

    /* renamed from: b */
    public String f129599b = "";

    /* renamed from: c */
    public bxtx f129600c = bxtx.f164797b;

    /* renamed from: d */
    public String f129601d = "";

    /* renamed from: e */
    public bxwc f129602e = bxxn.f165040b;

    static {
        bmim bmim = new bmim();
        f129596f = bmim;
        bxvk.m124024a(bmim.class, bmim);
    }

    private bmim() {
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
            return bxvk.m124022a(f129596f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0000\u0001ဈ\u0002\u0002ဈ\u0000\u0003ည\u0001\u0006\u001b", new Object[]{"a", "d", "b", "c", "e", bmqk.class});
        } else if (i2 == 3) {
            return new bmim();
        } else {
            if (i2 == 4) {
                return new bxvd((float[]) null, (boolean[]) null);
            }
            if (i2 == 5) {
                return f129596f;
            }
            bxxk bxxk = f129597g;
            if (bxxk == null) {
                synchronized (bmim.class) {
                    bxxk = f129597g;
                    if (bxxk == null) {
                        bxxk = new bxve(f129596f);
                        f129597g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
