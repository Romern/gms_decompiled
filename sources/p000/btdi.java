package p000;

/* renamed from: btdi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btdi extends bxvk implements bxxd {

    /* renamed from: b */
    public static final btdi f148400b;

    /* renamed from: c */
    private static volatile bxxk f148401c;

    /* renamed from: a */
    public bxvt f148402a = bxvm.f164965b;

    static {
        btdi btdi = new btdi();
        f148400b = btdi;
        bxvk.m124024a(btdi.class, btdi);
    }

    private btdi() {
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
            return bxvk.m124022a(f148400b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"a"});
        } else if (i2 == 3) {
            return new btdi();
        } else {
            if (i2 == 4) {
                return new btdg();
            }
            if (i2 == 5) {
                return f148400b;
            }
            bxxk bxxk = f148401c;
            if (bxxk == null) {
                synchronized (btdi.class) {
                    bxxk = f148401c;
                    if (bxxk == null) {
                        bxxk = new bxve(f148400b);
                        f148401c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
