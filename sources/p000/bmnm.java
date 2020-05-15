package p000;

/* renamed from: bmnm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmnm extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bmnm f130127d;

    /* renamed from: e */
    private static volatile bxxk f130128e;

    /* renamed from: a */
    public int f130129a;

    /* renamed from: b */
    public String f130130b = "";

    /* renamed from: c */
    public String f130131c = "";

    static {
        bmnm bmnm = new bmnm();
        f130127d = bmnm;
        bxvk.m124024a(bmnm.class, bmnm);
    }

    private bmnm() {
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
            return bxvk.m124022a(f130127d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bmnm();
        } else {
            if (i2 == 4) {
                return new bxvd(f130127d);
            }
            if (i2 == 5) {
                return f130127d;
            }
            bxxk bxxk = f130128e;
            if (bxxk == null) {
                synchronized (bmnm.class) {
                    bxxk = f130128e;
                    if (bxxk == null) {
                        bxxk = new bxve(f130127d);
                        f130128e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
