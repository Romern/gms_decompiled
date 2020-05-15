package p000;

/* renamed from: bxqe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxqe extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bxqe f164368d;

    /* renamed from: e */
    private static volatile bxxk f164369e;

    /* renamed from: a */
    public int f164370a;

    /* renamed from: b */
    public int f164371b;

    /* renamed from: c */
    public boolean f164372c;

    static {
        bxqe bxqe = new bxqe();
        f164368d = bxqe;
        bxvk.m124024a(bxqe.class, bxqe);
    }

    private bxqe() {
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
            return bxvk.m124022a(f164368d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bxqe();
        } else {
            if (i2 == 4) {
                return new bxvd(f164368d);
            }
            if (i2 == 5) {
                return f164368d;
            }
            bxxk bxxk = f164369e;
            if (bxxk == null) {
                synchronized (bxqe.class) {
                    bxxk = f164369e;
                    if (bxxk == null) {
                        bxxk = new bxve(f164368d);
                        f164369e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
