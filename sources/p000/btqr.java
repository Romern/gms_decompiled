package p000;

/* renamed from: btqr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btqr extends bxvk implements bxxd {

    /* renamed from: c */
    public static final btqr f150032c;

    /* renamed from: d */
    private static volatile bxxk f150033d;

    /* renamed from: a */
    public bxwc f150034a = bxxn.f165040b;

    /* renamed from: b */
    public bxyk f150035b;

    static {
        btqr btqr = new btqr();
        f150032c = btqr;
        bxvk.m124024a(btqr.class, btqr);
    }

    private btqr() {
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
            return bxvk.m124022a(f150032c, "\u0000\u0002\u0000\u0000\u0003\u0004\u0002\u0000\u0001\u0000\u0003\u001b\u0004\t", new Object[]{"a", btqp.class, "b"});
        } else if (i2 == 3) {
            return new btqr();
        } else {
            if (i2 == 4) {
                return new bxvd((short[]) null);
            }
            if (i2 == 5) {
                return f150032c;
            }
            bxxk bxxk = f150033d;
            if (bxxk == null) {
                synchronized (btqr.class) {
                    bxxk = f150033d;
                    if (bxxk == null) {
                        bxxk = new bxve(f150032c);
                        f150033d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
