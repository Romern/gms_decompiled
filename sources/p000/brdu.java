package p000;

/* renamed from: brdu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brdu extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bxvu f142561b = new brdn();

    /* renamed from: d */
    public static final brdu f142562d;

    /* renamed from: e */
    private static volatile bxxk f142563e;

    /* renamed from: a */
    public bxvt f142564a = bxvm.f164965b;

    /* renamed from: c */
    public bxwc f142565c = bxxn.f165040b;

    static {
        brdu brdu = new brdu();
        f142562d = brdu;
        bxvk.m124024a(brdu.class, brdu);
    }

    private brdu() {
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
            return bxvk.m124022a(f142562d, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001e\u0002\u001b", new Object[]{"a", brdp.m113907b(), "c", brdt.class});
        } else if (i2 == 3) {
            return new brdu();
        } else {
            if (i2 == 4) {
                return new bxvd(f142562d);
            }
            if (i2 == 5) {
                return f142562d;
            }
            bxxk bxxk = f142563e;
            if (bxxk == null) {
                synchronized (brdu.class) {
                    bxxk = f142563e;
                    if (bxxk == null) {
                        bxxk = new bxve(f142562d);
                        f142563e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
