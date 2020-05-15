package p000;

/* renamed from: bprn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bprn extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bprn f138873d;

    /* renamed from: e */
    private static volatile bxxk f138874e;

    /* renamed from: a */
    public int f138875a;

    /* renamed from: b */
    public boolean f138876b;

    /* renamed from: c */
    public int f138877c;

    static {
        bprn bprn = new bprn();
        f138873d = bprn;
        GeneratedMessageLite.m124024a(bprn.class, bprn);
    }

    private bprn() {
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
            return GeneratedMessageLite.m124022a(f138873d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bprn();
        } else {
            if (i2 == 4) {
                return new bxvd(f138873d);
            }
            if (i2 == 5) {
                return f138873d;
            }
            bxxk bxxk = f138874e;
            if (bxxk == null) {
                synchronized (bprn.class) {
                    bxxk = f138874e;
                    if (bxxk == null) {
                        bxxk = new bxve(f138873d);
                        f138874e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
