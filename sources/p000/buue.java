package p000;

/* renamed from: buue */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buue extends bxvk implements bxxd {

    /* renamed from: a */
    public static final buue f154937a;

    /* renamed from: b */
    private static volatile bxxk f154938b;

    static {
        buue buue = new buue();
        f154937a = buue;
        bxvk.m124024a(buue.class, buue);
    }

    private buue() {
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
            return bxvk.m124022a(f154937a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new buue();
        }
        if (i2 == 4) {
            return new bxvd(f154937a);
        }
        if (i2 == 5) {
            return f154937a;
        }
        bxxk bxxk = f154938b;
        if (bxxk == null) {
            synchronized (buue.class) {
                bxxk = f154938b;
                if (bxxk == null) {
                    bxxk = new bxve(f154937a);
                    f154938b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
