package p000;

/* renamed from: bxkj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxkj extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bxkj f163754d;

    /* renamed from: e */
    private static volatile bxxk f163755e;

    /* renamed from: a */
    public int f163756a;

    /* renamed from: b */
    public int f163757b;

    /* renamed from: c */
    public int f163758c;

    static {
        bxkj bxkj = new bxkj();
        f163754d = bxkj;
        bxvk.m124024a(bxkj.class, bxkj);
    }

    private bxkj() {
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
            return bxvk.m124022a(f163754d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"a", "b", bxki.m122802b(), "c"});
        } else if (i2 == 3) {
            return new bxkj();
        } else {
            if (i2 == 4) {
                return new bxvd(f163754d);
            }
            if (i2 == 5) {
                return f163754d;
            }
            bxxk bxxk = f163755e;
            if (bxxk == null) {
                synchronized (bxkj.class) {
                    bxxk = f163755e;
                    if (bxxk == null) {
                        bxxk = new bxve(f163754d);
                        f163755e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
