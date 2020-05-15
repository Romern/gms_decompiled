package p000;

/* renamed from: acqm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acqm extends bxvk implements bxxd {

    /* renamed from: g */
    public static final acqm f60496g;

    /* renamed from: i */
    private static volatile bxxk f60497i;

    /* renamed from: a */
    public String f60498a = "";

    /* renamed from: b */
    public boolean f60499b;

    /* renamed from: c */
    public boolean f60500c;

    /* renamed from: d */
    public boolean f60501d;

    /* renamed from: e */
    public double f60502e;

    /* renamed from: f */
    public bxwc f60503f = bxxn.f165040b;

    /* renamed from: h */
    private int f60504h;

    static {
        acqm acqm = new acqm();
        f60496g = acqm;
        bxvk.m124024a(acqm.class, acqm);
    }

    private acqm() {
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
            return bxvk.m124022a(f60496g, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0003ဇ\u0002\u0004က\u0005\u0006ဇ\u0003\u0007\u001b\bဇ\u0004", new Object[]{"h", "a", "b", "e", "c", "f", acql.class, "d"});
        } else if (i2 == 3) {
            return new acqm();
        } else {
            if (i2 == 4) {
                return new bxvd((int[]) null, (float[]) null);
            }
            if (i2 == 5) {
                return f60496g;
            }
            bxxk bxxk = f60497i;
            if (bxxk == null) {
                synchronized (acqm.class) {
                    bxxk = f60497i;
                    if (bxxk == null) {
                        bxxk = new bxve(f60496g);
                        f60497i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
