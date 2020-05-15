package p000;

/* renamed from: allx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class allx extends bxvk implements bxxd {

    /* renamed from: d */
    public static final allx f73647d;

    /* renamed from: f */
    private static volatile bxxk f73648f;

    /* renamed from: a */
    public bxwc f73649a = bxxn.f165040b;

    /* renamed from: b */
    public int f73650b = 1;

    /* renamed from: c */
    public int f73651c;

    /* renamed from: e */
    private int f73652e;

    static {
        allx allx = new allx();
        f73647d = allx;
        bxvk.m124024a(allx.class, allx);
    }

    private allx() {
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
            return bxvk.m124022a(f73647d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဌ\u0000\u0003ဌ\u0001", new Object[]{"e", "a", allw.class, "b", allz.m61246b(), "c", allz.m61246b()});
        } else if (i2 == 3) {
            return new allx();
        } else {
            if (i2 == 4) {
                return new bxvd((int[]) null, (short[][]) null);
            }
            if (i2 == 5) {
                return f73647d;
            }
            bxxk bxxk = f73648f;
            if (bxxk == null) {
                synchronized (allx.class) {
                    bxxk = f73648f;
                    if (bxxk == null) {
                        bxxk = new bxve(f73647d);
                        f73648f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
