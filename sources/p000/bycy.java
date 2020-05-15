package p000;

/* renamed from: bycy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bycy extends bxvk implements bxxd {

    /* renamed from: j */
    public static final bycy f165733j;

    /* renamed from: k */
    private static volatile bxxk f165734k;

    /* renamed from: a */
    public int f165735a;

    /* renamed from: b */
    public int f165736b;

    /* renamed from: c */
    public int f165737c;

    /* renamed from: d */
    public int f165738d;

    /* renamed from: e */
    public int f165739e;

    /* renamed from: f */
    public int f165740f;

    /* renamed from: g */
    public int f165741g;

    /* renamed from: h */
    public int f165742h;

    /* renamed from: i */
    public bxwc f165743i = bxxn.f165040b;

    static {
        bycy bycy = new bycy();
        f165733j = bycy;
        bxvk.m124024a(bycy.class, bycy);
    }

    private bycy() {
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
            return bxvk.m124022a(f165733j, "\u0001\b\u0000\u0001\u0002\t\b\u0000\u0001\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\t\u001b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", bycv.class});
        } else if (i2 == 3) {
            return new bycy();
        } else {
            if (i2 == 4) {
                return new bycx();
            }
            if (i2 == 5) {
                return f165733j;
            }
            bxxk bxxk = f165734k;
            if (bxxk == null) {
                synchronized (bycy.class) {
                    bxxk = f165734k;
                    if (bxxk == null) {
                        bxxk = new bxve(f165733j);
                        f165734k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
