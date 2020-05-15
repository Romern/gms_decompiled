package p000;

/* renamed from: bzou */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzou extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bzou f170868f;

    /* renamed from: h */
    private static volatile bxxk f170869h;

    /* renamed from: a */
    public bzoa f170870a;

    /* renamed from: b */
    public String f170871b = "";

    /* renamed from: c */
    public String f170872c = "";

    /* renamed from: d */
    public String f170873d = "";

    /* renamed from: e */
    public bzok f170874e;

    /* renamed from: g */
    private byte f170875g = 2;

    static {
        bzou bzou = new bzou();
        f170868f = bzou;
        GeneratedMessageLite.m124024a(bzou.class, bzou);
    }

    private bzou() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f170875g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f170875g = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f170868f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0001\u0001\t\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Љ", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bzou();
        } else {
            if (i2 == 4) {
                return new bxvd(f170868f);
            }
            if (i2 == 5) {
                return f170868f;
            }
            bxxk bxxk = f170869h;
            if (bxxk == null) {
                synchronized (bzou.class) {
                    bxxk = f170869h;
                    if (bxxk == null) {
                        bxxk = new bxve(f170868f);
                        f170869h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
