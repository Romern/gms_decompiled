package p000;

/* renamed from: bvgi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvgi extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bvgi f156000e;

    /* renamed from: f */
    private static volatile bxxk f156001f;

    /* renamed from: a */
    public int f156002a;

    /* renamed from: b */
    public int f156003b;

    /* renamed from: c */
    public bvgf f156004c;

    /* renamed from: d */
    public bvge f156005d;

    static {
        bvgi bvgi = new bvgi();
        f156000e = bvgi;
        bxvk.m124024a(bvgi.class, bvgi);
    }

    private bvgi() {
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
            return bxvk.m124022a(f156000e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", bvgg.f155999a, "c", "d"});
        } else if (i2 == 3) {
            return new bvgi();
        } else {
            if (i2 == 4) {
                return new bxvd(f156000e);
            }
            if (i2 == 5) {
                return f156000e;
            }
            bxxk bxxk = f156001f;
            if (bxxk == null) {
                synchronized (bvgi.class) {
                    bxxk = f156001f;
                    if (bxxk == null) {
                        bxxk = new bxve(f156000e);
                        f156001f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
