package p000;

/* renamed from: bzwt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzwt extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bzwt f171675d;

    /* renamed from: e */
    private static volatile bxxk f171676e;

    /* renamed from: a */
    public int f171677a;

    /* renamed from: b */
    public bsae f171678b;

    /* renamed from: c */
    public bzwv f171679c;

    static {
        bzwt bzwt = new bzwt();
        f171675d = bzwt;
        bxvk.m124024a(bzwt.class, bzwt);
    }

    private bzwt() {
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
            return bxvk.m124022a(f171675d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bzwt();
        } else {
            if (i2 == 4) {
                return new bxvd(f171675d);
            }
            if (i2 == 5) {
                return f171675d;
            }
            bxxk bxxk = f171676e;
            if (bxxk == null) {
                synchronized (bzwt.class) {
                    bxxk = f171676e;
                    if (bxxk == null) {
                        bxxk = new bxve(f171675d);
                        f171676e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
