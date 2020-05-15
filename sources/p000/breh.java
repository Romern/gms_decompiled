package p000;

/* renamed from: breh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class breh extends bxvk implements bxxd {

    /* renamed from: b */
    public static final breh f142612b;

    /* renamed from: d */
    private static volatile bxxk f142613d;

    /* renamed from: a */
    public long f142614a;

    /* renamed from: c */
    private int f142615c;

    static {
        breh breh = new breh();
        f142612b = breh;
        bxvk.m124024a(breh.class, breh);
    }

    private breh() {
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
            return bxvk.m124022a(f142612b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new breh();
        } else {
            if (i2 == 4) {
                return new bxvd(f142612b);
            }
            if (i2 == 5) {
                return f142612b;
            }
            bxxk bxxk = f142613d;
            if (bxxk == null) {
                synchronized (breh.class) {
                    bxxk = f142613d;
                    if (bxxk == null) {
                        bxxk = new bxve(f142612b);
                        f142613d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
