package p000;

/* renamed from: bzxc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzxc extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bzxc f171723g;

    /* renamed from: h */
    private static volatile bxxk f171724h;

    /* renamed from: a */
    public int f171725a;

    /* renamed from: b */
    public String f171726b = "";

    /* renamed from: c */
    public long f171727c;

    /* renamed from: d */
    public long f171728d;

    /* renamed from: e */
    public bzxi f171729e;

    /* renamed from: f */
    public String f171730f = "";

    static {
        bzxc bzxc = new bzxc();
        f171723g = bzxc;
        GeneratedMessageLite.m124024a(bzxc.class, bzxc);
    }

    private bzxc() {
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
            return GeneratedMessageLite.m124022a(f171723g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဉ\u0003\u0006ဈ\u0005", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bzxc();
        } else {
            if (i2 == 4) {
                return new bxvd(f171723g);
            }
            if (i2 == 5) {
                return f171723g;
            }
            bxxk bxxk = f171724h;
            if (bxxk == null) {
                synchronized (bzxc.class) {
                    bxxk = f171724h;
                    if (bxxk == null) {
                        bxxk = new bxve(f171723g);
                        f171724h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
