package p000;

/* renamed from: acqp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acqp extends bxvk implements bxxd {

    /* renamed from: e */
    public static final acqp f60515e;

    /* renamed from: f */
    private static volatile bxxk f60516f;

    /* renamed from: a */
    public int f60517a;

    /* renamed from: b */
    public String f60518b = "";

    /* renamed from: c */
    public int f60519c;

    /* renamed from: d */
    public String f60520d = "";

    static {
        acqp acqp = new acqp();
        f60515e = acqp;
        bxvk.m124024a(acqp.class, acqp);
    }

    private acqp() {
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
            return bxvk.m124022a(f60515e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new acqp();
        } else {
            if (i2 == 4) {
                return new bxvd(f60515e);
            }
            if (i2 == 5) {
                return f60515e;
            }
            bxxk bxxk = f60516f;
            if (bxxk == null) {
                synchronized (acqp.class) {
                    bxxk = f60516f;
                    if (bxxk == null) {
                        bxxk = new bxve(f60515e);
                        f60516f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
