package p000;

/* renamed from: lak */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lak extends bxvk implements bxxd {

    /* renamed from: f */
    public static final lak f25559f;

    /* renamed from: g */
    private static volatile bxxk f25560g;

    /* renamed from: a */
    public kzz f25561a;

    /* renamed from: b */
    public bxwc f25562b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f25563c = bxxn.f165040b;

    /* renamed from: d */
    public bxvt f25564d = bxvm.f164965b;

    /* renamed from: e */
    public bxwc f25565e = bxxn.f165040b;

    static {
        lak lak = new lak();
        f25559f = lak;
        bxvk.m124024a(lak.class, lak);
    }

    private lak() {
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
            return bxvk.m124022a(f25559f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0004\u0000\u0001\t\u0002\u001b\u0003\u001b\u0004'\u0005\u001b", new Object[]{"a", "b", lbd.class, "c", lbd.class, "d", "e", lbd.class});
        } else if (i2 == 3) {
            return new lak();
        } else {
            if (i2 == 4) {
                return new bxvd(f25559f);
            }
            if (i2 == 5) {
                return f25559f;
            }
            bxxk bxxk = f25560g;
            if (bxxk == null) {
                synchronized (lak.class) {
                    bxxk = f25560g;
                    if (bxxk == null) {
                        bxxk = new bxve(f25559f);
                        f25560g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
