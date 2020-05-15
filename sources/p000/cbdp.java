package p000;

/* renamed from: cbdp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbdp extends bxvk implements bxxd {

    /* renamed from: e */
    public static final cbdp f176766e;

    /* renamed from: f */
    private static volatile bxxk f176767f;

    /* renamed from: a */
    public String f176768a = "";

    /* renamed from: b */
    public boolean f176769b;

    /* renamed from: c */
    public boolean f176770c;

    /* renamed from: d */
    public bxwc f176771d = bxxn.f165040b;

    static {
        cbdp cbdp = new cbdp();
        f176766e = cbdp;
        bxvk.m124024a(cbdp.class, cbdp);
    }

    private cbdp() {
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
            return bxvk.m124022a(f176766e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\u0007\u0003\u0007\u0004\u001b", new Object[]{"a", "b", "c", "d", cbds.class});
        } else if (i2 == 3) {
            return new cbdp();
        } else {
            if (i2 == 4) {
                return new bxvd(f176766e);
            }
            if (i2 == 5) {
                return f176766e;
            }
            bxxk bxxk = f176767f;
            if (bxxk == null) {
                synchronized (cbdp.class) {
                    bxxk = f176767f;
                    if (bxxk == null) {
                        bxxk = new bxve(f176766e);
                        f176767f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
