package p000;

/* renamed from: bmpf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmpf extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bmpf f130291d;

    /* renamed from: e */
    private static volatile bxxk f130292e;

    /* renamed from: a */
    public int f130293a;

    /* renamed from: b */
    public String f130294b = "";

    /* renamed from: c */
    public bmnr f130295c;

    static {
        bmpf bmpf = new bmpf();
        f130291d = bmpf;
        GeneratedMessageLite.m124024a(bmpf.class, bmpf);
    }

    private bmpf() {
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
            return GeneratedMessageLite.m124022a(f130291d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bmpf();
        } else {
            if (i2 == 4) {
                return new bxvd(f130291d);
            }
            if (i2 == 5) {
                return f130291d;
            }
            bxxk bxxk = f130292e;
            if (bxxk == null) {
                synchronized (bmpf.class) {
                    bxxk = f130292e;
                    if (bxxk == null) {
                        bxxk = new bxve(f130291d);
                        f130292e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
