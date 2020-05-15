package p000;

/* renamed from: bvlr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvlr extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bvlr f156589b;

    /* renamed from: d */
    private static volatile bxxk f156590d;

    /* renamed from: a */
    public bvow f156591a;

    /* renamed from: c */
    private int f156592c;

    static {
        bvlr bvlr = new bvlr();
        f156589b = bvlr;
        GeneratedMessageLite.m124024a(bvlr.class, bvlr);
    }

    private bvlr() {
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
            return GeneratedMessageLite.m124022a(f156589b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bvlr();
        } else {
            if (i2 == 4) {
                return new bxvd(f156589b);
            }
            if (i2 == 5) {
                return f156589b;
            }
            bxxk bxxk = f156590d;
            if (bxxk == null) {
                synchronized (bvlr.class) {
                    bxxk = f156590d;
                    if (bxxk == null) {
                        bxxk = new bxve(f156589b);
                        f156590d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
