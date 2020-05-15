package p000;

/* renamed from: bvgr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvgr extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bvgr f156035c;

    /* renamed from: d */
    private static volatile bxxk f156036d;

    /* renamed from: a */
    public int f156037a;

    /* renamed from: b */
    public String f156038b = "";

    static {
        bvgr bvgr = new bvgr();
        f156035c = bvgr;
        bxvk.m124024a(bvgr.class, bvgr);
    }

    private bvgr() {
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
            return bxvk.m124022a(f156035c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bvgr();
        } else {
            if (i2 == 4) {
                return new bxvd(f156035c);
            }
            if (i2 == 5) {
                return f156035c;
            }
            bxxk bxxk = f156036d;
            if (bxxk == null) {
                synchronized (bvgr.class) {
                    bxxk = f156036d;
                    if (bxxk == null) {
                        bxxk = new bxve(f156035c);
                        f156036d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
