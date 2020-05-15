package p000;

/* renamed from: bteh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bteh extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bteh f148502d;

    /* renamed from: e */
    private static volatile bxxk f148503e;

    /* renamed from: a */
    public bxuw f148504a;

    /* renamed from: b */
    public bxvt f148505b = bxvm.f164965b;

    /* renamed from: c */
    public bteg f148506c;

    static {
        bteh bteh = new bteh();
        f148502d = bteh;
        bxvk.m124024a(bteh.class, bteh);
    }

    private bteh() {
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
            return bxvk.m124022a(f148502d, "\u0000\u0003\u0000\u0000\u0001\u0007\u0003\u0000\u0001\u0000\u0001\t\u0003,\u0007\t", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bteh();
        } else {
            if (i2 == 4) {
                return new btef();
            }
            if (i2 == 5) {
                return f148502d;
            }
            bxxk bxxk = f148503e;
            if (bxxk == null) {
                synchronized (bteh.class) {
                    bxxk = f148503e;
                    if (bxxk == null) {
                        bxxk = new bxve(f148502d);
                        f148503e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
