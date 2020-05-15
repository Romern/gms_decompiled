package p000;

/* renamed from: bzxl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzxl extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bzxl f171767e;

    /* renamed from: f */
    private static volatile bxxk f171768f;

    /* renamed from: a */
    public int f171769a;

    /* renamed from: b */
    public String f171770b = "";

    /* renamed from: c */
    public String f171771c = "";

    /* renamed from: d */
    public String f171772d = "";

    static {
        bzxl bzxl = new bzxl();
        f171767e = bzxl;
        GeneratedMessageLite.m124024a(bzxl.class, bzxl);
    }

    private bzxl() {
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
            return GeneratedMessageLite.m124022a(f171767e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bzxl();
        } else {
            if (i2 == 4) {
                return new bxvd(f171767e);
            }
            if (i2 == 5) {
                return f171767e;
            }
            bxxk bxxk = f171768f;
            if (bxxk == null) {
                synchronized (bzxl.class) {
                    bxxk = f171768f;
                    if (bxxk == null) {
                        bxxk = new bxve(f171767e);
                        f171768f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
