package p000;

/* renamed from: bqkm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqkm extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bqkm f141006h;

    /* renamed from: i */
    private static volatile bxxk f141007i;

    /* renamed from: a */
    public int f141008a;

    /* renamed from: b */
    public String f141009b = "";

    /* renamed from: c */
    public int f141010c;

    /* renamed from: d */
    public int f141011d;

    /* renamed from: e */
    public int f141012e;

    /* renamed from: f */
    public int f141013f;

    /* renamed from: g */
    public bqkl f141014g;

    static {
        bqkm bqkm = new bqkm();
        f141006h = bqkm;
        bxvk.m124024a(bqkm.class, bqkm);
    }

    private bqkm() {
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
            return bxvk.m124022a(f141006h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0006င\u0005\u0007ဉ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bqkm();
        } else {
            if (i2 == 4) {
                return new bxvd(f141006h);
            }
            if (i2 == 5) {
                return f141006h;
            }
            bxxk bxxk = f141007i;
            if (bxxk == null) {
                synchronized (bqkm.class) {
                    bxxk = f141007i;
                    if (bxxk == null) {
                        bxxk = new bxve(f141006h);
                        f141007i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
