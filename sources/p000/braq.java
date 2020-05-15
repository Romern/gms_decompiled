package p000;

/* renamed from: braq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class braq extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final braq f142171c;

    /* renamed from: d */
    private static volatile bxxk f142172d;

    /* renamed from: a */
    public int f142173a;

    /* renamed from: b */
    public brap f142174b;

    static {
        braq braq = new braq();
        f142171c = braq;
        GeneratedMessageLite.m124024a(braq.class, braq);
    }

    private braq() {
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
            return GeneratedMessageLite.m124022a(f142171c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new braq();
        } else {
            if (i2 == 4) {
                return new bxvd(f142171c);
            }
            if (i2 == 5) {
                return f142171c;
            }
            bxxk bxxk = f142172d;
            if (bxxk == null) {
                synchronized (braq.class) {
                    bxxk = f142172d;
                    if (bxxk == null) {
                        bxxk = new bxve(f142171c);
                        f142172d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
