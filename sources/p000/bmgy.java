package p000;

/* renamed from: bmgy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmgy extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bmgy f129365d;

    /* renamed from: f */
    private static volatile bxxk f129366f;

    /* renamed from: a */
    public bmdn f129367a;

    /* renamed from: b */
    public bxwc f129368b = bxxn.f165040b;

    /* renamed from: c */
    public int f129369c;

    /* renamed from: e */
    private int f129370e;

    static {
        bmgy bmgy = new bmgy();
        f129365d = bmgy;
        bxvk.m124024a(bmgy.class, bmgy);
    }

    private bmgy() {
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
            return bxvk.m124022a(f129365d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003င\u0001", new Object[]{"e", "a", "b", bmgx.class, "c"});
        } else if (i2 == 3) {
            return new bmgy();
        } else {
            if (i2 == 4) {
                return new bxvd(f129365d);
            }
            if (i2 == 5) {
                return f129365d;
            }
            bxxk bxxk = f129366f;
            if (bxxk == null) {
                synchronized (bmgy.class) {
                    bxxk = f129366f;
                    if (bxxk == null) {
                        bxxk = new bxve(f129365d);
                        f129366f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
