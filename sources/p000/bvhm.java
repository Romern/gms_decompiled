package p000;

/* renamed from: bvhm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvhm extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bvhm f156093f;

    /* renamed from: g */
    private static volatile bxxk f156094g;

    /* renamed from: a */
    public int f156095a;

    /* renamed from: b */
    public long f156096b;

    /* renamed from: c */
    public int f156097c;

    /* renamed from: d */
    public bxwc f156098d = bxxn.f165040b;

    /* renamed from: e */
    public bxtx f156099e = bxtx.f164797b;

    static {
        bvhm bvhm = new bvhm();
        f156093f = bvhm;
        bxvk.m124024a(bvhm.class, bvhm);
    }

    private bvhm() {
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
            return bxvk.m124022a(f156093f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဂ\u0000\u0002င\u0001\u0003\u001b\u0004ည\u0002", new Object[]{"a", "b", "c", "d", bvhj.class, "e"});
        } else if (i2 == 3) {
            return new bvhm();
        } else {
            if (i2 == 4) {
                return new bxvd((float[]) null, (int[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f156093f;
            }
            bxxk bxxk = f156094g;
            if (bxxk == null) {
                synchronized (bvhm.class) {
                    bxxk = f156094g;
                    if (bxxk == null) {
                        bxxk = new bxve(f156093f);
                        f156094g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
