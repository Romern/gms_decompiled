package p000;

/* renamed from: bqyj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqyj extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bqyj f141955b;

    /* renamed from: d */
    private static volatile bxxk f141956d;

    /* renamed from: a */
    public boolean f141957a;

    /* renamed from: c */
    private int f141958c;

    static {
        bqyj bqyj = new bqyj();
        f141955b = bqyj;
        GeneratedMessageLite.m124024a(bqyj.class, bqyj);
    }

    private bqyj() {
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
            return GeneratedMessageLite.m124022a(f141955b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bqyj();
        } else {
            if (i2 == 4) {
                return new bxvd(f141955b);
            }
            if (i2 == 5) {
                return f141955b;
            }
            bxxk bxxk = f141956d;
            if (bxxk == null) {
                synchronized (bqyj.class) {
                    bxxk = f141956d;
                    if (bxxk == null) {
                        bxxk = new bxve(f141955b);
                        f141956d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
