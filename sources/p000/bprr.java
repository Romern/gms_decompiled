package p000;

/* renamed from: bprr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bprr extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bprr f138889d;

    /* renamed from: e */
    private static volatile bxxk f138890e;

    /* renamed from: a */
    public int f138891a;

    /* renamed from: b */
    public String f138892b = "";

    /* renamed from: c */
    public int f138893c;

    static {
        bprr bprr = new bprr();
        f138889d = bprr;
        bxvk.m124024a(bprr.class, bprr);
    }

    private bprr() {
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
            return bxvk.m124022a(f138889d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bprr();
        } else {
            if (i2 == 4) {
                return new bxvd(f138889d);
            }
            if (i2 == 5) {
                return f138889d;
            }
            bxxk bxxk = f138890e;
            if (bxxk == null) {
                synchronized (bprr.class) {
                    bxxk = f138890e;
                    if (bxxk == null) {
                        bxxk = new bxve(f138889d);
                        f138890e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
