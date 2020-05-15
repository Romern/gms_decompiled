package p000;

/* renamed from: cblw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cblw extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final cblw f177572b;

    /* renamed from: c */
    private static volatile bxxk f177573c;

    /* renamed from: a */
    public cblx f177574a;

    static {
        cblw cblw = new cblw();
        f177572b = cblw;
        GeneratedMessageLite.m124024a(cblw.class, cblw);
    }

    private cblw() {
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
            return GeneratedMessageLite.m124022a(f177572b, "\u0000\u0001\u0000\u0000\u0004\u0004\u0001\u0000\u0000\u0000\u0004\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cblw();
        } else {
            if (i2 == 4) {
                return new bxvd(f177572b);
            }
            if (i2 == 5) {
                return f177572b;
            }
            bxxk bxxk = f177573c;
            if (bxxk == null) {
                synchronized (cblw.class) {
                    bxxk = f177573c;
                    if (bxxk == null) {
                        bxxk = new bxve(f177572b);
                        f177573c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
