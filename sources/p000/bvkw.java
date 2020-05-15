package p000;

/* renamed from: bvkw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvkw extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bvkw f156480d;

    /* renamed from: e */
    private static volatile bxxk f156481e;

    /* renamed from: a */
    public int f156482a;

    /* renamed from: b */
    public bvow f156483b;

    /* renamed from: c */
    public bvmv f156484c;

    static {
        bvkw bvkw = new bvkw();
        f156480d = bvkw;
        bxvk.m124024a(bvkw.class, bvkw);
    }

    private bvkw() {
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
            return bxvk.m124022a(f156480d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bvkw();
        } else {
            if (i2 == 4) {
                return new bxvd(f156480d);
            }
            if (i2 == 5) {
                return f156480d;
            }
            bxxk bxxk = f156481e;
            if (bxxk == null) {
                synchronized (bvkw.class) {
                    bxxk = f156481e;
                    if (bxxk == null) {
                        bxxk = new bxve(f156480d);
                        f156481e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
