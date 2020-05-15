package p000;

/* renamed from: btkc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btkc extends GeneratedMessageLite implements bxxd {

    /* renamed from: n */
    public static final btkc f149218n;

    /* renamed from: o */
    private static volatile bxxk f149219o;

    /* renamed from: a */
    public btiy f149220a;

    /* renamed from: b */
    public btmr f149221b;

    /* renamed from: c */
    public boolean f149222c;

    /* renamed from: d */
    public String f149223d = "";

    /* renamed from: e */
    public int f149224e;

    /* renamed from: f */
    public bxvt f149225f = bxvm.f164965b;

    /* renamed from: g */
    public bxvt f149226g = bxvm.f164965b;

    /* renamed from: h */
    public String f149227h = "";

    /* renamed from: i */
    public ByteString f149228i = ByteString.f164797b;

    /* renamed from: j */
    public ByteString f149229j = ByteString.f164797b;

    /* renamed from: k */
    public btlv f149230k;

    /* renamed from: l */
    public bxvt f149231l = bxvm.f164965b;

    /* renamed from: m */
    public String f149232m = "";

    static {
        btkc btkc = new btkc();
        f149218n = btkc;
        GeneratedMessageLite.m124024a(btkc.class, btkc);
    }

    private btkc() {
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
            return GeneratedMessageLite.m124022a(f149218n, "\u0000\r\u0000\u0000\u0001\u000e\r\u0000\u0003\u0000\u0001\t\u0002\t\u0003\u0007\u0004Ȉ\u0005\f\u0006,\u0007Ȉ\t\n\n,\u000b\n\f\t\r,\u000eȈ", new Object[]{"a", "b", "c", "d", "e", "f", "h", "i", "g", "j", "k", "l", "m"});
        } else if (i2 == 3) {
            return new btkc();
        } else {
            if (i2 == 4) {
                return new btkb();
            }
            if (i2 == 5) {
                return f149218n;
            }
            bxxk bxxk = f149219o;
            if (bxxk == null) {
                synchronized (btkc.class) {
                    bxxk = f149219o;
                    if (bxxk == null) {
                        bxxk = new bxve(f149218n);
                        f149219o = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
