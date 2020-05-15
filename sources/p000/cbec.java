package p000;

/* renamed from: cbec */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbec extends bxvk implements bxxd {

    /* renamed from: g */
    public static final cbec f176821g;

    /* renamed from: h */
    private static volatile bxxk f176822h;

    /* renamed from: a */
    public cbdj f176823a;

    /* renamed from: b */
    public bxtx f176824b = bxtx.f164797b;

    /* renamed from: c */
    public String f176825c = "";

    /* renamed from: d */
    public int f176826d;

    /* renamed from: e */
    public cbdr f176827e;

    /* renamed from: f */
    public int f176828f;

    static {
        cbec cbec = new cbec();
        f176821g = cbec;
        bxvk.m124024a(cbec.class, cbec);
    }

    private cbec() {
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
            return bxvk.m124022a(f176821g, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\t\u0002\n\u0003Ȉ\u0004\u0004\u0005\t\u0006\f", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new cbec();
        } else {
            if (i2 == 4) {
                return new bxvd(f176821g);
            }
            if (i2 == 5) {
                return f176821g;
            }
            bxxk bxxk = f176822h;
            if (bxxk == null) {
                synchronized (cbec.class) {
                    bxxk = f176822h;
                    if (bxxk == null) {
                        bxxk = new bxve(f176821g);
                        f176822h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
