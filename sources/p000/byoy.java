package p000;

/* renamed from: byoy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byoy extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final byoy f167279b;

    /* renamed from: d */
    private static volatile bxxk f167280d;

    /* renamed from: a */
    public ByteString f167281a = ByteString.f164797b;

    /* renamed from: c */
    private int f167282c;

    static {
        byoy byoy = new byoy();
        f167279b = byoy;
        GeneratedMessageLite.m124024a(byoy.class, byoy);
    }

    private byoy() {
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
            return GeneratedMessageLite.m124022a(f167279b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new byoy();
        } else {
            if (i2 == 4) {
                return new bxvd(f167279b);
            }
            if (i2 == 5) {
                return f167279b;
            }
            bxxk bxxk = f167280d;
            if (bxxk == null) {
                synchronized (byoy.class) {
                    bxxk = f167280d;
                    if (bxxk == null) {
                        bxxk = new bxve(f167279b);
                        f167280d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
