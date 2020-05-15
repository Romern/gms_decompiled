package p000;

/* renamed from: vwd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vwd extends bxvk implements bxxd {

    /* renamed from: g */
    public static final vwd f50122g;

    /* renamed from: h */
    private static volatile bxxk f50123h;

    /* renamed from: a */
    public int f50124a;

    /* renamed from: b */
    public String f50125b = "";

    /* renamed from: c */
    public String f50126c = "";

    /* renamed from: d */
    public String f50127d = "";

    /* renamed from: e */
    public int f50128e;

    /* renamed from: f */
    public boolean f50129f;

    static {
        vwd vwd = new vwd();
        f50122g = vwd;
        bxvk.m124024a(vwd.class, vwd);
    }

    private vwd() {
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
            return bxvk.m124022a(f50122g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဋ\u0003\u0005ဇ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new vwd();
        } else {
            if (i2 == 4) {
                return new bxvd(f50122g);
            }
            if (i2 == 5) {
                return f50122g;
            }
            bxxk bxxk = f50123h;
            if (bxxk == null) {
                synchronized (vwd.class) {
                    bxxk = f50123h;
                    if (bxxk == null) {
                        bxxk = new bxve(f50122g);
                        f50123h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
