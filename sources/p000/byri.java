package p000;

/* renamed from: byri */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byri extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final byri f167474d;

    /* renamed from: e */
    private static volatile bxxk f167475e;

    /* renamed from: a */
    public int f167476a;

    /* renamed from: b */
    public ByteString f167477b = ByteString.f164797b;

    /* renamed from: c */
    public int f167478c;

    static {
        byri byri = new byri();
        f167474d = byri;
        GeneratedMessageLite.m124024a(byri.class, byri);
    }

    private byri() {
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
            return GeneratedMessageLite.m124022a(f167474d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new byri();
        } else {
            if (i2 == 4) {
                return new bxvd(f167474d);
            }
            if (i2 == 5) {
                return f167474d;
            }
            bxxk bxxk = f167475e;
            if (bxxk == null) {
                synchronized (byri.class) {
                    bxxk = f167475e;
                    if (bxxk == null) {
                        bxxk = new bxve(f167474d);
                        f167475e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
