package p000;

/* renamed from: mpe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mpe extends bxvk implements bxxd {

    /* renamed from: b */
    public static final mpe f34116b;

    /* renamed from: d */
    private static volatile bxxk f34117d;

    /* renamed from: a */
    public bxtx f34118a = bxtx.f164797b;

    /* renamed from: c */
    private int f34119c;

    static {
        mpe mpe = new mpe();
        f34116b = mpe;
        bxvk.m124024a(mpe.class, mpe);
    }

    private mpe() {
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
            return bxvk.m124022a(f34116b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new mpe();
        } else {
            if (i2 == 4) {
                return new bxvd(f34116b);
            }
            if (i2 == 5) {
                return f34116b;
            }
            bxxk bxxk = f34117d;
            if (bxxk == null) {
                synchronized (mpe.class) {
                    bxxk = f34117d;
                    if (bxxk == null) {
                        bxxk = new bxve(f34116b);
                        f34117d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
