package p000;

/* renamed from: bysp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bysp extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bysp f167588d;

    /* renamed from: e */
    private static volatile bxxk f167589e;

    /* renamed from: a */
    public int f167590a;

    /* renamed from: b */
    public int f167591b;

    /* renamed from: c */
    public ByteString f167592c = ByteString.f164797b;

    static {
        bysp bysp = new bysp();
        f167588d = bysp;
        GeneratedMessageLite.m124024a(bysp.class, bysp);
    }

    private bysp() {
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
            return GeneratedMessageLite.m124022a(f167588d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ည\u0001", new Object[]{"a", "b", bysn.f167587a, "c"});
        } else if (i2 == 3) {
            return new bysp();
        } else {
            if (i2 == 4) {
                return new bxvd(f167588d);
            }
            if (i2 == 5) {
                return f167588d;
            }
            bxxk bxxk = f167589e;
            if (bxxk == null) {
                synchronized (bysp.class) {
                    bxxk = f167589e;
                    if (bxxk == null) {
                        bxxk = new bxve(f167588d);
                        f167589e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
