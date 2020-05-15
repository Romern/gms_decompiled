package p000;

/* renamed from: btlr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btlr extends bxvk implements bxxd {

    /* renamed from: e */
    public static final btlr f149408e;

    /* renamed from: f */
    private static volatile bxxk f149409f;

    /* renamed from: a */
    public int f149410a = 0;

    /* renamed from: b */
    public Object f149411b;

    /* renamed from: c */
    public int f149412c;

    /* renamed from: d */
    public int f149413d;

    static {
        btlr btlr = new btlr();
        f149408e = btlr;
        bxvk.m124024a(btlr.class, btlr);
    }

    private btlr() {
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
            return bxvk.m124022a(f149408e, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002<\u0000\u0003:\u0000\u0004\f", new Object[]{"b", "a", "c", bxun.class, "d"});
        } else if (i2 == 3) {
            return new btlr();
        } else {
            if (i2 == 4) {
                return new bxvd(f149408e);
            }
            if (i2 == 5) {
                return f149408e;
            }
            bxxk bxxk = f149409f;
            if (bxxk == null) {
                synchronized (btlr.class) {
                    bxxk = f149409f;
                    if (bxxk == null) {
                        bxxk = new bxve(f149408e);
                        f149409f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
