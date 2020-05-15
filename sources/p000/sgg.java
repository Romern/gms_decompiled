package p000;

/* renamed from: sgg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sgg extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final sgg f44168h;

    /* renamed from: i */
    private static volatile bxxk f44169i;

    /* renamed from: a */
    public String f44170a = "";

    /* renamed from: b */
    public String f44171b = "";

    /* renamed from: c */
    public String f44172c = "";

    /* renamed from: d */
    public String f44173d = "";

    /* renamed from: e */
    public String f44174e = "";

    /* renamed from: f */
    public String f44175f = "";

    /* renamed from: g */
    public String f44176g = "";

    static {
        sgg sgg = new sgg();
        f44168h = sgg;
        GeneratedMessageLite.m124024a(sgg.class, sgg);
    }

    private sgg() {
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
            return GeneratedMessageLite.m124022a(f44168h, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new sgg();
        } else {
            if (i2 == 4) {
                return new bxvd(f44168h);
            }
            if (i2 == 5) {
                return f44168h;
            }
            bxxk bxxk = f44169i;
            if (bxxk == null) {
                synchronized (sgg.class) {
                    bxxk = f44169i;
                    if (bxxk == null) {
                        bxxk = new bxve(f44168h);
                        f44169i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
