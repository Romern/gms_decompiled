package p000;

/* renamed from: bmfo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmfo extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bmfo f129128d;

    /* renamed from: e */
    private static volatile bxxk f129129e;

    /* renamed from: a */
    public int f129130a;

    /* renamed from: b */
    public int f129131b;

    /* renamed from: c */
    public ByteString f129132c = ByteString.f164797b;

    static {
        bmfo bmfo = new bmfo();
        f129128d = bmfo;
        GeneratedMessageLite.m124024a(bmfo.class, bmfo);
    }

    private bmfo() {
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
            return GeneratedMessageLite.m124022a(f129128d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0003ည\u0002", new Object[]{"a", "b", bmfm.f129127a, "c"});
        } else if (i2 == 3) {
            return new bmfo();
        } else {
            if (i2 == 4) {
                return new bxvd(f129128d);
            }
            if (i2 == 5) {
                return f129128d;
            }
            bxxk bxxk = f129129e;
            if (bxxk == null) {
                synchronized (bmfo.class) {
                    bxxk = f129129e;
                    if (bxxk == null) {
                        bxxk = new bxve(f129128d);
                        f129129e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
