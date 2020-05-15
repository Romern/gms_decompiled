package p000;

/* renamed from: btmr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btmr extends GeneratedMessageLite implements bxxd {

    /* renamed from: n */
    public static final btmr f149528n;

    /* renamed from: o */
    private static volatile bxxk f149529o;

    /* renamed from: a */
    public String f149530a = "";

    /* renamed from: b */
    public String f149531b = "";

    /* renamed from: c */
    public String f149532c = "";

    /* renamed from: d */
    public String f149533d = "";

    /* renamed from: e */
    public int f149534e;

    /* renamed from: f */
    public String f149535f = "";

    /* renamed from: g */
    public int f149536g;

    /* renamed from: h */
    public String f149537h = "";

    /* renamed from: i */
    public String f149538i = "";

    /* renamed from: j */
    public String f149539j = "";

    /* renamed from: k */
    public String f149540k = "";

    /* renamed from: l */
    public int f149541l;

    /* renamed from: m */
    public btmq f149542m;

    static {
        btmr btmr = new btmr();
        f149528n = btmr;
        GeneratedMessageLite.m124024a(btmr.class, btmr);
    }

    private btmr() {
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
            return GeneratedMessageLite.m124022a(f149528n, "\u0000\r\u0000\u0000\u0001\r\r\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\f\u0007Ȉ\bȈ\tȈ\nȈ\u000b\f\f\t\r\f", new Object[]{"a", "b", "c", "d", "f", "g", "h", "i", "j", "k", "l", "m", "e"});
        } else if (i2 == 3) {
            return new btmr();
        } else {
            if (i2 == 4) {
                return new bxvd(f149528n);
            }
            if (i2 == 5) {
                return f149528n;
            }
            bxxk bxxk = f149529o;
            if (bxxk == null) {
                synchronized (btmr.class) {
                    bxxk = f149529o;
                    if (bxxk == null) {
                        bxxk = new bxve(f149528n);
                        f149529o = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
