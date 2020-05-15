package p000;

/* renamed from: bmmy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmmy extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bmmy f130070b;

    /* renamed from: d */
    private static volatile bxxk f130071d;

    /* renamed from: a */
    public boolean f130072a;

    /* renamed from: c */
    private int f130073c;

    static {
        bmmy bmmy = new bmmy();
        f130070b = bmmy;
        bxvk.m124024a(bmmy.class, bmmy);
    }

    private bmmy() {
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
            return bxvk.m124022a(f130070b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bmmy();
        } else {
            if (i2 == 4) {
                return new bxvd(f130070b);
            }
            if (i2 == 5) {
                return f130070b;
            }
            bxxk bxxk = f130071d;
            if (bxxk == null) {
                synchronized (bmmy.class) {
                    bxxk = f130071d;
                    if (bxxk == null) {
                        bxxk = new bxve(f130070b);
                        f130071d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
