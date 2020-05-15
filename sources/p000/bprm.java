package p000;

/* renamed from: bprm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bprm extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bprm f138869c;

    /* renamed from: d */
    private static volatile bxxk f138870d;

    /* renamed from: a */
    public int f138871a;

    /* renamed from: b */
    public int f138872b;

    static {
        bprm bprm = new bprm();
        f138869c = bprm;
        bxvk.m124024a(bprm.class, bprm);
    }

    private bprm() {
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
            return bxvk.m124022a(f138869c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bpot.m112131b()});
        } else if (i2 == 3) {
            return new bprm();
        } else {
            if (i2 == 4) {
                return new bxvd(f138869c);
            }
            if (i2 == 5) {
                return f138869c;
            }
            bxxk bxxk = f138870d;
            if (bxxk == null) {
                synchronized (bprm.class) {
                    bxxk = f138870d;
                    if (bxxk == null) {
                        bxxk = new bxve(f138869c);
                        f138870d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
