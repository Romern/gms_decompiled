package p000;

/* renamed from: bvko */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvko extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bvko f156448b;

    /* renamed from: c */
    private static volatile bxxk f156449c;

    /* renamed from: a */
    public long f156450a;

    static {
        bvko bvko = new bvko();
        f156448b = bvko;
        bxvk.m124024a(bvko.class, bvko);
    }

    private bvko() {
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
            return bxvk.m124022a(f156448b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bvko();
        } else {
            if (i2 == 4) {
                return new bxvd(f156448b);
            }
            if (i2 == 5) {
                return f156448b;
            }
            bxxk bxxk = f156449c;
            if (bxxk == null) {
                synchronized (bvko.class) {
                    bxxk = f156449c;
                    if (bxxk == null) {
                        bxxk = new bxve(f156448b);
                        f156449c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
