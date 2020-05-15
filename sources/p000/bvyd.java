package p000;

/* renamed from: bvyd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvyd extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bvyd f158138d;

    /* renamed from: e */
    private static volatile bxxk f158139e;

    /* renamed from: a */
    public int f158140a;

    /* renamed from: b */
    public int f158141b;

    /* renamed from: c */
    public bvwb f158142c;

    static {
        bvyd bvyd = new bvyd();
        f158138d = bvyd;
        bxvk.m124024a(bvyd.class, bvyd);
    }

    private bvyd() {
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
            return bxvk.m124022a(f158138d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001င\u0000\u0003ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bvyd();
        } else {
            if (i2 == 4) {
                return new bxvd(f158138d);
            }
            if (i2 == 5) {
                return f158138d;
            }
            bxxk bxxk = f158139e;
            if (bxxk == null) {
                synchronized (bvyd.class) {
                    bxxk = f158139e;
                    if (bxxk == null) {
                        bxxk = new bxve(f158138d);
                        f158139e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
