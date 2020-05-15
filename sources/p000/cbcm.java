package p000;

/* renamed from: cbcm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbcm extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cbcm f176669c;

    /* renamed from: d */
    private static volatile bxxk f176670d;

    /* renamed from: a */
    public cbmo f176671a;

    /* renamed from: b */
    public cbdl f176672b;

    static {
        cbcm cbcm = new cbcm();
        f176669c = cbcm;
        bxvk.m124024a(cbcm.class, cbcm);
    }

    private cbcm() {
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
            return bxvk.m124022a(f176669c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cbcm();
        } else {
            if (i2 == 4) {
                return new bxvd(f176669c);
            }
            if (i2 == 5) {
                return f176669c;
            }
            bxxk bxxk = f176670d;
            if (bxxk == null) {
                synchronized (cbcm.class) {
                    bxxk = f176670d;
                    if (bxxk == null) {
                        bxxk = new bxve(f176669c);
                        f176670d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
