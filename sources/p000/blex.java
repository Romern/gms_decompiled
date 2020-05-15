package p000;

/* renamed from: blex */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blex extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final blex f126295g;

    /* renamed from: h */
    private static volatile bxxk f126296h;

    /* renamed from: a */
    public int f126297a;

    /* renamed from: b */
    public bleu f126298b;

    /* renamed from: c */
    public String f126299c = "";

    /* renamed from: d */
    public String f126300d = "";

    /* renamed from: e */
    public String f126301e = "";

    /* renamed from: f */
    public String f126302f = "";

    static {
        blex blex = new blex();
        f126295g = blex;
        GeneratedMessageLite.m124024a(blex.class, blex);
    }

    private blex() {
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
            return GeneratedMessageLite.m124022a(f126295g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0004\u0005ဈ\u0003", new Object[]{"a", "b", "c", "d", "f", "e"});
        } else if (i2 == 3) {
            return new blex();
        } else {
            if (i2 == 4) {
                return new bxvd(f126295g);
            }
            if (i2 == 5) {
                return f126295g;
            }
            bxxk bxxk = f126296h;
            if (bxxk == null) {
                synchronized (blex.class) {
                    bxxk = f126296h;
                    if (bxxk == null) {
                        bxxk = new bxve(f126295g);
                        f126296h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
