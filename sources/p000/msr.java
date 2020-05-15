package p000;

/* renamed from: msr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class msr extends bxvk implements bxxd {

    /* renamed from: c */
    public static final msr f34581c;

    /* renamed from: d */
    private static volatile bxxk f34582d;

    /* renamed from: a */
    public int f34583a;

    /* renamed from: b */
    public int f34584b;

    static {
        msr msr = new msr();
        f34581c = msr;
        bxvk.m124024a(msr.class, msr);
    }

    private msr() {
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
            return bxvk.m124022a(f34581c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", msq.f34580a});
        } else if (i2 == 3) {
            return new msr();
        } else {
            if (i2 == 4) {
                return new bxvd(f34581c);
            }
            if (i2 == 5) {
                return f34581c;
            }
            bxxk bxxk = f34582d;
            if (bxxk == null) {
                synchronized (msr.class) {
                    bxxk = f34582d;
                    if (bxxk == null) {
                        bxxk = new bxve(f34581c);
                        f34582d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
