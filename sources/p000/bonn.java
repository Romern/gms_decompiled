package p000;

/* renamed from: bonn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bonn extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bonn f133826e;

    /* renamed from: f */
    private static volatile bxxk f133827f;

    /* renamed from: a */
    public int f133828a;

    /* renamed from: b */
    public bxwc f133829b = bxxn.f165040b;

    /* renamed from: c */
    public boolean f133830c;

    /* renamed from: d */
    public boolean f133831d;

    static {
        bonn bonn = new bonn();
        f133826e = bonn;
        bxvk.m124024a(bonn.class, bonn);
    }

    private bonn() {
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
            return bxvk.m124022a(f133826e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001\u001b\u0003ဇ\u0000\u0004ဇ\u0001", new Object[]{"a", "b", bonl.class, "c", "d"});
        } else if (i2 == 3) {
            return new bonn();
        } else {
            if (i2 == 4) {
                return new bonm();
            }
            if (i2 == 5) {
                return f133826e;
            }
            bxxk bxxk = f133827f;
            if (bxxk == null) {
                synchronized (bonn.class) {
                    bxxk = f133827f;
                    if (bxxk == null) {
                        bxxk = new bxve(f133826e);
                        f133827f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
