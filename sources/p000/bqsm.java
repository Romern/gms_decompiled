package p000;

/* renamed from: bqsm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqsm extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bqsm f141545c;

    /* renamed from: d */
    private static volatile bxxk f141546d;

    /* renamed from: a */
    public int f141547a;

    /* renamed from: b */
    public bqsn f141548b;

    static {
        bqsm bqsm = new bqsm();
        f141545c = bqsm;
        bxvk.m124024a(bqsm.class, bqsm);
    }

    private bqsm() {
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
            return bxvk.m124022a(f141545c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bqsm();
        } else {
            if (i2 == 4) {
                return new bxvd(f141545c);
            }
            if (i2 == 5) {
                return f141545c;
            }
            bxxk bxxk = f141546d;
            if (bxxk == null) {
                synchronized (bqsm.class) {
                    bxxk = f141546d;
                    if (bxxk == null) {
                        bxxk = new bxve(f141545c);
                        f141546d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
