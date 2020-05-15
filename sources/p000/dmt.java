package p000;

/* renamed from: dmt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dmt extends bxvk implements bxxd {

    /* renamed from: f */
    public static final dmt f13604f;

    /* renamed from: g */
    private static volatile bxxk f13605g;

    /* renamed from: a */
    public int f13606a;

    /* renamed from: b */
    public String f13607b = "";

    /* renamed from: c */
    public String f13608c = "";

    /* renamed from: d */
    public bxwc f13609d = bxxn.f165040b;

    /* renamed from: e */
    public int f13610e;

    static {
        dmt dmt = new dmt();
        f13604f = dmt;
        bxvk.m124024a(dmt.class, dmt);
    }

    private dmt() {
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
            return bxvk.m124022a(f13604f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004င\u0002", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new dmt();
        } else {
            if (i2 == 4) {
                return new bxvd(f13604f);
            }
            if (i2 == 5) {
                return f13604f;
            }
            bxxk bxxk = f13605g;
            if (bxxk == null) {
                synchronized (dmt.class) {
                    bxxk = f13605g;
                    if (bxxk == null) {
                        bxxk = new bxve(f13604f);
                        f13605g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
