package p000;

/* renamed from: bpdd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpdd extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bpdd f135910e;

    /* renamed from: f */
    private static volatile bxxk f135911f;

    /* renamed from: a */
    public int f135912a;

    /* renamed from: b */
    public int f135913b;

    /* renamed from: c */
    public bxvt f135914c = bxvm.f164965b;

    /* renamed from: d */
    public int f135915d;

    static {
        bpdd bpdd = new bpdd();
        f135910e = bpdd;
        bxvk.m124024a(bpdd.class, bpdd);
    }

    private bpdd() {
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
            return bxvk.m124022a(f135910e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001င\u0000\u0002\u0016\u0004င\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bpdd();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][][]) null, (byte[][]) null);
            }
            if (i2 == 5) {
                return f135910e;
            }
            bxxk bxxk = f135911f;
            if (bxxk == null) {
                synchronized (bpdd.class) {
                    bxxk = f135911f;
                    if (bxxk == null) {
                        bxxk = new bxve(f135910e);
                        f135911f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
