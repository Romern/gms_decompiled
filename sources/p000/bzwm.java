package p000;

/* renamed from: bzwm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzwm extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bzwm f171648d;

    /* renamed from: e */
    private static volatile bxxk f171649e;

    /* renamed from: a */
    public int f171650a;

    /* renamed from: b */
    public int f171651b;

    /* renamed from: c */
    public boolean f171652c;

    static {
        bzwm bzwm = new bzwm();
        f171648d = bzwm;
        bxvk.m124024a(bzwm.class, bzwm);
    }

    private bzwm() {
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
            return bxvk.m124022a(f171648d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bzwm();
        } else {
            if (i2 == 4) {
                return new bxvd(f171648d);
            }
            if (i2 == 5) {
                return f171648d;
            }
            bxxk bxxk = f171649e;
            if (bxxk == null) {
                synchronized (bzwm.class) {
                    bxxk = f171649e;
                    if (bxxk == null) {
                        bxxk = new bxve(f171648d);
                        f171649e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
