package p000;

/* renamed from: cbdv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbdv extends bxvk implements bxxd {

    /* renamed from: j */
    public static final cbdv f176794j;

    /* renamed from: k */
    private static volatile bxxk f176795k;

    /* renamed from: a */
    public String f176796a = "";

    /* renamed from: b */
    public cbdt f176797b;

    /* renamed from: c */
    public cbdq f176798c;

    /* renamed from: d */
    public bxww f176799d = bxww.f165013b;

    /* renamed from: e */
    public bxwc f176800e = bxxn.f165040b;

    /* renamed from: f */
    public bxwc f176801f = bxxn.f165040b;

    /* renamed from: g */
    public cbdm f176802g;

    /* renamed from: h */
    public cbef f176803h;

    /* renamed from: i */
    public String f176804i = "";

    static {
        cbdv cbdv = new cbdv();
        f176794j = cbdv;
        bxvk.m124024a(cbdv.class, cbdv);
    }

    private cbdv() {
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
            return bxvk.m124022a(f176794j, "\u0000\t\u0000\u0000\u0001\n\t\u0001\u0002\u0000\u0001Ȉ\u0002\t\u0003\t\u00042\u0006\u001b\u0007\u001b\b\t\t\t\nȈ", new Object[]{"a", "b", "c", "d", cbdu.f176793a, "e", cbdy.class, "f", cbdy.class, "g", "h", "i"});
        } else if (i2 == 3) {
            return new cbdv();
        } else {
            if (i2 == 4) {
                return new bxvd(f176794j);
            }
            if (i2 == 5) {
                return f176794j;
            }
            bxxk bxxk = f176795k;
            if (bxxk == null) {
                synchronized (cbdv.class) {
                    bxxk = f176795k;
                    if (bxxk == null) {
                        bxxk = new bxve(f176794j);
                        f176795k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
