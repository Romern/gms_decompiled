package p000;

/* renamed from: buog */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buog extends bxvk implements bxxd {

    /* renamed from: a */
    public static final buog f154521a;

    /* renamed from: b */
    private static volatile bxxk f154522b;

    static {
        buog buog = new buog();
        f154521a = buog;
        bxvk.m124024a(buog.class, buog);
    }

    private buog() {
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
            return bxvk.m124022a(f154521a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new buog();
        }
        if (i2 == 4) {
            return new bxvd(f154521a);
        }
        if (i2 == 5) {
            return f154521a;
        }
        bxxk bxxk = f154522b;
        if (bxxk == null) {
            synchronized (buog.class) {
                bxxk = f154522b;
                if (bxxk == null) {
                    bxxk = new bxve(f154521a);
                    f154522b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
