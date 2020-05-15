package p000;

/* renamed from: bmsp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmsp extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bmsp f130728e;

    /* renamed from: f */
    private static volatile bxxk f130729f;

    /* renamed from: a */
    public bxtx f130730a = bxtx.f164797b;

    /* renamed from: b */
    public bxtx f130731b = bxtx.f164797b;

    /* renamed from: c */
    public bxtx f130732c = bxtx.f164797b;

    /* renamed from: d */
    public String f130733d = "";

    static {
        bmsp bmsp = new bmsp();
        f130728e = bmsp;
        bxvk.m124024a(bmsp.class, bmsp);
    }

    private bmsp() {
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
            return bxvk.m124022a(f130728e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\n\u0002\n\u0003\n\u0004\b", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bmsp();
        } else {
            if (i2 == 4) {
                return new bxvd(f130728e);
            }
            if (i2 == 5) {
                return f130728e;
            }
            bxxk bxxk = f130729f;
            if (bxxk == null) {
                synchronized (bmsp.class) {
                    bxxk = f130729f;
                    if (bxxk == null) {
                        bxxk = new bxve(f130728e);
                        f130729f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
