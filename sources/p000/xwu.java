package p000;

/* renamed from: xwu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xwu extends bxvk implements bxxd {

    /* renamed from: e */
    public static final xwu f53308e;

    /* renamed from: f */
    private static volatile bxxk f53309f;

    /* renamed from: a */
    public bxtx f53310a = bxtx.f164797b;

    /* renamed from: b */
    public long f53311b;

    /* renamed from: c */
    public String f53312c = "";

    /* renamed from: d */
    public bxtx f53313d = bxtx.f164797b;

    static {
        xwu xwu = new xwu();
        f53308e = xwu;
        bxvk.m124024a(xwu.class, xwu);
    }

    private xwu() {
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
            return bxvk.m124022a(f53308e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\n\u0002\u0002\u0003Ȉ\u0004\n", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new xwu();
        } else {
            if (i2 == 4) {
                return new bxvd(f53308e);
            }
            if (i2 == 5) {
                return f53308e;
            }
            bxxk bxxk = f53309f;
            if (bxxk == null) {
                synchronized (xwu.class) {
                    bxxk = f53309f;
                    if (bxxk == null) {
                        bxxk = new bxve(f53308e);
                        f53309f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
