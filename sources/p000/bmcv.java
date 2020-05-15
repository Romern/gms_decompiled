package p000;

/* renamed from: bmcv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmcv extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bmcv f128750g;

    /* renamed from: h */
    private static volatile bxxk f128751h;

    /* renamed from: a */
    public int f128752a;

    /* renamed from: b */
    public String f128753b = "";

    /* renamed from: c */
    public int f128754c;

    /* renamed from: d */
    public String f128755d = "";

    /* renamed from: e */
    public int f128756e;

    /* renamed from: f */
    public bmco f128757f;

    static {
        bmcv bmcv = new bmcv();
        f128750g = bmcv;
        GeneratedMessageLite.m124024a(bmcv.class, bmcv);
    }

    private bmcv() {
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
            return GeneratedMessageLite.m124022a(f128750g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဌ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", "c", bmcu.f128749a, "d", "e", bmcd.f128662a, "f"});
        } else if (i2 == 3) {
            return new bmcv();
        } else {
            if (i2 == 4) {
                return new bxvd(f128750g);
            }
            if (i2 == 5) {
                return f128750g;
            }
            bxxk bxxk = f128751h;
            if (bxxk == null) {
                synchronized (bmcv.class) {
                    bxxk = f128751h;
                    if (bxxk == null) {
                        bxxk = new bxve(f128750g);
                        f128751h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
