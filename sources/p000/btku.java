package p000;

/* renamed from: btku */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btku extends bxvk implements bxxd {

    /* renamed from: b */
    public static final btku f149314b;

    /* renamed from: c */
    private static volatile bxxk f149315c;

    /* renamed from: a */
    public bxtx f149316a = bxtx.f164797b;

    static {
        btku btku = new btku();
        f149314b = btku;
        bxvk.m124024a(btku.class, btku);
    }

    private btku() {
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
            return bxvk.m124022a(f149314b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"a"});
        } else if (i2 == 3) {
            return new btku();
        } else {
            if (i2 == 4) {
                return new bxvd(f149314b);
            }
            if (i2 == 5) {
                return f149314b;
            }
            bxxk bxxk = f149315c;
            if (bxxk == null) {
                synchronized (btku.class) {
                    bxxk = f149315c;
                    if (bxxk == null) {
                        bxxk = new bxve(f149314b);
                        f149315c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
