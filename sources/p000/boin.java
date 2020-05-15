package p000;

/* renamed from: boin */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boin extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final boin f133196c;

    /* renamed from: d */
    private static volatile bxxk f133197d;

    /* renamed from: a */
    public int f133198a;

    /* renamed from: b */
    public boolean f133199b;

    static {
        boin boin = new boin();
        f133196c = boin;
        GeneratedMessageLite.m124024a(boin.class, boin);
    }

    private boin() {
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
            return GeneratedMessageLite.m124022a(f133196c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new boin();
        } else {
            if (i2 == 4) {
                return new bxvd(f133196c);
            }
            if (i2 == 5) {
                return f133196c;
            }
            bxxk bxxk = f133197d;
            if (bxxk == null) {
                synchronized (boin.class) {
                    bxxk = f133197d;
                    if (bxxk == null) {
                        bxxk = new bxve(f133196c);
                        f133197d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
