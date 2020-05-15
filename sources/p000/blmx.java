package p000;

/* renamed from: blmx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blmx extends bxvk implements bxxd {

    /* renamed from: f */
    public static final blmx f126913f;

    /* renamed from: h */
    private static volatile bxxk f126914h;

    /* renamed from: a */
    public int f126915a;

    /* renamed from: b */
    public String f126916b = "";

    /* renamed from: c */
    public boolean f126917c;

    /* renamed from: d */
    public int f126918d;

    /* renamed from: e */
    public boolean f126919e;

    /* renamed from: g */
    private byte f126920g = 2;

    static {
        blmx blmx = new blmx();
        f126913f = blmx;
        bxvk.m124024a(blmx.class, blmx);
    }

    private blmx() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f126920g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f126920g = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f126913f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001ᔈ\u0000\u0002ᔇ\u0001\u0003ᔄ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new blmx();
        } else {
            if (i2 == 4) {
                return new bxvd(f126913f);
            }
            if (i2 == 5) {
                return f126913f;
            }
            bxxk bxxk = f126914h;
            if (bxxk == null) {
                synchronized (blmx.class) {
                    bxxk = f126914h;
                    if (bxxk == null) {
                        bxxk = new bxve(f126913f);
                        f126914h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
