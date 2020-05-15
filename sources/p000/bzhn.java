package p000;

/* renamed from: bzhn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzhn extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bzhn f170094e;

    /* renamed from: f */
    private static volatile bxxk f170095f;

    /* renamed from: a */
    public int f170096a;

    /* renamed from: b */
    public String f170097b = "";

    /* renamed from: c */
    public String f170098c = "";

    /* renamed from: d */
    public int f170099d;

    static {
        bzhn bzhn = new bzhn();
        f170094e = bzhn;
        GeneratedMessageLite.m124024a(bzhn.class, bzhn);
    }

    private bzhn() {
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
            return GeneratedMessageLite.m124022a(f170094e, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0000\u0002ဈ\u0001\u0004ဈ\u0003\u0005ဌ\u0004", new Object[]{"a", "b", "c", "d", bzho.f170100a});
        } else if (i2 == 3) {
            return new bzhn();
        } else {
            if (i2 == 4) {
                return new bxvd(f170094e);
            }
            if (i2 == 5) {
                return f170094e;
            }
            bxxk bxxk = f170095f;
            if (bxxk == null) {
                synchronized (bzhn.class) {
                    bxxk = f170095f;
                    if (bxxk == null) {
                        bxxk = new bxve(f170094e);
                        f170095f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
