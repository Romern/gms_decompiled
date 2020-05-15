package p000;

/* renamed from: btbb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btbb extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final btbb f148093d;

    /* renamed from: e */
    private static volatile bxxk f148094e;

    /* renamed from: a */
    public String f148095a = "";

    /* renamed from: b */
    public String f148096b = "";

    /* renamed from: c */
    public String f148097c = "";

    static {
        btbb btbb = new btbb();
        f148093d = btbb;
        GeneratedMessageLite.m124024a(btbb.class, btbb);
    }

    private btbb() {
        bxvm bxvm = bxvm.f164965b;
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
            return GeneratedMessageLite.m124022a(f148093d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new btbb();
        } else {
            if (i2 == 4) {
                return new bxvd(f148093d);
            }
            if (i2 == 5) {
                return f148093d;
            }
            bxxk bxxk = f148094e;
            if (bxxk == null) {
                synchronized (btbb.class) {
                    bxxk = f148094e;
                    if (bxxk == null) {
                        bxxk = new bxve(f148093d);
                        f148094e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
