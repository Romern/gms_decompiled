package p000;

/* renamed from: bvwp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvwp extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bvwp f157977e;

    /* renamed from: f */
    private static volatile bxxk f157978f;

    /* renamed from: a */
    public int f157979a;

    /* renamed from: b */
    public int f157980b;

    /* renamed from: c */
    public int f157981c;

    /* renamed from: d */
    public boolean f157982d;

    static {
        bvwp bvwp = new bvwp();
        f157977e = bvwp;
        bxvk.m124024a(bvwp.class, bvwp);
    }

    private bvwp() {
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
            return bxvk.m124022a(f157977e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", bvwn.f157976a, "c", bvwn.f157976a, "d"});
        } else if (i2 == 3) {
            return new bvwp();
        } else {
            if (i2 == 4) {
                return new bxvd(f157977e);
            }
            if (i2 == 5) {
                return f157977e;
            }
            bxxk bxxk = f157978f;
            if (bxxk == null) {
                synchronized (bvwp.class) {
                    bxxk = f157978f;
                    if (bxxk == null) {
                        bxxk = new bxve(f157977e);
                        f157978f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
