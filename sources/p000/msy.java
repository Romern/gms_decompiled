package p000;

/* renamed from: msy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class msy extends bxvk implements bxxd {

    /* renamed from: c */
    public static final msy f34602c;

    /* renamed from: d */
    private static volatile bxxk f34603d;

    /* renamed from: a */
    public int f34604a;

    /* renamed from: b */
    public int f34605b;

    static {
        msy msy = new msy();
        f34602c = msy;
        bxvk.m124024a(msy.class, msy);
    }

    private msy() {
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
            return bxvk.m124022a(f34602c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", msx.f34601a});
        } else if (i2 == 3) {
            return new msy();
        } else {
            if (i2 == 4) {
                return new bxvd(f34602c);
            }
            if (i2 == 5) {
                return f34602c;
            }
            bxxk bxxk = f34603d;
            if (bxxk == null) {
                synchronized (msy.class) {
                    bxxk = f34603d;
                    if (bxxk == null) {
                        bxxk = new bxve(f34602c);
                        f34603d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
