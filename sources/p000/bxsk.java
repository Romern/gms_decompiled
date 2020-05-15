package p000;

/* renamed from: bxsk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxsk extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bxsk f164695d;

    /* renamed from: e */
    private static volatile bxxk f164696e;

    /* renamed from: a */
    public int f164697a;

    /* renamed from: b */
    public ByteString f164698b = ByteString.f164797b;

    /* renamed from: c */
    public String f164699c = "";

    static {
        bxsk bxsk = new bxsk();
        f164695d = bxsk;
        GeneratedMessageLite.m124024a(bxsk.class, bxsk);
    }

    private bxsk() {
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
            return GeneratedMessageLite.m124022a(f164695d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bxsk();
        } else {
            if (i2 == 4) {
                return new bxvd(f164695d);
            }
            if (i2 == 5) {
                return f164695d;
            }
            bxxk bxxk = f164696e;
            if (bxxk == null) {
                synchronized (bxsk.class) {
                    bxxk = f164696e;
                    if (bxxk == null) {
                        bxxk = new bxve(f164695d);
                        f164696e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
