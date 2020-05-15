package p000;

/* renamed from: agmy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agmy extends bxvk implements bxxd {

    /* renamed from: g */
    public static final agmy f66006g;

    /* renamed from: h */
    private static volatile bxxk f66007h;

    /* renamed from: a */
    public int f66008a;

    /* renamed from: b */
    public int f66009b;

    /* renamed from: c */
    public boolean f66010c;

    /* renamed from: d */
    public String f66011d = "";

    /* renamed from: e */
    public String f66012e = "";

    /* renamed from: f */
    public String f66013f = "";

    static {
        agmy agmy = new agmy();
        f66006g = agmy;
        bxvk.m124024a(agmy.class, agmy);
    }

    private agmy() {
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
            return bxvk.m124022a(f66006g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", agmw.f66005a, "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new agmy();
        } else {
            if (i2 == 4) {
                return new bxvd(f66006g);
            }
            if (i2 == 5) {
                return f66006g;
            }
            bxxk bxxk = f66007h;
            if (bxxk == null) {
                synchronized (agmy.class) {
                    bxxk = f66007h;
                    if (bxxk == null) {
                        bxxk = new bxve(f66006g);
                        f66007h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
