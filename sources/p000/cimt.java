package p000;

/* renamed from: cimt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cimt extends bxvk implements bxxd {

    /* renamed from: e */
    public static final cimt f190782e;

    /* renamed from: f */
    private static volatile bxxk f190783f;

    /* renamed from: a */
    public int f190784a;

    /* renamed from: b */
    public int f190785b;

    /* renamed from: c */
    public long f190786c;

    /* renamed from: d */
    public cimn f190787d;

    static {
        cimt cimt = new cimt();
        f190782e = cimt;
        bxvk.m124024a(cimt.class, cimt);
    }

    private cimt() {
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
            return bxvk.m124022a(f190782e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new cimt();
        } else {
            if (i2 == 4) {
                return new bxvd(f190782e);
            }
            if (i2 == 5) {
                return f190782e;
            }
            bxxk bxxk = f190783f;
            if (bxxk == null) {
                synchronized (cimt.class) {
                    bxxk = f190783f;
                    if (bxxk == null) {
                        bxxk = new bxve(f190782e);
                        f190783f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
