package p000;

/* renamed from: bzlx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzlx extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bzlx f170580h;

    /* renamed from: i */
    private static volatile bxxk f170581i;

    /* renamed from: a */
    public int f170582a;

    /* renamed from: b */
    public bzly f170583b;

    /* renamed from: c */
    public String f170584c = "";

    /* renamed from: d */
    public String f170585d = "";

    /* renamed from: e */
    public String f170586e = "";

    /* renamed from: f */
    public bxwc f170587f = bxxn.f165040b;

    /* renamed from: g */
    public int f170588g = 1;

    static {
        bzlx bzlx = new bzlx();
        f170580h = bzlx;
        bxvk.m124024a(bzlx.class, bzlx);
    }

    private bzlx() {
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
            return bxvk.m124022a(f170580h, "\u0001\u0006\u0000\u0001\u0002\b\u0006\u0000\u0001\u0000\u0002\u001b\u0004ဉ\u0000\u0005ဈ\u0001\u0006ဈ\u0002\u0007ဈ\u0003\bဌ\u0004", new Object[]{"a", "f", bzll.class, "b", "c", "d", "e", "g", bzlv.f170579a});
        } else if (i2 == 3) {
            return new bzlx();
        } else {
            if (i2 == 4) {
                return new bxvd(f170580h);
            }
            if (i2 == 5) {
                return f170580h;
            }
            bxxk bxxk = f170581i;
            if (bxxk == null) {
                synchronized (bzlx.class) {
                    bxxk = f170581i;
                    if (bxxk == null) {
                        bxxk = new bxve(f170580h);
                        f170581i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
