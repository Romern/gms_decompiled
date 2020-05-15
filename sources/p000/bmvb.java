package p000;

/* renamed from: bmvb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmvb extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bmvb f131011d;

    /* renamed from: e */
    private static volatile bxxk f131012e;

    /* renamed from: a */
    public int f131013a;

    /* renamed from: b */
    public double f131014b;

    /* renamed from: c */
    public double f131015c;

    static {
        bmvb bmvb = new bmvb();
        f131011d = bmvb;
        bxvk.m124024a(bmvb.class, bmvb);
    }

    private bmvb() {
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
            return bxvk.m124022a(f131011d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bmvb();
        } else {
            if (i2 == 4) {
                return new bxvd(f131011d);
            }
            if (i2 == 5) {
                return f131011d;
            }
            bxxk bxxk = f131012e;
            if (bxxk == null) {
                synchronized (bmvb.class) {
                    bxxk = f131012e;
                    if (bxxk == null) {
                        bxxk = new bxve(f131011d);
                        f131012e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
