package p000;

/* renamed from: btll */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btll extends GeneratedMessageLite implements bxxd {

    /* renamed from: k */
    public static final btll f149376k;

    /* renamed from: l */
    private static volatile bxxk f149377l;

    /* renamed from: a */
    public btiy f149378a;

    /* renamed from: b */
    public String f149379b = "";

    /* renamed from: c */
    public btiw f149380c;

    /* renamed from: d */
    public btli f149381d;

    /* renamed from: e */
    public btmd f149382e;

    /* renamed from: f */
    public String f149383f = "";

    /* renamed from: g */
    public int f149384g;

    /* renamed from: h */
    public bxvt f149385h = bxvm.f164965b;

    /* renamed from: i */
    public bxvt f149386i = bxvm.f164965b;

    /* renamed from: j */
    public int f149387j;

    static {
        btll btll = new btll();
        f149376k = btll;
        GeneratedMessageLite.m124024a(btll.class, btll);
    }

    private btll() {
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
            return GeneratedMessageLite.m124022a(f149376k, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0002\u0000\u0001\t\u0002Ȉ\u0003\t\u0004\t\u0005Ȉ\u0006\f\u0007,\b\t\t,\n\f", new Object[]{"a", "b", "d", "e", "f", "g", "h", "c", "i", "j"});
        } else if (i2 == 3) {
            return new btll();
        } else {
            if (i2 == 4) {
                return new btlj();
            }
            if (i2 == 5) {
                return f149376k;
            }
            bxxk bxxk = f149377l;
            if (bxxk == null) {
                synchronized (btll.class) {
                    bxxk = f149377l;
                    if (bxxk == null) {
                        bxxk = new bxve(f149376k);
                        f149377l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
