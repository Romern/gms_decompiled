package p000;

/* renamed from: kbu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kbu extends bxvk implements bxxd {

    /* renamed from: f */
    public static final kbu f23718f;

    /* renamed from: g */
    private static volatile bxxk f23719g;

    /* renamed from: a */
    public long f23720a;

    /* renamed from: b */
    public long f23721b;

    /* renamed from: c */
    public kbt f23722c;

    /* renamed from: d */
    public bxwc f23723d = bxxn.f165040b;

    /* renamed from: e */
    public boolean f23724e;

    static {
        kbu kbu = new kbu();
        f23718f = kbu;
        bxvk.m124024a(kbu.class, kbu);
    }

    private kbu() {
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
            return bxvk.m124022a(f23718f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u0002\u0002\u0002\u0003\t\u0004\u001b\u0005\u0007", new Object[]{"a", "b", "c", "d", kcj.class, "e"});
        } else if (i2 == 3) {
            return new kbu();
        } else {
            if (i2 == 4) {
                return new bxvd(f23718f);
            }
            if (i2 == 5) {
                return f23718f;
            }
            bxxk bxxk = f23719g;
            if (bxxk == null) {
                synchronized (kbu.class) {
                    bxxk = f23719g;
                    if (bxxk == null) {
                        bxxk = new bxve(f23718f);
                        f23719g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
