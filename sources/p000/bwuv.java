package p000;

/* renamed from: bwuv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwuv extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bwuv f161075c;

    /* renamed from: d */
    public static final bxvj f161076d;

    /* renamed from: e */
    private static volatile bxxk f161077e;

    /* renamed from: a */
    public int f161078a;

    /* renamed from: b */
    public blxc f161079b;

    static {
        bwuv bwuv = new bwuv();
        f161075c = bwuv;
        GeneratedMessageLite.m124024a(bwuv.class, bwuv);
        bwog bwog = bwog.f160437f;
        bwuv bwuv2 = f161075c;
        f161076d = GeneratedMessageLite.m124006a(bwog, bwuv2, bwuv2, 238350284, bxzf.MESSAGE);
    }

    private bwuv() {
        ByteString bxtx = bxtx.f164797b;
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
            return GeneratedMessageLite.m124022a(f161075c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bwuv();
        } else {
            if (i2 == 4) {
                return new bxvd(f161075c);
            }
            if (i2 == 5) {
                return f161075c;
            }
            bxxk bxxk = f161077e;
            if (bxxk == null) {
                synchronized (bwuv.class) {
                    bxxk = f161077e;
                    if (bxxk == null) {
                        bxxk = new bxve(f161075c);
                        f161077e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
