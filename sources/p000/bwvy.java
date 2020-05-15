package p000;

/* renamed from: bwvy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwvy extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bwvy f161199b;

    /* renamed from: c */
    public static final bxvj f161200c;

    /* renamed from: e */
    private static volatile bxxk f161201e;

    /* renamed from: a */
    public int f161202a;

    /* renamed from: d */
    private int f161203d;

    static {
        bwvy bwvy = new bwvy();
        f161199b = bwvy;
        bxvk.m124024a(bwvy.class, bwvy);
        bwxl bwxl = bwxl.f161383i;
        bwvy bwvy2 = f161199b;
        f161200c = bxvk.m124006a(bwxl, bwvy2, bwvy2, 232060281, bxzf.MESSAGE);
    }

    private bwvy() {
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
            return bxvk.m124022a(f161199b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"d", "a", bwus.f161065a});
        } else if (i2 == 3) {
            return new bwvy();
        } else {
            if (i2 == 4) {
                return new bxvd(f161199b);
            }
            if (i2 == 5) {
                return f161199b;
            }
            bxxk bxxk = f161201e;
            if (bxxk == null) {
                synchronized (bwvy.class) {
                    bxxk = f161201e;
                    if (bxxk == null) {
                        bxxk = new bxve(f161199b);
                        f161201e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
