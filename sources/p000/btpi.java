package p000;

/* renamed from: btpi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btpi extends bxvk implements bxxd {

    /* renamed from: b */
    public static final btpi f149847b;

    /* renamed from: c */
    private static volatile bxxk f149848c;

    /* renamed from: a */
    public int f149849a;

    static {
        btpi btpi = new btpi();
        f149847b = btpi;
        bxvk.m124024a(btpi.class, btpi);
    }

    private btpi() {
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
            return bxvk.m124022a(f149847b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
        } else if (i2 == 3) {
            return new btpi();
        } else {
            if (i2 == 4) {
                return new bxvd(f149847b);
            }
            if (i2 == 5) {
                return f149847b;
            }
            bxxk bxxk = f149848c;
            if (bxxk == null) {
                synchronized (btpi.class) {
                    bxxk = f149848c;
                    if (bxxk == null) {
                        bxxk = new bxve(f149847b);
                        f149848c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
