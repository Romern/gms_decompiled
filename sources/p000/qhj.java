package p000;

/* renamed from: qhj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qhj extends bxvk implements bxxd {

    /* renamed from: g */
    public static final qhj f41354g;

    /* renamed from: h */
    private static volatile bxxk f41355h;

    /* renamed from: a */
    public int f41356a;

    /* renamed from: b */
    public int f41357b;

    /* renamed from: c */
    public int f41358c;

    /* renamed from: d */
    public String f41359d = "";

    /* renamed from: e */
    public String f41360e = "";

    /* renamed from: f */
    public boolean f41361f;

    static {
        qhj qhj = new qhj();
        f41354g = qhj;
        bxvk.m124024a(qhj.class, qhj);
    }

    private qhj() {
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
            return bxvk.m124022a(f41354g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဇ\u0004", new Object[]{"a", "b", qhh.f41353a, "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new qhj();
        } else {
            if (i2 == 4) {
                return new bxvd(f41354g);
            }
            if (i2 == 5) {
                return f41354g;
            }
            bxxk bxxk = f41355h;
            if (bxxk == null) {
                synchronized (qhj.class) {
                    bxxk = f41355h;
                    if (bxxk == null) {
                        bxxk = new bxve(f41354g);
                        f41355h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
