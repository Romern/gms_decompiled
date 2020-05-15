package p000;

/* renamed from: agmz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agmz extends bxvk implements bxxd {

    /* renamed from: h */
    public static final agmz f66014h;

    /* renamed from: i */
    private static volatile bxxk f66015i;

    /* renamed from: a */
    public int f66016a;

    /* renamed from: b */
    public int f66017b;

    /* renamed from: c */
    public String f66018c = "";

    /* renamed from: d */
    public agmv f66019d;

    /* renamed from: e */
    public boolean f66020e;

    /* renamed from: f */
    public boolean f66021f;

    /* renamed from: g */
    public boolean f66022g;

    static {
        agmz agmz = new agmz();
        f66014h = agmz;
        bxvk.m124024a(agmz.class, agmz);
    }

    private agmz() {
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
            return bxvk.m124022a(f66014h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new agmz();
        } else {
            if (i2 == 4) {
                return new bxvd(f66014h);
            }
            if (i2 == 5) {
                return f66014h;
            }
            bxxk bxxk = f66015i;
            if (bxxk == null) {
                synchronized (agmz.class) {
                    bxxk = f66015i;
                    if (bxxk == null) {
                        bxxk = new bxve(f66014h);
                        f66015i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
