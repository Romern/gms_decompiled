package p000;

/* renamed from: aclj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aclj extends bxvk implements bxxd {

    /* renamed from: e */
    public static final aclj f60087e;

    /* renamed from: f */
    private static volatile bxxk f60088f;

    /* renamed from: a */
    public int f60089a;

    /* renamed from: b */
    public int f60090b;

    /* renamed from: c */
    public String f60091c = "";

    /* renamed from: d */
    public long f60092d;

    static {
        aclj aclj = new aclj();
        f60087e = aclj;
        bxvk.m124024a(aclj.class, aclj);
    }

    private aclj() {
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
            return bxvk.m124022a(f60087e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", aclh.f60086a, "c", "d"});
        } else if (i2 == 3) {
            return new aclj();
        } else {
            if (i2 == 4) {
                return new bxvd(f60087e);
            }
            if (i2 == 5) {
                return f60087e;
            }
            bxxk bxxk = f60088f;
            if (bxxk == null) {
                synchronized (aclj.class) {
                    bxxk = f60088f;
                    if (bxxk == null) {
                        bxxk = new bxve(f60087e);
                        f60088f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
