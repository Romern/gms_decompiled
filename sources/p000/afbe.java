package p000;

/* renamed from: afbe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afbe extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final afbe f64117f;

    /* renamed from: g */
    private static volatile bxxk f64118g;

    /* renamed from: a */
    public int f64119a;

    /* renamed from: b */
    public int f64120b;

    /* renamed from: c */
    public String f64121c = "";

    /* renamed from: d */
    public String f64122d = "";

    /* renamed from: e */
    public afbf f64123e;

    static {
        afbe afbe = new afbe();
        f64117f = afbe;
        GeneratedMessageLite.m124024a(afbe.class, afbe);
    }

    private afbe() {
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
            return GeneratedMessageLite.m124022a(f64117f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", afbc.f64116a, "c", "d", "e"});
        } else if (i2 == 3) {
            return new afbe();
        } else {
            if (i2 == 4) {
                return new bxvd(f64117f);
            }
            if (i2 == 5) {
                return f64117f;
            }
            bxxk bxxk = f64118g;
            if (bxxk == null) {
                synchronized (afbe.class) {
                    bxxk = f64118g;
                    if (bxxk == null) {
                        bxxk = new bxve(f64117f);
                        f64118g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
