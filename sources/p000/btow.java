package p000;

/* renamed from: btow */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btow extends bxvk implements bxxd {

    /* renamed from: d */
    public static final btow f149810d;

    /* renamed from: e */
    private static volatile bxxk f149811e;

    /* renamed from: a */
    public boolean f149812a;

    /* renamed from: b */
    public long f149813b;

    /* renamed from: c */
    public boolean f149814c;

    static {
        btow btow = new btow();
        f149810d = btow;
        bxvk.m124024a(btow.class, btow);
    }

    private btow() {
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
            return bxvk.m124022a(f149810d, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u0007\u0002\u0002\u0004\u0007", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new btow();
        } else {
            if (i2 == 4) {
                return new bxvd(f149810d);
            }
            if (i2 == 5) {
                return f149810d;
            }
            bxxk bxxk = f149811e;
            if (bxxk == null) {
                synchronized (btow.class) {
                    bxxk = f149811e;
                    if (bxxk == null) {
                        bxxk = new bxve(f149810d);
                        f149811e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
