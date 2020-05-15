package p000;

/* renamed from: cimn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cimn extends bxvk implements bxxd {

    /* renamed from: d */
    public static final cimn f190753d;

    /* renamed from: e */
    private static volatile bxxk f190754e;

    /* renamed from: a */
    public int f190755a;

    /* renamed from: b */
    public long f190756b;

    /* renamed from: c */
    public String f190757c = "";

    static {
        cimn cimn = new cimn();
        f190753d = cimn;
        bxvk.m124024a(cimn.class, cimn);
    }

    private cimn() {
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
            return bxvk.m124022a(f190753d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001စ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new cimn();
        } else {
            if (i2 == 4) {
                return new bxvd(f190753d);
            }
            if (i2 == 5) {
                return f190753d;
            }
            bxxk bxxk = f190754e;
            if (bxxk == null) {
                synchronized (cimn.class) {
                    bxxk = f190754e;
                    if (bxxk == null) {
                        bxxk = new bxve(f190753d);
                        f190754e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
