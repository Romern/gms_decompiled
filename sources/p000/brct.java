package p000;

/* renamed from: brct */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brct extends bxvk implements bxxd {

    /* renamed from: a */
    public static final brct f142428a;

    /* renamed from: b */
    private static volatile bxxk f142429b;

    static {
        brct brct = new brct();
        f142428a = brct;
        bxvk.m124024a(brct.class, brct);
    }

    private brct() {
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
            return bxvk.m124022a(f142428a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new brct();
        }
        if (i2 == 4) {
            return new bxvd(f142428a);
        }
        if (i2 == 5) {
            return f142428a;
        }
        bxxk bxxk = f142429b;
        if (bxxk == null) {
            synchronized (brct.class) {
                bxxk = f142429b;
                if (bxxk == null) {
                    bxxk = new bxve(f142428a);
                    f142429b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
