package p000;

/* renamed from: abeq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abeq extends bxvk implements bxxd {

    /* renamed from: g */
    public static final abeq f57276g;

    /* renamed from: h */
    private static volatile bxxk f57277h;

    /* renamed from: a */
    public int f57278a;

    /* renamed from: b */
    public String f57279b = "";

    /* renamed from: c */
    public String f57280c = "";

    /* renamed from: d */
    public String f57281d = "";

    /* renamed from: e */
    public String f57282e = "";

    /* renamed from: f */
    public String f57283f = "";

    static {
        abeq abeq = new abeq();
        f57276g = abeq;
        bxvk.m124024a(abeq.class, abeq);
    }

    private abeq() {
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
            return bxvk.m124022a(f57276g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0007ဈ\u0006", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new abeq();
        } else {
            if (i2 == 4) {
                return new bxvd(f57276g);
            }
            if (i2 == 5) {
                return f57276g;
            }
            bxxk bxxk = f57277h;
            if (bxxk == null) {
                synchronized (abeq.class) {
                    bxxk = f57277h;
                    if (bxxk == null) {
                        bxxk = new bxve(f57276g);
                        f57277h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
