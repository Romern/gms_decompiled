package p000;

/* renamed from: boma */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boma extends bxvk implements bxxd {

    /* renamed from: b */
    public static final boma f133613b;

    /* renamed from: c */
    private static volatile bxxk f133614c;

    /* renamed from: a */
    public int f133615a;

    static {
        boma boma = new boma();
        f133613b = boma;
        bxvk.m124024a(boma.class, boma);
    }

    private boma() {
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
            return bxvk.m124022a(f133613b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"a"});
        } else if (i2 == 3) {
            return new boma();
        } else {
            if (i2 == 4) {
                return new bxvd(f133613b);
            }
            if (i2 == 5) {
                return f133613b;
            }
            bxxk bxxk = f133614c;
            if (bxxk == null) {
                synchronized (boma.class) {
                    bxxk = f133614c;
                    if (bxxk == null) {
                        bxxk = new bxve(f133613b);
                        f133614c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
