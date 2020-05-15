package p000;

/* renamed from: bspy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bspy extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bspy f146601f;

    /* renamed from: g */
    private static volatile bxxk f146602g;

    /* renamed from: a */
    public int f146603a;

    /* renamed from: b */
    public int f146604b;

    /* renamed from: c */
    public int f146605c;

    /* renamed from: d */
    public bsqe f146606d;

    /* renamed from: e */
    public bxwc f146607e = bxxn.f165040b;

    static {
        bspy bspy = new bspy();
        f146601f = bspy;
        bxvk.m124024a(bspy.class, bspy);
    }

    private bspy() {
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
            return bxvk.m124022a(f146601f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0003ဌ\u0001\u0004ဉ\u0002\u0005\u001b", new Object[]{"a", "b", bspw.f146595a, "c", bspv.f146594a, "d", "e", bspx.class});
        } else if (i2 == 3) {
            return new bspy();
        } else {
            if (i2 == 4) {
                return new bxvd((int[]) null, (boolean[][]) null);
            }
            if (i2 == 5) {
                return f146601f;
            }
            bxxk bxxk = f146602g;
            if (bxxk == null) {
                synchronized (bspy.class) {
                    bxxk = f146602g;
                    if (bxxk == null) {
                        bxxk = new bxve(f146601f);
                        f146602g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
