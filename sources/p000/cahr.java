package p000;

/* renamed from: cahr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cahr extends bxvk implements bxxd {

    /* renamed from: d */
    public static final cahr f174593d;

    /* renamed from: e */
    private static volatile bxxk f174594e;

    /* renamed from: a */
    public int f174595a;

    /* renamed from: b */
    public String f174596b = "";

    /* renamed from: c */
    public long f174597c;

    static {
        cahr cahr = new cahr();
        f174593d = cahr;
        bxvk.m124024a(cahr.class, cahr);
    }

    private cahr() {
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
            return bxvk.m124022a(f174593d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new cahr();
        } else {
            if (i2 == 4) {
                return new bxvd(f174593d);
            }
            if (i2 == 5) {
                return f174593d;
            }
            bxxk bxxk = f174594e;
            if (bxxk == null) {
                synchronized (cahr.class) {
                    bxxk = f174594e;
                    if (bxxk == null) {
                        bxxk = new bxve(f174593d);
                        f174594e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
