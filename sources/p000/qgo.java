package p000;

/* renamed from: qgo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qgo extends bxvk implements bxxd {

    /* renamed from: f */
    public static final qgo f41191f;

    /* renamed from: g */
    private static volatile bxxk f41192g;

    /* renamed from: a */
    public int f41193a;

    /* renamed from: b */
    public boolean f41194b;

    /* renamed from: c */
    public boolean f41195c;

    /* renamed from: d */
    public boolean f41196d;

    /* renamed from: e */
    public boolean f41197e;

    static {
        qgo qgo = new qgo();
        f41191f = qgo;
        bxvk.m124024a(qgo.class, qgo);
    }

    private qgo() {
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
            return bxvk.m124022a(f41191f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new qgo();
        } else {
            if (i2 == 4) {
                return new bxvd(f41191f);
            }
            if (i2 == 5) {
                return f41191f;
            }
            bxxk bxxk = f41192g;
            if (bxxk == null) {
                synchronized (qgo.class) {
                    bxxk = f41192g;
                    if (bxxk == null) {
                        bxxk = new bxve(f41191f);
                        f41192g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
