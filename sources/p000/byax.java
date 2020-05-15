package p000;

/* renamed from: byax */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byax extends bxvk implements bxxd {

    /* renamed from: a */
    public static final byax f165367a;

    /* renamed from: b */
    private static volatile bxxk f165368b;

    static {
        byax byax = new byax();
        f165367a = byax;
        bxvk.m124024a(byax.class, byax);
    }

    private byax() {
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
            return bxvk.m124022a(f165367a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new byax();
        }
        if (i2 == 4) {
            return new bxvd(f165367a);
        }
        if (i2 == 5) {
            return f165367a;
        }
        bxxk bxxk = f165368b;
        if (bxxk == null) {
            synchronized (byax.class) {
                bxxk = f165368b;
                if (bxxk == null) {
                    bxxk = new bxve(f165367a);
                    f165368b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
