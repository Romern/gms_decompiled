package p000;

/* renamed from: bzlm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzlm extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bzlm f170545d;

    /* renamed from: e */
    private static volatile bxxk f170546e;

    /* renamed from: a */
    public int f170547a;

    /* renamed from: b */
    public String f170548b = "";

    /* renamed from: c */
    public bxtx f170549c = bxtx.f164797b;

    static {
        bzlm bzlm = new bzlm();
        f170545d = bzlm;
        bxvk.m124024a(bzlm.class, bzlm);
    }

    private bzlm() {
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
            return bxvk.m124022a(f170545d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0003ည\u0002", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bzlm();
        } else {
            if (i2 == 4) {
                return new bxvd(f170545d);
            }
            if (i2 == 5) {
                return f170545d;
            }
            bxxk bxxk = f170546e;
            if (bxxk == null) {
                synchronized (bzlm.class) {
                    bxxk = f170546e;
                    if (bxxk == null) {
                        bxxk = new bxve(f170545d);
                        f170546e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
