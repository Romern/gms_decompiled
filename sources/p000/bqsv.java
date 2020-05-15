package p000;

/* renamed from: bqsv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqsv extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bqsv f141581e;

    /* renamed from: f */
    private static volatile bxxk f141582f;

    /* renamed from: a */
    public int f141583a;

    /* renamed from: b */
    public bqst f141584b;

    /* renamed from: c */
    public bxtx f141585c = bxtx.f164797b;

    /* renamed from: d */
    public bxtx f141586d = bxtx.f164797b;

    static {
        bqsv bqsv = new bqsv();
        f141581e = bqsv;
        bxvk.m124024a(bqsv.class, bqsv);
    }

    private bqsv() {
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
            return bxvk.m124022a(f141581e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bqsv();
        } else {
            if (i2 == 4) {
                return new bxvd(f141581e);
            }
            if (i2 == 5) {
                return f141581e;
            }
            bxxk bxxk = f141582f;
            if (bxxk == null) {
                synchronized (bqsv.class) {
                    bxxk = f141582f;
                    if (bxxk == null) {
                        bxxk = new bxve(f141581e);
                        f141582f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
