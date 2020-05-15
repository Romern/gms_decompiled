package p000;

/* renamed from: wzy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wzy extends bxvk implements bxxd {

    /* renamed from: d */
    public static final wzy f51665d;

    /* renamed from: e */
    private static volatile bxxk f51666e;

    /* renamed from: a */
    public int f51667a;

    /* renamed from: b */
    public int f51668b;

    /* renamed from: c */
    public String f51669c = "";

    static {
        wzy wzy = new wzy();
        f51665d = wzy;
        bxvk.m124024a(wzy.class, wzy);
    }

    private wzy() {
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
            return bxvk.m124022a(f51665d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new wzy();
        } else {
            if (i2 == 4) {
                return new bxvd(f51665d);
            }
            if (i2 == 5) {
                return f51665d;
            }
            bxxk bxxk = f51666e;
            if (bxxk == null) {
                synchronized (wzy.class) {
                    bxxk = f51666e;
                    if (bxxk == null) {
                        bxxk = new bxve(f51665d);
                        f51666e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
