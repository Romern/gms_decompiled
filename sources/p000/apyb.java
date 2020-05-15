package p000;

/* renamed from: apyb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apyb extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final apyb f85109d;

    /* renamed from: e */
    private static volatile bxxk f85110e;

    /* renamed from: a */
    public int f85111a;

    /* renamed from: b */
    public ByteString f85112b = ByteString.f164797b;

    /* renamed from: c */
    public String f85113c = "";

    static {
        apyb apyb = new apyb();
        f85109d = apyb;
        GeneratedMessageLite.m124024a(apyb.class, apyb);
    }

    private apyb() {
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
            return GeneratedMessageLite.m124022a(f85109d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new apyb();
        } else {
            if (i2 == 4) {
                return new bxvd(f85109d);
            }
            if (i2 == 5) {
                return f85109d;
            }
            bxxk bxxk = f85110e;
            if (bxxk == null) {
                synchronized (apyb.class) {
                    bxxk = f85110e;
                    if (bxxk == null) {
                        bxxk = new bxve(f85109d);
                        f85110e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
