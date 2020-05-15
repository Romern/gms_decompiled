package p000;

/* renamed from: bzgd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzgd extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bzgd f169911g;

    /* renamed from: h */
    private static volatile bxxk f169912h;

    /* renamed from: a */
    public int f169913a;

    /* renamed from: b */
    public String f169914b = "";

    /* renamed from: c */
    public String f169915c = "";

    /* renamed from: d */
    public bzfx f169916d;

    /* renamed from: e */
    public bzeu f169917e;

    /* renamed from: f */
    public String f169918f = "";

    static {
        bzgd bzgd = new bzgd();
        f169911g = bzgd;
        bxvk.m124024a(bzgd.class, bzgd);
    }

    private bzgd() {
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
            return bxvk.m124022a(f169911g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0001\u0005ဉ\u0002\u0006ဉ\u0003\u0007ဈ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bzgd();
        } else {
            if (i2 == 4) {
                return new bxvd(f169911g);
            }
            if (i2 == 5) {
                return f169911g;
            }
            bxxk bxxk = f169912h;
            if (bxxk == null) {
                synchronized (bzgd.class) {
                    bxxk = f169912h;
                    if (bxxk == null) {
                        bxxk = new bxve(f169911g);
                        f169912h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
