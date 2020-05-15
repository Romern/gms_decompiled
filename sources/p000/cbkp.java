package p000;

/* renamed from: cbkp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbkp extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cbkp f177432c;

    /* renamed from: d */
    private static volatile bxxk f177433d;

    /* renamed from: a */
    public bxwc f177434a = bxxn.f165040b;

    /* renamed from: b */
    public boolean f177435b;

    static {
        cbkp cbkp = new cbkp();
        f177432c = cbkp;
        bxvk.m124024a(cbkp.class, cbkp);
    }

    private cbkp() {
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
            return bxvk.m124022a(f177432c, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0001\u0000\u0002\u001b\u0003\u0007", new Object[]{"a", cbkj.class, "b"});
        } else if (i2 == 3) {
            return new cbkp();
        } else {
            if (i2 == 4) {
                return new bxvd(f177432c);
            }
            if (i2 == 5) {
                return f177432c;
            }
            bxxk bxxk = f177433d;
            if (bxxk == null) {
                synchronized (cbkp.class) {
                    bxxk = f177433d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177432c);
                        f177433d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
