package p000;

/* renamed from: bxsc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxsc extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bxsc f164659d;

    /* renamed from: e */
    private static volatile bxxk f164660e;

    /* renamed from: a */
    public int f164661a;

    /* renamed from: b */
    public ByteString f164662b = ByteString.f164797b;

    /* renamed from: c */
    public String f164663c = "";

    static {
        bxsc bxsc = new bxsc();
        f164659d = bxsc;
        GeneratedMessageLite.m124024a(bxsc.class, bxsc);
    }

    private bxsc() {
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
            return GeneratedMessageLite.m124022a(f164659d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bxsc();
        } else {
            if (i2 == 4) {
                return new bxvd(f164659d);
            }
            if (i2 == 5) {
                return f164659d;
            }
            bxxk bxxk = f164660e;
            if (bxxk == null) {
                synchronized (bxsc.class) {
                    bxxk = f164660e;
                    if (bxxk == null) {
                        bxxk = new bxve(f164659d);
                        f164660e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
