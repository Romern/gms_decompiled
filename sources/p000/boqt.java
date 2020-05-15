package p000;

/* renamed from: boqt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boqt extends bxvk implements bxxd {

    /* renamed from: j */
    public static final boqt f134318j;

    /* renamed from: k */
    private static volatile bxxk f134319k;

    /* renamed from: a */
    public int f134320a;

    /* renamed from: b */
    public String f134321b = "";

    /* renamed from: c */
    public int f134322c = -1;

    /* renamed from: d */
    public boolean f134323d;

    /* renamed from: e */
    public boolean f134324e;

    /* renamed from: f */
    public int f134325f;

    /* renamed from: g */
    public String f134326g = "";

    /* renamed from: h */
    public int f134327h;

    /* renamed from: i */
    public boqs f134328i;

    static {
        boqt boqt = new boqt();
        f134318j = boqt;
        bxvk.m124024a(boqt.class, boqt);
    }

    private boqt() {
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
            return bxvk.m124022a(f134318j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဌ\u0004\u0006ဈ\u0005\u0007ဌ\u0006\tဉ\b", new Object[]{"a", "b", "c", cagl.m126607b(), "d", "e", "f", cagz.m126623b(), "g", "h", caiq.f174759a, "i"});
        } else if (i2 == 3) {
            return new boqt();
        } else {
            if (i2 == 4) {
                return new bxvd(f134318j);
            }
            if (i2 == 5) {
                return f134318j;
            }
            bxxk bxxk = f134319k;
            if (bxxk == null) {
                synchronized (boqt.class) {
                    bxxk = f134319k;
                    if (bxxk == null) {
                        bxxk = new bxve(f134318j);
                        f134319k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
