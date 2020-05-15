package p000;

/* renamed from: cbce */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbce extends bxvk implements bxxd {

    /* renamed from: d */
    public static final cbce f176645d;

    /* renamed from: e */
    private static volatile bxxk f176646e;

    /* renamed from: a */
    public bxwc f176647a = bxxn.f165040b;

    /* renamed from: b */
    public String f176648b = "";

    /* renamed from: c */
    public String f176649c = "";

    static {
        cbce cbce = new cbce();
        f176645d = cbce;
        bxvk.m124024a(cbce.class, cbce);
    }

    private cbce() {
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
            return bxvk.m124022a(f176645d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ț\u0002Ȉ\u0003Ȉ", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new cbce();
        } else {
            if (i2 == 4) {
                return new bxvd(f176645d);
            }
            if (i2 == 5) {
                return f176645d;
            }
            bxxk bxxk = f176646e;
            if (bxxk == null) {
                synchronized (cbce.class) {
                    bxxk = f176646e;
                    if (bxxk == null) {
                        bxxk = new bxve(f176645d);
                        f176646e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
