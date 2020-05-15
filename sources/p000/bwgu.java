package p000;

/* renamed from: bwgu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwgu extends bxvk implements bxxd {

    /* renamed from: i */
    public static final bwgu f159265i;

    /* renamed from: j */
    private static volatile bxxk f159266j;

    /* renamed from: a */
    public int f159267a;

    /* renamed from: b */
    public String f159268b = "";

    /* renamed from: c */
    public int f159269c = -1;

    /* renamed from: d */
    public bxwc f159270d = bxxn.f165040b;

    /* renamed from: e */
    public bxwc f159271e = bxxn.f165040b;

    /* renamed from: f */
    public bxwc f159272f = bxxn.f165040b;

    /* renamed from: g */
    public int f159273g;

    /* renamed from: h */
    public boolean f159274h;

    static {
        bwgu bwgu = new bwgu();
        f159265i = bwgu;
        bxvk.m124024a(bwgu.class, bwgu);
    }

    private bwgu() {
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
            return bxvk.m124022a(f159265i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001\u001b\u0002\u001a\u0003\u001a\u0004င\u0002\u0005ဈ\u0000\u0006င\u0001\u0007ဇ\u0003", new Object[]{"a", "d", bwgt.class, "e", "f", "g", "b", "c", "h"});
        } else if (i2 == 3) {
            return new bwgu();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][][]) null, (int[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f159265i;
            }
            bxxk bxxk = f159266j;
            if (bxxk == null) {
                synchronized (bwgu.class) {
                    bxxk = f159266j;
                    if (bxxk == null) {
                        bxxk = new bxve(f159265i);
                        f159266j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
