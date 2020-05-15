package p000;

/* renamed from: bldv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bldv extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bldv f126138e;

    /* renamed from: f */
    private static volatile bxxk f126139f;

    /* renamed from: a */
    public int f126140a;

    /* renamed from: b */
    public bleu f126141b;

    /* renamed from: c */
    public long f126142c;

    /* renamed from: d */
    public String f126143d = "";

    static {
        bldv bldv = new bldv();
        f126138e = bldv;
        bxvk.m124024a(bldv.class, bldv);
    }

    private bldv() {
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
            return bxvk.m124022a(f126138e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဈ\u0003", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bldv();
        } else {
            if (i2 == 4) {
                return new bxvd(f126138e);
            }
            if (i2 == 5) {
                return f126138e;
            }
            bxxk bxxk = f126139f;
            if (bxxk == null) {
                synchronized (bldv.class) {
                    bxxk = f126139f;
                    if (bxxk == null) {
                        bxxk = new bxve(f126138e);
                        f126139f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
