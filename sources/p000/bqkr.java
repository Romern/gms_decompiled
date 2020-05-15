package p000;

/* renamed from: bqkr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqkr extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bqkr f141031b;

    /* renamed from: c */
    private static volatile bxxk f141032c;

    /* renamed from: a */
    public bxww f141033a = bxww.f165013b;

    static {
        bqkr bqkr = new bqkr();
        f141031b = bqkr;
        GeneratedMessageLite.m124024a(bqkr.class, bqkr);
    }

    private bqkr() {
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
            return GeneratedMessageLite.m124022a(f141031b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", bqkq.f141030a});
        } else if (i2 == 3) {
            return new bqkr();
        } else {
            if (i2 == 4) {
                return new bxvd(f141031b);
            }
            if (i2 == 5) {
                return f141031b;
            }
            bxxk bxxk = f141032c;
            if (bxxk == null) {
                synchronized (bqkr.class) {
                    bxxk = f141032c;
                    if (bxxk == null) {
                        bxxk = new bxve(f141031b);
                        f141032c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
