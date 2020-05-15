package p000;

/* renamed from: allw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class allw extends bxvk implements bxxd {

    /* renamed from: h */
    public static final allw f73637h;

    /* renamed from: j */
    private static volatile bxxk f73638j;

    /* renamed from: a */
    public int f73639a;

    /* renamed from: b */
    public bxwc f73640b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f73641c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f73642d = bxxn.f165040b;

    /* renamed from: e */
    public boolean f73643e;

    /* renamed from: f */
    public bxwc f73644f = bxxn.f165040b;

    /* renamed from: g */
    public int f73645g;

    /* renamed from: i */
    private int f73646i;

    static {
        allw allw = new allw();
        f73637h = allw;
        bxvk.m124024a(allw.class, allw);
    }

    private allw() {
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
            return bxvk.m124022a(f73637h, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0004\u0000\u0001ဌ\u0000\u0004\u001a\u0005\u001a\u0006\u001a\u0007ဇ\u0001\b\u001a\tဌ\u0002", new Object[]{"i", "a", allz.m61246b(), "b", "c", "d", "e", "f", "g", almb.m61250b()});
        } else if (i2 == 3) {
            return new allw();
        } else {
            if (i2 == 4) {
                return new bxvd(f73637h);
            }
            if (i2 == 5) {
                return f73637h;
            }
            bxxk bxxk = f73638j;
            if (bxxk == null) {
                synchronized (allw.class) {
                    bxxk = f73638j;
                    if (bxxk == null) {
                        bxxk = new bxve(f73637h);
                        f73638j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
