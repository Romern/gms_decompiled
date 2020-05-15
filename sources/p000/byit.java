package p000;

/* renamed from: byit */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byit extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final byit f166599d;

    /* renamed from: e */
    private static volatile bxxk f166600e;

    /* renamed from: a */
    public int f166601a;

    /* renamed from: b */
    public ByteString f166602b = ByteString.f164797b;

    /* renamed from: c */
    public int f166603c;

    static {
        byit byit = new byit();
        f166599d = byit;
        GeneratedMessageLite.m124024a(byit.class, byit);
    }

    private byit() {
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
            return GeneratedMessageLite.m124022a(f166599d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", byis.f166598a});
        } else if (i2 == 3) {
            return new byit();
        } else {
            if (i2 == 4) {
                return new bxvd(f166599d);
            }
            if (i2 == 5) {
                return f166599d;
            }
            bxxk bxxk = f166600e;
            if (bxxk == null) {
                synchronized (byit.class) {
                    bxxk = f166600e;
                    if (bxxk == null) {
                        bxxk = new bxve(f166599d);
                        f166600e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
