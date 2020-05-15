package p000;

/* renamed from: bmjz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmjz extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bmjz f129768d;

    /* renamed from: f */
    private static volatile bxxk f129769f;

    /* renamed from: a */
    public bmnr f129770a;

    /* renamed from: b */
    public bmnr f129771b;

    /* renamed from: c */
    public int f129772c;

    /* renamed from: e */
    private int f129773e;

    static {
        bmjz bmjz = new bmjz();
        f129768d = bmjz;
        bxvk.m124024a(bmjz.class, bmjz);
    }

    private bmjz() {
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
            return bxvk.m124022a(f129768d, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004င\u0003", new Object[]{"e", "a", "b", "c"});
        } else if (i2 == 3) {
            return new bmjz();
        } else {
            if (i2 == 4) {
                return new bxvd(f129768d);
            }
            if (i2 == 5) {
                return f129768d;
            }
            bxxk bxxk = f129769f;
            if (bxxk == null) {
                synchronized (bmjz.class) {
                    bxxk = f129769f;
                    if (bxxk == null) {
                        bxxk = new bxve(f129768d);
                        f129769f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
