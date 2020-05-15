package p000;

/* renamed from: bltz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bltz extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bltz f127762e;

    /* renamed from: g */
    private static volatile bxxk f127763g;

    /* renamed from: a */
    public String f127764a = "";

    /* renamed from: b */
    public String f127765b = "";

    /* renamed from: c */
    public int f127766c;

    /* renamed from: d */
    public bxtx f127767d = bxtx.f164797b;

    /* renamed from: f */
    private int f127768f;

    static {
        bltz bltz = new bltz();
        f127762e = bltz;
        bxvk.m124024a(bltz.class, bltz);
    }

    private bltz() {
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
            return bxvk.m124022a(f127762e, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0005ည\u0003", new Object[]{"f", "a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bltz();
        } else {
            if (i2 == 4) {
                return new bxvd(f127762e);
            }
            if (i2 == 5) {
                return f127762e;
            }
            bxxk bxxk = f127763g;
            if (bxxk == null) {
                synchronized (bltz.class) {
                    bxxk = f127763g;
                    if (bxxk == null) {
                        bxxk = new bxve(f127762e);
                        f127763g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
