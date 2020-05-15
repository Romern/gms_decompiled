package p000;

/* renamed from: bycz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bycz extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bycz f165744e;

    /* renamed from: f */
    private static volatile bxxk f165745f;

    /* renamed from: a */
    public int f165746a;

    /* renamed from: b */
    public bxtx f165747b = bxtx.f164797b;

    /* renamed from: c */
    public long f165748c;

    /* renamed from: d */
    public long f165749d;

    static {
        bycz bycz = new bycz();
        f165744e = bycz;
        bxvk.m124024a(bycz.class, bycz);
    }

    private bycz() {
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
            return bxvk.m124022a(f165744e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bycz();
        } else {
            if (i2 == 4) {
                return new bxvd(f165744e);
            }
            if (i2 == 5) {
                return f165744e;
            }
            bxxk bxxk = f165745f;
            if (bxxk == null) {
                synchronized (bycz.class) {
                    bxxk = f165745f;
                    if (bxxk == null) {
                        bxxk = new bxve(f165744e);
                        f165745f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
