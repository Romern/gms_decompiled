package p000;

/* renamed from: bzjn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzjn extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bzjn f170311f;

    /* renamed from: g */
    private static volatile bxxk f170312g;

    /* renamed from: a */
    public int f170313a;

    /* renamed from: b */
    public String f170314b = "";

    /* renamed from: c */
    public String f170315c = "";

    /* renamed from: d */
    public String f170316d = "";

    /* renamed from: e */
    public String f170317e = "";

    static {
        bzjn bzjn = new bzjn();
        f170311f = bzjn;
        bxvk.m124024a(bzjn.class, bzjn);
    }

    private bzjn() {
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
            return bxvk.m124022a(f170311f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bzjn();
        } else {
            if (i2 == 4) {
                return new bxvd(f170311f);
            }
            if (i2 == 5) {
                return f170311f;
            }
            bxxk bxxk = f170312g;
            if (bxxk == null) {
                synchronized (bzjn.class) {
                    bxxk = f170312g;
                    if (bxxk == null) {
                        bxxk = new bxve(f170311f);
                        f170312g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
