package p000;

/* renamed from: bpgs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpgs extends bxvk implements bxxd {

    /* renamed from: i */
    public static final bpgs f137551i;

    /* renamed from: j */
    private static volatile bxxk f137552j;

    /* renamed from: a */
    public int f137553a;

    /* renamed from: b */
    public bxwc f137554b = bxxn.f165040b;

    /* renamed from: c */
    public int f137555c;

    /* renamed from: d */
    public int f137556d;

    /* renamed from: e */
    public int f137557e;

    /* renamed from: f */
    public int f137558f;

    /* renamed from: g */
    public boolean f137559g;

    /* renamed from: h */
    public boolean f137560h;

    static {
        bpgs bpgs = new bpgs();
        f137551i = bpgs;
        bxvk.m124024a(bpgs.class, bpgs);
    }

    private bpgs() {
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
            return bxvk.m124022a(f137551i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004င\u0002\u0006င\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"a", "b", bpgt.class, "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new bpgs();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][][]) null, (int[][][]) null);
            }
            if (i2 == 5) {
                return f137551i;
            }
            bxxk bxxk = f137552j;
            if (bxxk == null) {
                synchronized (bpgs.class) {
                    bxxk = f137552j;
                    if (bxxk == null) {
                        bxxk = new bxve(f137551i);
                        f137552j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
