package p000;

/* renamed from: bmft */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmft extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bmft f129161e;

    /* renamed from: f */
    private static volatile bxxk f129162f;

    /* renamed from: a */
    public int f129163a;

    /* renamed from: b */
    public int f129164b = 0;

    /* renamed from: c */
    public Object f129165c;

    /* renamed from: d */
    public ByteString f129166d = ByteString.f164797b;

    static {
        bmft bmft = new bmft();
        f129161e = bmft;
        GeneratedMessageLite.m124024a(bmft.class, bmft);
    }

    private bmft() {
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
            return GeneratedMessageLite.m124022a(f129161e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ည\u0002", new Object[]{"c", "b", "a", bmgs.class, bmgw.class, "d"});
        } else if (i2 == 3) {
            return new bmft();
        } else {
            if (i2 == 4) {
                return new bxvd(f129161e);
            }
            if (i2 == 5) {
                return f129161e;
            }
            bxxk bxxk = f129162f;
            if (bxxk == null) {
                synchronized (bmft.class) {
                    bxxk = f129162f;
                    if (bxxk == null) {
                        bxxk = new bxve(f129161e);
                        f129162f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
