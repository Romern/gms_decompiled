package p000;

/* renamed from: byxd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byxd extends bxvk implements bxxd {

    /* renamed from: e */
    public static final byxd f168710e;

    /* renamed from: f */
    private static volatile bxxk f168711f;

    /* renamed from: a */
    public int f168712a;

    /* renamed from: b */
    public bywv f168713b;

    /* renamed from: c */
    public bywx f168714c;

    /* renamed from: d */
    public byxr f168715d;

    static {
        byxd byxd = new byxd();
        f168710e = byxd;
        bxvk.m124024a(byxd.class, byxd);
    }

    private byxd() {
        bxxn bxxn = bxxn.f165040b;
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
            return bxvk.m124022a(f168710e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new byxd();
        } else {
            if (i2 == 4) {
                return new bxvd(f168710e);
            }
            if (i2 == 5) {
                return f168710e;
            }
            bxxk bxxk = f168711f;
            if (bxxk == null) {
                synchronized (byxd.class) {
                    bxxk = f168711f;
                    if (bxxk == null) {
                        bxxk = new bxve(f168710e);
                        f168711f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
