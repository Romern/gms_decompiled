package p000;

/* renamed from: bqmz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqmz extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bqmz f141284d;

    /* renamed from: e */
    private static volatile bxxk f141285e;

    /* renamed from: a */
    public String f141286a = "";

    /* renamed from: b */
    public bqnb f141287b;

    /* renamed from: c */
    public String f141288c = "";

    static {
        bqmz bqmz = new bqmz();
        f141284d = bqmz;
        GeneratedMessageLite.m124024a(bqmz.class, bqmz);
    }

    private bqmz() {
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
            return GeneratedMessageLite.m124022a(f141284d, "\u0000\u0003\u0000\u0000\u0002\u0005\u0003\u0000\u0000\u0000\u0002Ȉ\u0003\t\u0005Ȉ", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bqmz();
        } else {
            if (i2 == 4) {
                return new bxvd(f141284d);
            }
            if (i2 == 5) {
                return f141284d;
            }
            bxxk bxxk = f141285e;
            if (bxxk == null) {
                synchronized (bqmz.class) {
                    bxxk = f141285e;
                    if (bxxk == null) {
                        bxxk = new bxve(f141284d);
                        f141285e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
