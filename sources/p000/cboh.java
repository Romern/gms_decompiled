package p000;

/* renamed from: cboh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cboh extends bxvk implements bxxd {

    /* renamed from: e */
    public static final cboh f177813e;

    /* renamed from: f */
    private static volatile bxxk f177814f;

    /* renamed from: a */
    public bxwc f177815a = bxxn.f165040b;

    /* renamed from: b */
    public int f177816b;

    /* renamed from: c */
    public bxwc f177817c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f177818d = bxxn.f165040b;

    static {
        cboh cboh = new cboh();
        f177813e = cboh;
        bxvk.m124024a(cboh.class, cboh);
    }

    private cboh() {
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
            return bxvk.m124022a(f177813e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0003\u0000\u0001\u001b\u0002\f\u0003\u001b\u0004\u001b", new Object[]{"a", cbos.class, "b", "c", cboa.class, "d", cboe.class});
        } else if (i2 == 3) {
            return new cboh();
        } else {
            if (i2 == 4) {
                return new bxvd(f177813e);
            }
            if (i2 == 5) {
                return f177813e;
            }
            bxxk bxxk = f177814f;
            if (bxxk == null) {
                synchronized (cboh.class) {
                    bxxk = f177814f;
                    if (bxxk == null) {
                        bxxk = new bxve(f177813e);
                        f177814f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
