package p000;

/* renamed from: cabw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cabw extends bxvk implements bxxd {

    /* renamed from: a */
    public static final cabw f172484a;

    /* renamed from: b */
    private static volatile bxxk f172485b;

    static {
        cabw cabw = new cabw();
        f172484a = cabw;
        bxvk.m124024a(cabw.class, cabw);
    }

    private cabw() {
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
            return bxvk.m124022a(f172484a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cabw();
        }
        if (i2 == 4) {
            return new bxvd(f172484a);
        }
        if (i2 == 5) {
            return f172484a;
        }
        bxxk bxxk = f172485b;
        if (bxxk == null) {
            synchronized (cabw.class) {
                bxxk = f172485b;
                if (bxxk == null) {
                    bxxk = new bxve(f172484a);
                    f172485b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
