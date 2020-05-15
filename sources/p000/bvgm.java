package p000;

/* renamed from: bvgm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvgm extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bvgm f156012e;

    /* renamed from: f */
    private static volatile bxxk f156013f;

    /* renamed from: a */
    public int f156014a;

    /* renamed from: b */
    public String f156015b = "";

    /* renamed from: c */
    public String f156016c = "";

    /* renamed from: d */
    public bxtx f156017d = bxtx.f164797b;

    static {
        bvgm bvgm = new bvgm();
        f156012e = bvgm;
        bxvk.m124024a(bvgm.class, bvgm);
    }

    private bvgm() {
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
            return bxvk.m124022a(f156012e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ည\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bvgm();
        } else {
            if (i2 == 4) {
                return new bxvd(f156012e);
            }
            if (i2 == 5) {
                return f156012e;
            }
            bxxk bxxk = f156013f;
            if (bxxk == null) {
                synchronized (bvgm.class) {
                    bxxk = f156013f;
                    if (bxxk == null) {
                        bxxk = new bxve(f156012e);
                        f156013f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
