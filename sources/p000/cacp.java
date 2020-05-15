package p000;

/* renamed from: cacp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cacp extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final cacp f172587f;

    /* renamed from: h */
    private static volatile bxxk f172588h;

    /* renamed from: a */
    public int f172589a;

    /* renamed from: b */
    public bxwc f172590b = bxxn.f165040b;

    /* renamed from: c */
    public String f172591c = "";

    /* renamed from: d */
    public boolean f172592d;

    /* renamed from: e */
    public long f172593e;

    /* renamed from: g */
    private byte f172594g = 2;

    static {
        cacp cacp = new cacp();
        f172587f = cacp;
        GeneratedMessageLite.m124024a(cacp.class, cacp);
    }

    private cacp() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f172594g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f172594g = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f172587f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001Л\u0002ဈ\u0000\u0003ဇ\u0001\u0004ဂ\u0002", new Object[]{"a", "b", cabc.class, "c", "d", "e"});
        } else if (i2 == 3) {
            return new cacp();
        } else {
            if (i2 == 4) {
                return new caco();
            }
            if (i2 == 5) {
                return f172587f;
            }
            bxxk bxxk = f172588h;
            if (bxxk == null) {
                synchronized (cacp.class) {
                    bxxk = f172588h;
                    if (bxxk == null) {
                        bxxk = new bxve(f172587f);
                        f172588h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
