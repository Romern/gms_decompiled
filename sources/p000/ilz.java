package p000;

/* renamed from: ilz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ilz extends bxvk implements bxxd {

    /* renamed from: d */
    public static final ilz f21326d;

    /* renamed from: e */
    private static volatile bxxk f21327e;

    /* renamed from: a */
    public int f21328a;

    /* renamed from: b */
    public String f21329b = "";

    /* renamed from: c */
    public String f21330c = "";

    static {
        ilz ilz = new ilz();
        f21326d = ilz;
        bxvk.m124024a(ilz.class, ilz);
    }

    private ilz() {
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
            return bxvk.m124022a(f21326d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new ilz();
        } else {
            if (i2 == 4) {
                return new bxvd(f21326d);
            }
            if (i2 == 5) {
                return f21326d;
            }
            bxxk bxxk = f21327e;
            if (bxxk == null) {
                synchronized (ilz.class) {
                    bxxk = f21327e;
                    if (bxxk == null) {
                        bxxk = new bxve(f21326d);
                        f21327e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
