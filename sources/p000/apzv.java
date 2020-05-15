package p000;

/* renamed from: apzv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apzv extends bxvk implements bxxd {

    /* renamed from: n */
    public static final apzv f85303n;

    /* renamed from: o */
    private static volatile bxxk f85304o;

    /* renamed from: a */
    public int f85305a;

    /* renamed from: b */
    public String f85306b = "";

    /* renamed from: c */
    public String f85307c = "";

    /* renamed from: d */
    public int f85308d;

    /* renamed from: e */
    public int f85309e;

    /* renamed from: f */
    public String f85310f = "";

    /* renamed from: g */
    public bxwc f85311g = bxxn.f165040b;

    /* renamed from: h */
    public String f85312h = "";

    /* renamed from: i */
    public String f85313i = "";

    /* renamed from: j */
    public String f85314j = "";

    /* renamed from: k */
    public bxwc f85315k = bxxn.f165040b;

    /* renamed from: l */
    public aqab f85316l;

    /* renamed from: m */
    public bxwc f85317m = bxxn.f165040b;

    static {
        apzv apzv = new apzv();
        f85303n = apzv;
        bxvk.m124024a(apzv.class, apzv);
    }

    private apzv() {
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
            return bxvk.m124022a(f85303n, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004င\u0003\u0005ဈ\u0004\u0006\u001b\u0007ဈ\u0005\bဈ\u0006\tဈ\u0007\n\u001b\u000bဉ\b\f\u001b", new Object[]{"a", "b", "c", "d", "e", "f", "g", apzq.class, "h", "i", "j", "k", aqar.class, "l", "m", aqal.class});
        } else if (i2 == 3) {
            return new apzv();
        } else {
            if (i2 == 4) {
                return new bxvd((float[]) null, (byte[][]) null);
            }
            if (i2 == 5) {
                return f85303n;
            }
            bxxk bxxk = f85304o;
            if (bxxk == null) {
                synchronized (apzv.class) {
                    bxxk = f85304o;
                    if (bxxk == null) {
                        bxxk = new bxve(f85303n);
                        f85304o = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
