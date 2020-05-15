package p000;

/* renamed from: agne */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agne extends bxvk implements bxxd {

    /* renamed from: h */
    public static final agne f66038h;

    /* renamed from: i */
    private static volatile bxxk f66039i;

    /* renamed from: a */
    public int f66040a;

    /* renamed from: b */
    public long f66041b;

    /* renamed from: c */
    public String f66042c = "";

    /* renamed from: d */
    public bxwc f66043d = bxxn.f165040b;

    /* renamed from: e */
    public bxwc f66044e = bxxn.f165040b;

    /* renamed from: f */
    public bxwc f66045f = bxxn.f165040b;

    /* renamed from: g */
    public boolean f66046g;

    static {
        agne agne = new agne();
        f66038h = agne;
        bxvk.m124024a(agne.class, agne);
    }

    private agne() {
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
            return bxvk.m124022a(f66038h, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0003\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0004\u001b\u0005\u001b\u0006\u001b\bဇ\u0004", new Object[]{"a", "b", "c", "d", agnf.class, "e", agnd.class, "f", agmt.class, "g"});
        } else if (i2 == 3) {
            return new agne();
        } else {
            if (i2 == 4) {
                return new bxvd((float[]) null, (boolean[][]) null);
            }
            if (i2 == 5) {
                return f66038h;
            }
            bxxk bxxk = f66039i;
            if (bxxk == null) {
                synchronized (agne.class) {
                    bxxk = f66039i;
                    if (bxxk == null) {
                        bxxk = new bxve(f66038h);
                        f66039i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
