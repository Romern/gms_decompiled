package p000;

/* renamed from: caju */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caju extends bxvk implements bxxd {

    /* renamed from: e */
    public static final caju f174872e;

    /* renamed from: f */
    private static volatile bxxk f174873f;

    /* renamed from: a */
    public int f174874a;

    /* renamed from: b */
    public boolean f174875b;

    /* renamed from: c */
    public boolean f174876c;

    /* renamed from: d */
    public boolean f174877d;

    static {
        caju caju = new caju();
        f174872e = caju;
        bxvk.m124024a(caju.class, caju);
    }

    private caju() {
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
            return bxvk.m124022a(f174872e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new caju();
        } else {
            if (i2 == 4) {
                return new bxvd(f174872e);
            }
            if (i2 == 5) {
                return f174872e;
            }
            bxxk bxxk = f174873f;
            if (bxxk == null) {
                synchronized (caju.class) {
                    bxxk = f174873f;
                    if (bxxk == null) {
                        bxxk = new bxve(f174872e);
                        f174873f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
