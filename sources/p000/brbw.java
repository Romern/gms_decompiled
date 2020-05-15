package p000;

/* renamed from: brbw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brbw extends bxvk implements bxxd {

    /* renamed from: c */
    public static final brbw f142326c;

    /* renamed from: d */
    private static volatile bxxk f142327d;

    /* renamed from: a */
    public int f142328a;

    /* renamed from: b */
    public brbu f142329b;

    static {
        brbw brbw = new brbw();
        f142326c = brbw;
        bxvk.m124024a(brbw.class, brbw);
    }

    private brbw() {
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
            return bxvk.m124022a(f142326c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new brbw();
        } else {
            if (i2 == 4) {
                return new bxvd(f142326c);
            }
            if (i2 == 5) {
                return f142326c;
            }
            bxxk bxxk = f142327d;
            if (bxxk == null) {
                synchronized (brbw.class) {
                    bxxk = f142327d;
                    if (bxxk == null) {
                        bxxk = new bxve(f142326c);
                        f142327d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
