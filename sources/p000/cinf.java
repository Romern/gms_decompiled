package p000;

/* renamed from: cinf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cinf extends bxvk implements bxxd {

    /* renamed from: d */
    public static final cinf f190928d;

    /* renamed from: e */
    private static volatile bxxk f190929e;

    /* renamed from: a */
    public int f190930a;

    /* renamed from: b */
    public int f190931b;

    /* renamed from: c */
    public int f190932c;

    static {
        cinf cinf = new cinf();
        f190928d = cinf;
        bxvk.m124024a(cinf.class, cinf);
    }

    private cinf() {
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
            return bxvk.m124022a(f190928d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new cinf();
        } else {
            if (i2 == 4) {
                return new bxvd(f190928d);
            }
            if (i2 == 5) {
                return f190928d;
            }
            bxxk bxxk = f190929e;
            if (bxxk == null) {
                synchronized (cinf.class) {
                    bxxk = f190929e;
                    if (bxxk == null) {
                        bxxk = new bxve(f190928d);
                        f190929e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
