package p000;

/* renamed from: amoj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amoj extends bxvk implements bxxd {

    /* renamed from: d */
    public static final amoj f75618d;

    /* renamed from: e */
    private static volatile bxxk f75619e;

    /* renamed from: a */
    public int f75620a;

    /* renamed from: b */
    public amok f75621b;

    /* renamed from: c */
    public bxwc f75622c = bxxn.f165040b;

    static {
        amoj amoj = new amoj();
        f75618d = amoj;
        bxvk.m124024a(amoj.class, amoj);
    }

    private amoj() {
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
            return bxvk.m124022a(f75618d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"a", "b", "c", amol.class});
        } else if (i2 == 3) {
            return new amoj();
        } else {
            if (i2 == 4) {
                return new amoi();
            }
            if (i2 == 5) {
                return f75618d;
            }
            bxxk bxxk = f75619e;
            if (bxxk == null) {
                synchronized (amoj.class) {
                    bxxk = f75619e;
                    if (bxxk == null) {
                        bxxk = new bxve(f75618d);
                        f75619e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
