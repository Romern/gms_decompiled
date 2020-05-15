package p000;

/* renamed from: lal */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lal extends bxvk implements bxxd {

    /* renamed from: d */
    public static final lal f25566d;

    /* renamed from: e */
    private static volatile bxxk f25567e;

    /* renamed from: a */
    public bxvt f25568a = bxvm.f164965b;

    /* renamed from: b */
    public bxvt f25569b = bxvm.f164965b;

    /* renamed from: c */
    public bxvn f25570c = bxtk.f164779b;

    static {
        lal lal = new lal();
        f25566d = lal;
        bxvk.m124024a(lal.class, lal);
    }

    private lal() {
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
            return bxvk.m124022a(f25566d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001'\u0002'\u0003*", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new lal();
        } else {
            if (i2 == 4) {
                return new bxvd(f25566d);
            }
            if (i2 == 5) {
                return f25566d;
            }
            bxxk bxxk = f25567e;
            if (bxxk == null) {
                synchronized (lal.class) {
                    bxxk = f25567e;
                    if (bxxk == null) {
                        bxxk = new bxve(f25566d);
                        f25567e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
