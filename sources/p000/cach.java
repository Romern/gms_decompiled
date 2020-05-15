package p000;

/* renamed from: cach */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cach extends bxvk implements bxxd {

    /* renamed from: e */
    public static final cach f172548e;

    /* renamed from: f */
    private static volatile bxxk f172549f;

    /* renamed from: a */
    public int f172550a;

    /* renamed from: b */
    public String f172551b = "";

    /* renamed from: c */
    public cabk f172552c;

    /* renamed from: d */
    public cacu f172553d;

    static {
        cach cach = new cach();
        f172548e = cach;
        bxvk.m124024a(cach.class, cach);
    }

    private cach() {
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
            return bxvk.m124022a(f172548e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new cach();
        } else {
            if (i2 == 4) {
                return new bxvd(f172548e);
            }
            if (i2 == 5) {
                return f172548e;
            }
            bxxk bxxk = f172549f;
            if (bxxk == null) {
                synchronized (cach.class) {
                    bxxk = f172549f;
                    if (bxxk == null) {
                        bxxk = new bxve(f172548e);
                        f172549f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
