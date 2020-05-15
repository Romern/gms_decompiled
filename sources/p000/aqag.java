package p000;

/* renamed from: aqag */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqag extends bxvk implements bxxd {

    /* renamed from: e */
    public static final aqag f85372e;

    /* renamed from: f */
    private static volatile bxxk f85373f;

    /* renamed from: a */
    public int f85374a;

    /* renamed from: b */
    public boolean f85375b;

    /* renamed from: c */
    public boolean f85376c;

    /* renamed from: d */
    public String f85377d = "";

    static {
        aqag aqag = new aqag();
        f85372e = aqag;
        bxvk.m124024a(aqag.class, aqag);
    }

    private aqag() {
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
            return bxvk.m124022a(f85372e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new aqag();
        } else {
            if (i2 == 4) {
                return new bxvd(f85372e);
            }
            if (i2 == 5) {
                return f85372e;
            }
            bxxk bxxk = f85373f;
            if (bxxk == null) {
                synchronized (aqag.class) {
                    bxxk = f85373f;
                    if (bxxk == null) {
                        bxxk = new bxve(f85372e);
                        f85373f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
