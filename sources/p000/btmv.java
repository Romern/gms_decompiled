package p000;

/* renamed from: btmv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btmv extends GeneratedMessageLite implements bxxd {

    /* renamed from: m */
    public static final btmv f149551m;

    /* renamed from: n */
    private static volatile bxxk f149552n;

    /* renamed from: a */
    public btiy f149553a;

    /* renamed from: b */
    public ByteString f149554b = ByteString.f164797b;

    /* renamed from: c */
    public String f149555c = "";

    /* renamed from: d */
    public btiw f149556d;

    /* renamed from: e */
    public String f149557e = "";

    /* renamed from: f */
    public btmr f149558f;

    /* renamed from: g */
    public btli f149559g;

    /* renamed from: h */
    public String f149560h = "";

    /* renamed from: i */
    public String f149561i = "";

    /* renamed from: j */
    public String f149562j = "";

    /* renamed from: k */
    public ByteString f149563k = ByteString.f164797b;

    /* renamed from: l */
    public String f149564l = "";

    static {
        btmv btmv = new btmv();
        f149551m = btmv;
        GeneratedMessageLite.m124024a(btmv.class, btmv);
    }

    private btmv() {
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
            return GeneratedMessageLite.m124022a(f149551m, "\u0000\f\u0000\u0000\u0001\f\f\u0000\u0000\u0000\u0001\t\u0002\n\u0003Ȉ\u0004Ȉ\u0005\t\u0006\t\u0007Ȉ\bȈ\tȈ\n\n\u000bȈ\f\t", new Object[]{"a", "b", "c", "e", "f", "g", "h", "i", "j", "k", "l", "d"});
        } else if (i2 == 3) {
            return new btmv();
        } else {
            if (i2 == 4) {
                return new bxvd(f149551m);
            }
            if (i2 == 5) {
                return f149551m;
            }
            bxxk bxxk = f149552n;
            if (bxxk == null) {
                synchronized (btmv.class) {
                    bxxk = f149552n;
                    if (bxxk == null) {
                        bxxk = new bxve(f149551m);
                        f149552n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
