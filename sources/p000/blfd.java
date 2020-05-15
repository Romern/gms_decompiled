package p000;

/* renamed from: blfd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blfd extends bxvk implements bxxd {

    /* renamed from: g */
    public static final blfd f126337g;

    /* renamed from: h */
    private static volatile bxxk f126338h;

    /* renamed from: a */
    public int f126339a;

    /* renamed from: b */
    public int f126340b;

    /* renamed from: c */
    public String f126341c = "";

    /* renamed from: d */
    public boolean f126342d;

    /* renamed from: e */
    public long f126343e;

    /* renamed from: f */
    public String f126344f = "";

    static {
        blfd blfd = new blfd();
        f126337g = blfd;
        bxvk.m124024a(blfd.class, blfd);
    }

    private blfd() {
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
            return bxvk.m124022a(f126337g, "\u0001\u0005\u0000\u0001\u0002\u0006\u0005\u0000\u0000\u0000\u0002ဈ\u0002\u0003ဇ\u0003\u0004ဂ\u0004\u0005ဈ\u0006\u0006ဌ\u0001", new Object[]{"a", "c", "d", "e", "f", "b", bldm.f126106a});
        } else if (i2 == 3) {
            return new blfd();
        } else {
            if (i2 == 4) {
                return new bxvd(f126337g);
            }
            if (i2 == 5) {
                return f126337g;
            }
            bxxk bxxk = f126338h;
            if (bxxk == null) {
                synchronized (blfd.class) {
                    bxxk = f126338h;
                    if (bxxk == null) {
                        bxxk = new bxve(f126337g);
                        f126338h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
