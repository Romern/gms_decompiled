package p000;

/* renamed from: btiw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btiw extends bxvk implements bxxd {

    /* renamed from: d */
    public static final btiw f149044d;

    /* renamed from: e */
    private static volatile bxxk f149045e;

    /* renamed from: a */
    public int f149046a;

    /* renamed from: b */
    public String f149047b = "";

    /* renamed from: c */
    public bxtx f149048c = bxtx.f164797b;

    static {
        btiw btiw = new btiw();
        f149044d = btiw;
        bxvk.m124024a(btiw.class, btiw);
    }

    private btiw() {
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
            return bxvk.m124022a(f149044d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\n", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new btiw();
        } else {
            if (i2 == 4) {
                return new bxvd(f149044d);
            }
            if (i2 == 5) {
                return f149044d;
            }
            bxxk bxxk = f149045e;
            if (bxxk == null) {
                synchronized (btiw.class) {
                    bxxk = f149045e;
                    if (bxxk == null) {
                        bxxk = new bxve(f149044d);
                        f149045e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
