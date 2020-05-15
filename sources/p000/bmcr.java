package p000;

/* renamed from: bmcr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmcr extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bmcr f128730g;

    /* renamed from: i */
    private static volatile bxxk f128731i;

    /* renamed from: a */
    public bmdn f128732a;

    /* renamed from: b */
    public int f128733b;

    /* renamed from: c */
    public bmdb f128734c;

    /* renamed from: d */
    public String f128735d = "";

    /* renamed from: e */
    public String f128736e = "";

    /* renamed from: f */
    public bmcw f128737f;

    /* renamed from: h */
    private int f128738h;

    static {
        bmcr bmcr = new bmcr();
        f128730g = bmcr;
        GeneratedMessageLite.m124024a(bmcr.class, bmcr);
    }

    private bmcr() {
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
            return GeneratedMessageLite.m124022a(f128730g, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0002\u0003ဈ\u0003\u0004ဈ\u0004\u0005ဉ\u0005\u0006ဌ\u0001", new Object[]{"h", "a", "c", "d", "e", "f", "b", bmcp.f128729a});
        } else if (i2 == 3) {
            return new bmcr();
        } else {
            if (i2 == 4) {
                return new bxvd(f128730g);
            }
            if (i2 == 5) {
                return f128730g;
            }
            bxxk bxxk = f128731i;
            if (bxxk == null) {
                synchronized (bmcr.class) {
                    bxxk = f128731i;
                    if (bxxk == null) {
                        bxxk = new bxve(f128730g);
                        f128731i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
