package p000;

/* renamed from: bmry */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmry extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bmry f130619f;

    /* renamed from: g */
    private static volatile bxxk f130620g;

    /* renamed from: a */
    public int f130621a;

    /* renamed from: b */
    public int f130622b = 0;

    /* renamed from: c */
    public Object f130623c;

    /* renamed from: d */
    public bxtx f130624d = bxtx.f164797b;

    /* renamed from: e */
    public bmdk f130625e;

    static {
        bmry bmry = new bmry();
        f130619f = bmry;
        bxvk.m124024a(bmry.class, bmry);
    }

    private bmry() {
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
            return bxvk.m124022a(f130619f, "\u0001\u0007\u0001\u0001\u0001\n\u0007\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0006ည\u0005\u0007ြ\u0000\tြ\u0000\nဉ\u0006", new Object[]{"c", "b", "a", bmer.class, bmfv.class, bmif.class, "d", bmft.class, bmrt.class, "e"});
        } else if (i2 == 3) {
            return new bmry();
        } else {
            if (i2 == 4) {
                return new bxvd(f130619f);
            }
            if (i2 == 5) {
                return f130619f;
            }
            bxxk bxxk = f130620g;
            if (bxxk == null) {
                synchronized (bmry.class) {
                    bxxk = f130620g;
                    if (bxxk == null) {
                        bxxk = new bxve(f130619f);
                        f130620g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
