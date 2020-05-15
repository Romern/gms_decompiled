package p000;

/* renamed from: bogi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bogi extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bogi f132990f;

    /* renamed from: g */
    private static volatile bxxk f132991g;

    /* renamed from: a */
    public int f132992a;

    /* renamed from: b */
    public String f132993b = "";

    /* renamed from: c */
    public boolean f132994c;

    /* renamed from: d */
    public boolean f132995d;

    /* renamed from: e */
    public int f132996e;

    static {
        bogi bogi = new bogi();
        f132990f = bogi;
        GeneratedMessageLite.m124024a(bogi.class, bogi);
    }

    private bogi() {
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
            return GeneratedMessageLite.m124022a(f132990f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", "c", "d", "e", bogl.f133002a});
        } else if (i2 == 3) {
            return new bogi();
        } else {
            if (i2 == 4) {
                return new bxvd(f132990f);
            }
            if (i2 == 5) {
                return f132990f;
            }
            bxxk bxxk = f132991g;
            if (bxxk == null) {
                synchronized (bogi.class) {
                    bxxk = f132991g;
                    if (bxxk == null) {
                        bxxk = new bxve(f132990f);
                        f132991g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
