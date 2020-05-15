package p000;

/* renamed from: bzmu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzmu extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bzmu f170657d;

    /* renamed from: e */
    private static volatile bxxk f170658e;

    /* renamed from: a */
    public int f170659a;

    /* renamed from: b */
    public bznp f170660b;

    /* renamed from: c */
    public ByteString f170661c = ByteString.f164797b;

    static {
        bzmu bzmu = new bzmu();
        f170657d = bzmu;
        GeneratedMessageLite.m124024a(bzmu.class, bzmu);
    }

    private bzmu() {
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
            return GeneratedMessageLite.m124022a(f170657d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bzmu();
        } else {
            if (i2 == 4) {
                return new bxvd(f170657d);
            }
            if (i2 == 5) {
                return f170657d;
            }
            bxxk bxxk = f170658e;
            if (bxxk == null) {
                synchronized (bzmu.class) {
                    bxxk = f170658e;
                    if (bxxk == null) {
                        bxxk = new bxve(f170657d);
                        f170658e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
