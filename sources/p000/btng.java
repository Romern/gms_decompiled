package p000;

/* renamed from: btng */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btng extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final btng f149607j;

    /* renamed from: k */
    private static volatile bxxk f149608k;

    /* renamed from: a */
    public String f149609a = "";

    /* renamed from: b */
    public String f149610b = "";

    /* renamed from: c */
    public String f149611c = "";

    /* renamed from: d */
    public String f149612d = "";

    /* renamed from: e */
    public String f149613e = "";

    /* renamed from: f */
    public String f149614f = "";

    /* renamed from: g */
    public String f149615g = "";

    /* renamed from: h */
    public int f149616h;

    /* renamed from: i */
    public int f149617i;

    static {
        btng btng = new btng();
        f149607j = btng;
        GeneratedMessageLite.m124024a(btng.class, btng);
    }

    private btng() {
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
            return GeneratedMessageLite.m124022a(f149607j, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\f\t\f", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new btng();
        } else {
            if (i2 == 4) {
                return new bxvd(f149607j);
            }
            if (i2 == 5) {
                return f149607j;
            }
            bxxk bxxk = f149608k;
            if (bxxk == null) {
                synchronized (btng.class) {
                    bxxk = f149608k;
                    if (bxxk == null) {
                        bxxk = new bxve(f149607j);
                        f149608k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
