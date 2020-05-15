package p000;

/* renamed from: bmcm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmcm extends bxvg implements bxvh {

    /* renamed from: f */
    public static final bmcm f128714f;

    /* renamed from: h */
    private static volatile bxxk f128715h;

    /* renamed from: a */
    public int f128716a;

    /* renamed from: b */
    public bmdn f128717b;

    /* renamed from: c */
    public bmdb f128718c;

    /* renamed from: d */
    public bmde f128719d;

    /* renamed from: e */
    public bmdb f128720e;

    /* renamed from: g */
    private byte f128721g = 2;

    static {
        bmcm bmcm = new bmcm();
        f128714f = bmcm;
        GeneratedMessageLite.m124024a(bmcm.class, bmcm);
    }

    private bmcm() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f128721g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f128721g = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f128714f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0005ဉ\u0002\u0006ဉ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bmcm();
        } else {
            if (i2 == 4) {
                return new bxvf(f128714f);
            }
            if (i2 == 5) {
                return f128714f;
            }
            bxxk bxxk = f128715h;
            if (bxxk == null) {
                synchronized (bmcm.class) {
                    bxxk = f128715h;
                    if (bxxk == null) {
                        bxxk = new bxve(f128714f);
                        f128715h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
