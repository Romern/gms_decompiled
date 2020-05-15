package p000;

/* renamed from: bosw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bosw extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bosw f134737c;

    /* renamed from: d */
    private static volatile bxxk f134738d;

    /* renamed from: a */
    public int f134739a;

    /* renamed from: b */
    public int f134740b;

    static {
        bosw bosw = new bosw();
        f134737c = bosw;
        bxvk.m124024a(bosw.class, bosw);
    }

    private bosw() {
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
            return bxvk.m124022a(f134737c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bosw();
        } else {
            if (i2 == 4) {
                return new bxvd(f134737c);
            }
            if (i2 == 5) {
                return f134737c;
            }
            bxxk bxxk = f134738d;
            if (bxxk == null) {
                synchronized (bosw.class) {
                    bxxk = f134738d;
                    if (bxxk == null) {
                        bxxk = new bxve(f134737c);
                        f134738d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
