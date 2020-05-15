package p000;

/* renamed from: ghd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ghd extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final ghd f18222f;

    /* renamed from: g */
    private static volatile bxxk f18223g;

    /* renamed from: a */
    public int f18224a;

    /* renamed from: b */
    public String f18225b = "";

    /* renamed from: c */
    public int f18226c;

    /* renamed from: d */
    public int f18227d;

    /* renamed from: e */
    public int f18228e;

    static {
        ghd ghd = new ghd();
        f18222f = ghd;
        GeneratedMessageLite.m124024a(ghd.class, ghd);
    }

    private ghd() {
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
            return GeneratedMessageLite.m124022a(f18222f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new ghd();
        } else {
            if (i2 == 4) {
                return new bxvd(f18222f);
            }
            if (i2 == 5) {
                return f18222f;
            }
            bxxk bxxk = f18223g;
            if (bxxk == null) {
                synchronized (ghd.class) {
                    bxxk = f18223g;
                    if (bxxk == null) {
                        bxxk = new bxve(f18222f);
                        f18223g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
