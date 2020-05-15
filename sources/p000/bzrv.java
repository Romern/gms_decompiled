package p000;

/* renamed from: bzrv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzrv extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bzrv f171206c;

    /* renamed from: d */
    private static volatile bxxk f171207d;

    /* renamed from: a */
    public double f171208a;

    /* renamed from: b */
    public double f171209b;

    static {
        bzrv bzrv = new bzrv();
        f171206c = bzrv;
        bxvk.m124024a(bzrv.class, bzrv);
    }

    private bzrv() {
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
            return bxvk.m124022a(f171206c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzrv();
        } else {
            if (i2 == 4) {
                return new bxvd(f171206c);
            }
            if (i2 == 5) {
                return f171206c;
            }
            bxxk bxxk = f171207d;
            if (bxxk == null) {
                synchronized (bzrv.class) {
                    bxxk = f171207d;
                    if (bxxk == null) {
                        bxxk = new bxve(f171206c);
                        f171207d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
