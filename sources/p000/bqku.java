package p000;

/* renamed from: bqku */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqku extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bqku f141048c;

    /* renamed from: d */
    private static volatile bxxk f141049d;

    /* renamed from: a */
    public int f141050a;

    /* renamed from: b */
    public bqkp f141051b;

    static {
        bqku bqku = new bqku();
        f141048c = bqku;
        GeneratedMessageLite.m124024a(bqku.class, bqku);
    }

    private bqku() {
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
            return GeneratedMessageLite.m124022a(f141048c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bqku();
        } else {
            if (i2 == 4) {
                return new bxvd(f141048c);
            }
            if (i2 == 5) {
                return f141048c;
            }
            bxxk bxxk = f141049d;
            if (bxxk == null) {
                synchronized (bqku.class) {
                    bxxk = f141049d;
                    if (bxxk == null) {
                        bxxk = new bxve(f141048c);
                        f141049d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
