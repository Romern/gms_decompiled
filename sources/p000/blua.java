package p000;

/* renamed from: blua */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blua extends bxvk implements bxxd {

    /* renamed from: c */
    public static final blua f127769c;

    /* renamed from: d */
    private static volatile bxxk f127770d;

    /* renamed from: a */
    public int f127771a;

    /* renamed from: b */
    public bxtx f127772b = bxtx.f164797b;

    static {
        blua blua = new blua();
        f127769c = blua;
        bxvk.m124024a(blua.class, blua);
    }

    private blua() {
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
            return bxvk.m124022a(f127769c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new blua();
        } else {
            if (i2 == 4) {
                return new bxvd(f127769c);
            }
            if (i2 == 5) {
                return f127769c;
            }
            bxxk bxxk = f127770d;
            if (bxxk == null) {
                synchronized (blua.class) {
                    bxxk = f127770d;
                    if (bxxk == null) {
                        bxxk = new bxve(f127769c);
                        f127770d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
