package p000;

/* renamed from: bypc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bypc extends GeneratedMessageLite implements bxxd {

    /* renamed from: k */
    public static final bypc f167305k;

    /* renamed from: l */
    private static volatile bxxk f167306l;

    /* renamed from: a */
    public int f167307a;

    /* renamed from: b */
    public ByteString f167308b = ByteString.f164797b;

    /* renamed from: c */
    public long f167309c;

    /* renamed from: d */
    public bypb f167310d;

    /* renamed from: e */
    public String f167311e = "";

    /* renamed from: f */
    public byob f167312f;

    /* renamed from: g */
    public byoh f167313g;

    /* renamed from: h */
    public byoh f167314h;

    /* renamed from: i */
    public ByteString f167315i = ByteString.f164797b;

    /* renamed from: j */
    public int f167316j;

    static {
        bypc bypc = new bypc();
        f167305k = bypc;
        GeneratedMessageLite.m124024a(bypc.class, bypc);
    }

    private bypc() {
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
            return GeneratedMessageLite.m124022a(f167305k, "\u0001\t\u0000\u0001\u0001c\t\u0000\u0000\u0000\u0001ည\u0000\u0002ဉ\u0002\u0003ဉ\b\u0004ဈ\u0004\u0006ဉ\t\nဂ\u0001\fဉ\n\u000eည\fcင\r", new Object[]{"a", "b", "d", "f", "e", "g", "c", "h", "i", "j"});
        } else if (i2 == 3) {
            return new bypc();
        } else {
            if (i2 == 4) {
                return new bxvd(f167305k);
            }
            if (i2 == 5) {
                return f167305k;
            }
            bxxk bxxk = f167306l;
            if (bxxk == null) {
                synchronized (bypc.class) {
                    bxxk = f167306l;
                    if (bxxk == null) {
                        bxxk = new bxve(f167305k);
                        f167306l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
