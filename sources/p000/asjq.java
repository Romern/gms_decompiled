package p000;

/* renamed from: asjq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asjq extends bxvk implements bxxd {

    /* renamed from: f */
    public static final asjq f89078f;

    /* renamed from: g */
    private static volatile bxxk f89079g;

    /* renamed from: a */
    public String f89080a = "";

    /* renamed from: b */
    public bxwc f89081b = bxxn.f165040b;

    /* renamed from: c */
    public String f89082c = "";

    /* renamed from: d */
    public int f89083d;

    /* renamed from: e */
    public bxtx f89084e = bxtx.f164797b;

    static {
        asjq asjq = new asjq();
        f89078f = asjq;
        bxvk.m124024a(asjq.class, asjq);
    }

    private asjq() {
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
            return bxvk.m124022a(f89078f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002Ț\u0003Ȉ\u0004\u0004\u0005\n", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new asjq();
        } else {
            if (i2 == 4) {
                return new asjp();
            }
            if (i2 == 5) {
                return f89078f;
            }
            bxxk bxxk = f89079g;
            if (bxxk == null) {
                synchronized (asjq.class) {
                    bxxk = f89079g;
                    if (bxxk == null) {
                        bxxk = new bxve(f89078f);
                        f89079g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
