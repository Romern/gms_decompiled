package p000;

/* renamed from: acqt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acqt extends bxvk implements bxxd {

    /* renamed from: e */
    public static final acqt f60536e;

    /* renamed from: g */
    private static volatile bxxk f60537g;

    /* renamed from: a */
    public String f60538a = "";

    /* renamed from: b */
    public String f60539b = "";

    /* renamed from: c */
    public long f60540c;

    /* renamed from: d */
    public long f60541d;

    /* renamed from: f */
    private int f60542f;

    static {
        acqt acqt = new acqt();
        f60536e = acqt;
        bxvk.m124024a(acqt.class, acqt);
    }

    private acqt() {
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
            return bxvk.m124022a(f60536e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"f", "a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new acqt();
        } else {
            if (i2 == 4) {
                return new bxvd(f60536e);
            }
            if (i2 == 5) {
                return f60536e;
            }
            bxxk bxxk = f60537g;
            if (bxxk == null) {
                synchronized (acqt.class) {
                    bxxk = f60537g;
                    if (bxxk == null) {
                        bxxk = new bxve(f60536e);
                        f60537g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
