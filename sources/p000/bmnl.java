package p000;

/* renamed from: bmnl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmnl extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bmnl f130117h;

    /* renamed from: j */
    private static volatile bxxk f130118j;

    /* renamed from: a */
    public int f130119a;

    /* renamed from: b */
    public int f130120b;

    /* renamed from: c */
    public String f130121c = "";

    /* renamed from: d */
    public boolean f130122d;

    /* renamed from: e */
    public String f130123e = "";

    /* renamed from: f */
    public String f130124f = "";

    /* renamed from: g */
    public bxvt f130125g = bxvm.f164965b;

    /* renamed from: i */
    private int f130126i;

    static {
        bmnl bmnl = new bmnl();
        f130117h = bmnl;
        GeneratedMessageLite.m124024a(bmnl.class, bmnl);
    }

    private bmnl() {
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
            return GeneratedMessageLite.m124022a(f130117h, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007\u0016", new Object[]{"i", "a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bmnl();
        } else {
            if (i2 == 4) {
                return new bxvd(f130117h);
            }
            if (i2 == 5) {
                return f130117h;
            }
            bxxk bxxk = f130118j;
            if (bxxk == null) {
                synchronized (bmnl.class) {
                    bxxk = f130118j;
                    if (bxxk == null) {
                        bxxk = new bxve(f130117h);
                        f130118j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
