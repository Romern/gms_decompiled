package p000;

/* renamed from: sgm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sgm extends bxvk implements bxxd {

    /* renamed from: e */
    public static final sgm f44420e;

    /* renamed from: f */
    private static volatile bxxk f44421f;

    /* renamed from: a */
    public int f44422a;

    /* renamed from: b */
    public String f44423b = "";

    /* renamed from: c */
    public String f44424c = "";

    /* renamed from: d */
    public long f44425d;

    static {
        sgm sgm = new sgm();
        f44420e = sgm;
        bxvk.m124024a(sgm.class, sgm);
    }

    private sgm() {
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
            return bxvk.m124022a(f44420e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new sgm();
        } else {
            if (i2 == 4) {
                return new bxvd(f44420e);
            }
            if (i2 == 5) {
                return f44420e;
            }
            bxxk bxxk = f44421f;
            if (bxxk == null) {
                synchronized (sgm.class) {
                    bxxk = f44421f;
                    if (bxxk == null) {
                        bxxk = new bxve(f44420e);
                        f44421f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
