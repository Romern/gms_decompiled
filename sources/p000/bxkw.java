package p000;

/* renamed from: bxkw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxkw extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bxkw f163802e;

    /* renamed from: f */
    public static final bxvj f163803f;

    /* renamed from: h */
    private static volatile bxxk f163804h;

    /* renamed from: a */
    public int f163805a;

    /* renamed from: b */
    public bxik f163806b;

    /* renamed from: c */
    public bxtx f163807c = bxtx.f164797b;

    /* renamed from: d */
    public int f163808d;

    /* renamed from: g */
    private int f163809g;

    static {
        bxkw bxkw = new bxkw();
        f163802e = bxkw;
        bxvk.m124024a(bxkw.class, bxkw);
        bxcf bxcf = bxcf.f162779a;
        bxkw bxkw2 = f163802e;
        f163803f = bxvk.m124006a(bxcf, bxkw2, bxkw2, 111456957, bxzf.MESSAGE);
    }

    private bxkw() {
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
            return bxvk.m124022a(f163802e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ည\u0002\u0004င\u0003", new Object[]{"g", "a", bxco.m122578b(), "b", "c", "d"});
        } else if (i2 == 3) {
            return new bxkw();
        } else {
            if (i2 == 4) {
                return new bxvd(f163802e);
            }
            if (i2 == 5) {
                return f163802e;
            }
            bxxk bxxk = f163804h;
            if (bxxk == null) {
                synchronized (bxkw.class) {
                    bxxk = f163804h;
                    if (bxxk == null) {
                        bxxk = new bxve(f163802e);
                        f163804h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
