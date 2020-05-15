package p000;

/* renamed from: bvvv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvvv extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bvvv f157855f;

    /* renamed from: g */
    private static volatile bxxk f157856g;

    /* renamed from: a */
    public int f157857a;

    /* renamed from: b */
    public int f157858b;

    /* renamed from: c */
    public int f157859c;

    /* renamed from: d */
    public int f157860d;

    /* renamed from: e */
    public int f157861e;

    static {
        bvvv bvvv = new bvvv();
        f157855f = bvvv;
        bxvk.m124024a(bvvv.class, bvvv);
    }

    private bvvv() {
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
            return bxvk.m124022a(f157855f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ဌ\u0003", new Object[]{"a", "b", "c", "d", "e", bvvu.f157854a});
        } else if (i2 == 3) {
            return new bvvv();
        } else {
            if (i2 == 4) {
                return new bxvd(f157855f);
            }
            if (i2 == 5) {
                return f157855f;
            }
            bxxk bxxk = f157856g;
            if (bxxk == null) {
                synchronized (bvvv.class) {
                    bxxk = f157856g;
                    if (bxxk == null) {
                        bxxk = new bxve(f157855f);
                        f157856g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
