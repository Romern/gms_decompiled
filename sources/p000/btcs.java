package p000;

/* renamed from: btcs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btcs extends bxvk implements bxxd {

    /* renamed from: b */
    public static final btcs f148310b;

    /* renamed from: c */
    private static volatile bxxk f148311c;

    /* renamed from: a */
    public String f148312a = "";

    static {
        btcs btcs = new btcs();
        f148310b = btcs;
        bxvk.m124024a(btcs.class, btcs);
    }

    private btcs() {
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
            return bxvk.m124022a(f148310b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new btcs();
        } else {
            if (i2 == 4) {
                return new bxvd(f148310b);
            }
            if (i2 == 5) {
                return f148310b;
            }
            bxxk bxxk = f148311c;
            if (bxxk == null) {
                synchronized (btcs.class) {
                    bxxk = f148311c;
                    if (bxxk == null) {
                        bxxk = new bxve(f148310b);
                        f148311c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
