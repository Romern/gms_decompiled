package p000;

/* renamed from: brdt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brdt extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bxvu f142555c = new brdq();

    /* renamed from: d */
    public static final brdt f142556d;

    /* renamed from: f */
    private static volatile bxxk f142557f;

    /* renamed from: a */
    public String f142558a = "";

    /* renamed from: b */
    public bxvt f142559b = bxvm.f164965b;

    /* renamed from: e */
    private int f142560e;

    static {
        brdt brdt = new brdt();
        f142556d = brdt;
        bxvk.m124024a(brdt.class, brdt);
    }

    private brdt() {
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
            return bxvk.m124022a(f142556d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001e", new Object[]{"e", "a", "b", brds.m113912b()});
        } else if (i2 == 3) {
            return new brdt();
        } else {
            if (i2 == 4) {
                return new bxvd(f142556d);
            }
            if (i2 == 5) {
                return f142556d;
            }
            bxxk bxxk = f142557f;
            if (bxxk == null) {
                synchronized (brdt.class) {
                    bxxk = f142557f;
                    if (bxxk == null) {
                        bxxk = new bxve(f142556d);
                        f142557f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
