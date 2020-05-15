package p000;

/* renamed from: btfl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btfl extends bxvk implements bxxd {

    /* renamed from: k */
    public static final btfl f148698k;

    /* renamed from: l */
    private static volatile bxxk f148699l;

    /* renamed from: a */
    public String f148700a = "";

    /* renamed from: b */
    public int f148701b;

    /* renamed from: c */
    public String f148702c = "";

    /* renamed from: d */
    public String f148703d = "";

    /* renamed from: e */
    public String f148704e = "";

    /* renamed from: f */
    public String f148705f = "";

    /* renamed from: g */
    public String f148706g = "";

    /* renamed from: h */
    public String f148707h = "";

    /* renamed from: i */
    public String f148708i = "";

    /* renamed from: j */
    public String f148709j = "";

    static {
        btfl btfl = new btfl();
        f148698k = btfl;
        bxvk.m124024a(btfl.class, btfl);
    }

    private btfl() {
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
            return bxvk.m124022a(f148698k, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nȈ", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
        } else if (i2 == 3) {
            return new btfl();
        } else {
            if (i2 == 4) {
                return new bxvd(f148698k);
            }
            if (i2 == 5) {
                return f148698k;
            }
            bxxk bxxk = f148699l;
            if (bxxk == null) {
                synchronized (btfl.class) {
                    bxxk = f148699l;
                    if (bxxk == null) {
                        bxxk = new bxve(f148698k);
                        f148699l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
