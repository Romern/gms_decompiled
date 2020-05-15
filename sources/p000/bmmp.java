package p000;

/* renamed from: bmmp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmmp extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bmmp f130032e;

    /* renamed from: g */
    private static volatile bxxk f130033g;

    /* renamed from: a */
    public bxvw f130034a = bxwq.f165002b;

    /* renamed from: b */
    public boolean f130035b;

    /* renamed from: c */
    public bxvw f130036c = bxwq.f165002b;

    /* renamed from: d */
    public bxtx f130037d = bxtx.f164797b;

    /* renamed from: f */
    private int f130038f;

    static {
        bmmp bmmp = new bmmp();
        f130032e = bmmp;
        bxvk.m124024a(bmmp.class, bmmp);
    }

    private bmmp() {
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
            return bxvk.m124022a(f130032e, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0002\u0000\u0001%\u0002ဇ\u0000\u0005ည\u0001\u0006%", new Object[]{"f", "a", "b", "d", "c"});
        } else if (i2 == 3) {
            return new bmmp();
        } else {
            if (i2 == 4) {
                return new bxvd(f130032e);
            }
            if (i2 == 5) {
                return f130032e;
            }
            bxxk bxxk = f130033g;
            if (bxxk == null) {
                synchronized (bmmp.class) {
                    bxxk = f130033g;
                    if (bxxk == null) {
                        bxxk = new bxve(f130032e);
                        f130033g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
