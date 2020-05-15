package p000;

/* renamed from: bsqz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsqz extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bsqz f146720d;

    /* renamed from: e */
    private static volatile bxxk f146721e;

    /* renamed from: a */
    public int f146722a;

    /* renamed from: b */
    public bssl f146723b;

    /* renamed from: c */
    public boolean f146724c;

    static {
        bsqz bsqz = new bsqz();
        f146720d = bsqz;
        bxvk.m124024a(bsqz.class, bsqz);
    }

    private bsqz() {
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
            return bxvk.m124022a(f146720d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bsqz();
        } else {
            if (i2 == 4) {
                return new bxvd(f146720d);
            }
            if (i2 == 5) {
                return f146720d;
            }
            bxxk bxxk = f146721e;
            if (bxxk == null) {
                synchronized (bsqz.class) {
                    bxxk = f146721e;
                    if (bxxk == null) {
                        bxxk = new bxve(f146720d);
                        f146721e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
