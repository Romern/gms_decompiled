package p000;

/* renamed from: bauy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bauy extends bxvk implements bxxd {

    /* renamed from: l */
    public static final bauy f101847l;

    /* renamed from: m */
    private static volatile bxxk f101848m;

    /* renamed from: a */
    public int f101849a;

    /* renamed from: b */
    public String f101850b = "";

    /* renamed from: c */
    public String f101851c = "";

    /* renamed from: d */
    public int f101852d;

    /* renamed from: e */
    public int f101853e;

    /* renamed from: f */
    public String f101854f = "";

    /* renamed from: g */
    public bzny f101855g;

    /* renamed from: h */
    public String f101856h = "";

    /* renamed from: i */
    public int f101857i;

    /* renamed from: j */
    public bzny f101858j;

    /* renamed from: k */
    public bxwc f101859k = bxxn.f165040b;

    static {
        bauy bauy = new bauy();
        f101847l = bauy;
        bxvk.m124024a(bauy.class, bauy);
    }

    private bauy() {
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
            return bxvk.m124022a(f101847l, "\u0001\n\u0000\u0001\u0002\u0010\n\u0000\u0001\u0000\u0002ဈ\u0001\u0004င\u0002\u0005ဈ\u0004\u0007ဈ\u0000\u000bဉ\u0005\fဉ\b\r\u001b\u000eဈ\u0006\u000fဌ\u0003\u0010င\u0007", new Object[]{"a", "c", "d", "f", "b", "g", "j", "k", bavg.class, "h", "e", bauw.f101846a, "i"});
        } else if (i2 == 3) {
            return new bauy();
        } else {
            if (i2 == 4) {
                return new bxvd(f101847l);
            }
            if (i2 == 5) {
                return f101847l;
            }
            bxxk bxxk = f101848m;
            if (bxxk == null) {
                synchronized (bauy.class) {
                    bxxk = f101848m;
                    if (bxxk == null) {
                        bxxk = new bxve(f101847l);
                        f101848m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
