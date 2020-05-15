package p000;

/* renamed from: bqrp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqrp extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bqrp f141460d;

    /* renamed from: e */
    private static volatile bxxk f141461e;

    /* renamed from: a */
    public bqrs f141462a;

    /* renamed from: b */
    public bqrn f141463b;

    /* renamed from: c */
    public int f141464c;

    static {
        bqrp bqrp = new bqrp();
        f141460d = bqrp;
        GeneratedMessageLite.m124024a(bqrp.class, bqrp);
    }

    private bqrp() {
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
            return GeneratedMessageLite.m124022a(f141460d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bqrp();
        } else {
            if (i2 == 4) {
                return new bxvd(f141460d);
            }
            if (i2 == 5) {
                return f141460d;
            }
            bxxk bxxk = f141461e;
            if (bxxk == null) {
                synchronized (bqrp.class) {
                    bxxk = f141461e;
                    if (bxxk == null) {
                        bxxk = new bxve(f141460d);
                        f141461e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
