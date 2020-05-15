package p000;

/* renamed from: blxv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blxv extends bxvk implements bxxd {

    /* renamed from: d */
    public static final blxv f128147d;

    /* renamed from: e */
    private static volatile bxxk f128148e;

    /* renamed from: a */
    public int f128149a;

    /* renamed from: b */
    public blxu f128150b;

    /* renamed from: c */
    public bmag f128151c;

    static {
        blxv blxv = new blxv();
        f128147d = blxv;
        bxvk.m124024a(blxv.class, blxv);
    }

    private blxv() {
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
            return bxvk.m124022a(f128147d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new blxv();
        } else {
            if (i2 == 4) {
                return new bxvd(f128147d);
            }
            if (i2 == 5) {
                return f128147d;
            }
            bxxk bxxk = f128148e;
            if (bxxk == null) {
                synchronized (blxv.class) {
                    bxxk = f128148e;
                    if (bxxk == null) {
                        bxxk = new bxve(f128147d);
                        f128148e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
