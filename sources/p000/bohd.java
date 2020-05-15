package p000;

/* renamed from: bohd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bohd extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bohd f133052d;

    /* renamed from: e */
    private static volatile bxxk f133053e;

    /* renamed from: a */
    public int f133054a;

    /* renamed from: b */
    public boolean f133055b;

    /* renamed from: c */
    public boolean f133056c;

    static {
        bohd bohd = new bohd();
        f133052d = bohd;
        bxvk.m124024a(bohd.class, bohd);
    }

    private bohd() {
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
            return bxvk.m124022a(f133052d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bohd();
        } else {
            if (i2 == 4) {
                return new bxvd(f133052d);
            }
            if (i2 == 5) {
                return f133052d;
            }
            bxxk bxxk = f133053e;
            if (bxxk == null) {
                synchronized (bohd.class) {
                    bxxk = f133053e;
                    if (bxxk == null) {
                        bxxk = new bxve(f133052d);
                        f133053e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
