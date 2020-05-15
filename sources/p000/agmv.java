package p000;

/* renamed from: agmv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agmv extends bxvk implements bxxd {

    /* renamed from: f */
    public static final agmv f65998f;

    /* renamed from: g */
    private static volatile bxxk f65999g;

    /* renamed from: a */
    public int f66000a;

    /* renamed from: b */
    public agnc f66001b;

    /* renamed from: c */
    public agmy f66002c;

    /* renamed from: d */
    public boolean f66003d;

    /* renamed from: e */
    public String f66004e = "";

    static {
        agmv agmv = new agmv();
        f65998f = agmv;
        bxvk.m124024a(agmv.class, agmv);
    }

    private agmv() {
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
            return bxvk.m124022a(f65998f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new agmv();
        } else {
            if (i2 == 4) {
                return new bxvd(f65998f);
            }
            if (i2 == 5) {
                return f65998f;
            }
            bxxk bxxk = f65999g;
            if (bxxk == null) {
                synchronized (agmv.class) {
                    bxxk = f65999g;
                    if (bxxk == null) {
                        bxxk = new bxve(f65998f);
                        f65999g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
