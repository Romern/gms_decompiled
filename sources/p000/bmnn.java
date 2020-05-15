package p000;

/* renamed from: bmnn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmnn extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bmnn f130132e;

    /* renamed from: f */
    private static volatile bxxk f130133f;

    /* renamed from: a */
    public int f130134a;

    /* renamed from: b */
    public bxwc f130135b = bxxn.f165040b;

    /* renamed from: c */
    public String f130136c = "";

    /* renamed from: d */
    public boolean f130137d;

    static {
        bmnn bmnn = new bmnn();
        f130132e = bmnn;
        bxvk.m124024a(bmnn.class, bmnn);
    }

    private bmnn() {
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
            return bxvk.m124022a(f130132e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဇ\u0001", new Object[]{"a", "b", bmnm.class, "c", "d"});
        } else if (i2 == 3) {
            return new bmnn();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][][]) null, (short[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f130132e;
            }
            bxxk bxxk = f130133f;
            if (bxxk == null) {
                synchronized (bmnn.class) {
                    bxxk = f130133f;
                    if (bxxk == null) {
                        bxxk = new bxve(f130132e);
                        f130133f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
