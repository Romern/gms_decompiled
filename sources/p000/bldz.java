package p000;

/* renamed from: bldz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bldz extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bldz f126159b;

    /* renamed from: c */
    private static volatile bxxk f126160c;

    /* renamed from: a */
    public bxvt f126161a = bxvm.f164965b;

    static {
        bldz bldz = new bldz();
        f126159b = bldz;
        bxvk.m124024a(bldz.class, bldz);
    }

    private bldz() {
        bxxn bxxn = bxxn.f165040b;
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
            return bxvk.m124022a(f126159b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001e", new Object[]{"a", bldy.m107061b()});
        } else if (i2 == 3) {
            return new bldz();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][][]) null, (float[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f126159b;
            }
            bxxk bxxk = f126160c;
            if (bxxk == null) {
                synchronized (bldz.class) {
                    bxxk = f126160c;
                    if (bxxk == null) {
                        bxxk = new bxve(f126159b);
                        f126160c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
