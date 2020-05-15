package p000;

/* renamed from: bltj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bltj extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bltj f127708c;

    /* renamed from: d */
    private static volatile bxxk f127709d;

    /* renamed from: a */
    public int f127710a;

    /* renamed from: b */
    public bltk f127711b;

    static {
        bltj bltj = new bltj();
        f127708c = bltj;
        bxvk.m124024a(bltj.class, bltj);
    }

    private bltj() {
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
            return bxvk.m124022a(f127708c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bltj();
        } else {
            if (i2 == 4) {
                return new bxvd(f127708c);
            }
            if (i2 == 5) {
                return f127708c;
            }
            bxxk bxxk = f127709d;
            if (bxxk == null) {
                synchronized (bltj.class) {
                    bxxk = f127709d;
                    if (bxxk == null) {
                        bxxk = new bxve(f127708c);
                        f127709d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
