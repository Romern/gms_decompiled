package p000;

/* renamed from: cbcx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbcx extends bxvk implements bxxd {

    /* renamed from: f */
    public static final cbcx f176703f;

    /* renamed from: g */
    private static volatile bxxk f176704g;

    /* renamed from: a */
    public String f176705a = "";

    /* renamed from: b */
    public String f176706b = "";

    /* renamed from: c */
    public bxwc f176707c = bxxn.f165040b;

    /* renamed from: d */
    public int f176708d;

    /* renamed from: e */
    public String f176709e = "";

    static {
        cbcx cbcx = new cbcx();
        f176703f = cbcx;
        bxvk.m124024a(cbcx.class, cbcx);
    }

    private cbcx() {
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
            return bxvk.m124022a(f176703f, "\u0000\u0005\u0000\u0000\u0001\u0007\u0005\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0004\u001b\u0005\f\u0007Ȉ", new Object[]{"a", "b", "c", cbcw.class, "d", "e"});
        } else if (i2 == 3) {
            return new cbcx();
        } else {
            if (i2 == 4) {
                return new bxvd(f176703f);
            }
            if (i2 == 5) {
                return f176703f;
            }
            bxxk bxxk = f176704g;
            if (bxxk == null) {
                synchronized (cbcx.class) {
                    bxxk = f176704g;
                    if (bxxk == null) {
                        bxxk = new bxve(f176703f);
                        f176704g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
