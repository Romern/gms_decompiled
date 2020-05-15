package p000;

/* renamed from: bqmr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqmr extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bqmr f141253b;

    /* renamed from: c */
    private static volatile bxxk f141254c;

    /* renamed from: a */
    public bxwc f141255a = bxxn.f165040b;

    static {
        bqmr bqmr = new bqmr();
        f141253b = bqmr;
        GeneratedMessageLite.m124024a(bqmr.class, bqmr);
    }

    private bqmr() {
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
            return GeneratedMessageLite.m124022a(f141253b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bqmq.class});
        } else if (i2 == 3) {
            return new bqmr();
        } else {
            if (i2 == 4) {
                return new bxvd(f141253b);
            }
            if (i2 == 5) {
                return f141253b;
            }
            bxxk bxxk = f141254c;
            if (bxxk == null) {
                synchronized (bqmr.class) {
                    bxxk = f141254c;
                    if (bxxk == null) {
                        bxxk = new bxve(f141253b);
                        f141254c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
