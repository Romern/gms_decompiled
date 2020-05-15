package p000;

/* renamed from: bvma */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvma extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bvma f156625d;

    /* renamed from: e */
    private static volatile bxxk f156626e;

    /* renamed from: a */
    public int f156627a;

    /* renamed from: b */
    public bvov f156628b;

    /* renamed from: c */
    public bxvt f156629c = bxvm.f164965b;

    static {
        bvma bvma = new bvma();
        f156625d = bvma;
        bxvk.m124024a(bvma.class, bvma);
    }

    private bvma() {
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
            return bxvk.m124022a(f156625d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001e", new Object[]{"a", "b", "c", bvkz.m121222b()});
        } else if (i2 == 3) {
            return new bvma();
        } else {
            if (i2 == 4) {
                return new bvlz();
            }
            if (i2 == 5) {
                return f156625d;
            }
            bxxk bxxk = f156626e;
            if (bxxk == null) {
                synchronized (bvma.class) {
                    bxxk = f156626e;
                    if (bxxk == null) {
                        bxxk = new bxve(f156625d);
                        f156626e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
