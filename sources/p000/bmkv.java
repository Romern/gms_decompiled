package p000;

/* renamed from: bmkv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmkv extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bmkv f129891f;

    /* renamed from: g */
    private static volatile bxxk f129892g;

    /* renamed from: a */
    public int f129893a;

    /* renamed from: b */
    public String f129894b = "";

    /* renamed from: c */
    public long f129895c;

    /* renamed from: d */
    public bxtx f129896d = bxtx.f164797b;

    /* renamed from: e */
    public bxwc f129897e = bxxn.f165040b;

    static {
        bmkv bmkv = new bmkv();
        f129891f = bmkv;
        bxvk.m124024a(bmkv.class, bmkv);
    }

    private bmkv() {
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
            return bxvk.m124022a(f129891f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0003\u001b\u0004ည\u0002\u0006ဂ\u0001", new Object[]{"a", "b", "e", bmqk.class, "d", "c"});
        } else if (i2 == 3) {
            return new bmkv();
        } else {
            if (i2 == 4) {
                return new bmku();
            }
            if (i2 == 5) {
                return f129891f;
            }
            bxxk bxxk = f129892g;
            if (bxxk == null) {
                synchronized (bmkv.class) {
                    bxxk = f129892g;
                    if (bxxk == null) {
                        bxxk = new bxve(f129891f);
                        f129892g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
