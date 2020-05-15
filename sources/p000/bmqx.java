package p000;

/* renamed from: bmqx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmqx extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bmqx f130447d;

    /* renamed from: e */
    private static volatile bxxk f130448e;

    /* renamed from: a */
    public int f130449a;

    /* renamed from: b */
    public bxwc f130450b = bxxn.f165040b;

    /* renamed from: c */
    public String f130451c = "";

    static {
        bmqx bmqx = new bmqx();
        f130447d = bmqx;
        bxvk.m124024a(bmqx.class, bmqx);
    }

    private bmqx() {
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
            return bxvk.m124022a(f130447d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bmqx();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][][]) null, (int[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f130447d;
            }
            bxxk bxxk = f130448e;
            if (bxxk == null) {
                synchronized (bmqx.class) {
                    bxxk = f130448e;
                    if (bxxk == null) {
                        bxxk = new bxve(f130447d);
                        f130448e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
