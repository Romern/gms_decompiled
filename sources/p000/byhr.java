package p000;

/* renamed from: byhr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byhr extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final byhr f166494g;

    /* renamed from: h */
    private static volatile bxxk f166495h;

    /* renamed from: a */
    public int f166496a;

    /* renamed from: b */
    public int f166497b;

    /* renamed from: c */
    public ByteString f166498c = ByteString.f164797b;

    /* renamed from: d */
    public ByteString f166499d = ByteString.f164797b;

    /* renamed from: e */
    public long f166500e = -1;

    /* renamed from: f */
    public String f166501f = "";

    static {
        byhr byhr = new byhr();
        f166494g = byhr;
        GeneratedMessageLite.m124024a(byhr.class, byhr);
    }

    private byhr() {
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
            return GeneratedMessageLite.m124022a(f166494g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ည\u0001\u0003ည\u0002\u0004ဂ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", byhq.m124823b(), "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new byhr();
        } else {
            if (i2 == 4) {
                return new bxvd(f166494g);
            }
            if (i2 == 5) {
                return f166494g;
            }
            bxxk bxxk = f166495h;
            if (bxxk == null) {
                synchronized (byhr.class) {
                    bxxk = f166495h;
                    if (bxxk == null) {
                        bxxk = new bxve(f166494g);
                        f166495h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
