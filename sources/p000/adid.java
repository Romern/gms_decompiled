package p000;

/* renamed from: adid */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adid extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final adid f61775d;

    /* renamed from: e */
    private static volatile bxxk f61776e;

    /* renamed from: a */
    public long f61777a;

    /* renamed from: b */
    public long f61778b;

    /* renamed from: c */
    public int f61779c;

    static {
        adid adid = new adid();
        f61775d = adid;
        GeneratedMessageLite.m124024a(adid.class, adid);
    }

    private adid() {
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
            return GeneratedMessageLite.m124022a(f61775d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0004", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new adid();
        } else {
            if (i2 == 4) {
                return new bxvd(f61775d);
            }
            if (i2 == 5) {
                return f61775d;
            }
            bxxk bxxk = f61776e;
            if (bxxk == null) {
                synchronized (adid.class) {
                    bxxk = f61776e;
                    if (bxxk == null) {
                        bxxk = new bxve(f61775d);
                        f61776e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
