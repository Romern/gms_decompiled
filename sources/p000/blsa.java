package p000;

/* renamed from: blsa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blsa extends bxvk implements bxxd {

    /* renamed from: c */
    public static final blsa f127560c;

    /* renamed from: d */
    private static volatile bxxk f127561d;

    /* renamed from: a */
    public int f127562a;

    /* renamed from: b */
    public bxtx f127563b = bxtx.f164797b;

    static {
        blsa blsa = new blsa();
        f127560c = blsa;
        bxvk.m124024a(blsa.class, blsa);
    }

    private blsa() {
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
            return bxvk.m124022a(f127560c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new blsa();
        } else {
            if (i2 == 4) {
                return new bxvd(f127560c);
            }
            if (i2 == 5) {
                return f127560c;
            }
            bxxk bxxk = f127561d;
            if (bxxk == null) {
                synchronized (blsa.class) {
                    bxxk = f127561d;
                    if (bxxk == null) {
                        bxxk = new bxve(f127560c);
                        f127561d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
