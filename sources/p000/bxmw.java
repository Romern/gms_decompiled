package p000;

/* renamed from: bxmw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxmw extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bxmw f163990f;

    /* renamed from: g */
    public static final bxvj f163991g;

    /* renamed from: h */
    private static volatile bxxk f163992h;

    /* renamed from: a */
    public int f163993a;

    /* renamed from: b */
    public String f163994b = "";

    /* renamed from: c */
    public String f163995c = "";

    /* renamed from: d */
    public int f163996d;

    /* renamed from: e */
    public String f163997e = "";

    static {
        bxmw bxmw = new bxmw();
        f163990f = bxmw;
        GeneratedMessageLite.m124024a(bxmw.class, bxmw);
        bxcf bxcf = bxcf.f162779a;
        bxmw bxmw2 = f163990f;
        f163991g = GeneratedMessageLite.m124006a(bxcf, bxmw2, bxmw2, 86288836, bxzf.MESSAGE);
    }

    private bxmw() {
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
            return GeneratedMessageLite.m124022a(f163990f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d", bxmv.f163989a, "e"});
        } else if (i2 == 3) {
            return new bxmw();
        } else {
            if (i2 == 4) {
                return new bxvd(f163990f);
            }
            if (i2 == 5) {
                return f163990f;
            }
            bxxk bxxk = f163992h;
            if (bxxk == null) {
                synchronized (bxmw.class) {
                    bxxk = f163992h;
                    if (bxxk == null) {
                        bxxk = new bxve(f163990f);
                        f163992h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
