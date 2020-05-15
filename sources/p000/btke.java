package p000;

/* renamed from: btke */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btke extends bxvk implements bxxd {

    /* renamed from: d */
    public static final btke f149242d;

    /* renamed from: e */
    private static volatile bxxk f149243e;

    /* renamed from: a */
    public String f149244a = "";

    /* renamed from: b */
    public String f149245b = "";

    /* renamed from: c */
    public bxtx f149246c = bxtx.f164797b;

    static {
        btke btke = new btke();
        f149242d = btke;
        bxvk.m124024a(btke.class, btke);
    }

    private btke() {
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
            return bxvk.m124022a(f149242d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\n", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new btke();
        } else {
            if (i2 == 4) {
                return new bxvd(f149242d);
            }
            if (i2 == 5) {
                return f149242d;
            }
            bxxk bxxk = f149243e;
            if (bxxk == null) {
                synchronized (btke.class) {
                    bxxk = f149243e;
                    if (bxxk == null) {
                        bxxk = new bxve(f149242d);
                        f149243e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
