package p000;

/* renamed from: bzhb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzhb extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bzhb f170016c;

    /* renamed from: e */
    private static volatile bxxk f170017e;

    /* renamed from: a */
    public String f170018a = "";

    /* renamed from: b */
    public String f170019b = "";

    /* renamed from: d */
    private int f170020d;

    static {
        bzhb bzhb = new bzhb();
        f170016c = bzhb;
        bxvk.m124024a(bzhb.class, bzhb);
    }

    private bzhb() {
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
            return bxvk.m124022a(f170016c, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0004ဈ\u0003", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bzhb();
        } else {
            if (i2 == 4) {
                return new bxvd(f170016c);
            }
            if (i2 == 5) {
                return f170016c;
            }
            bxxk bxxk = f170017e;
            if (bxxk == null) {
                synchronized (bzhb.class) {
                    bxxk = f170017e;
                    if (bxxk == null) {
                        bxxk = new bxve(f170016c);
                        f170017e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
