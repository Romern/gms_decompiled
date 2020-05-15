package p000;

/* renamed from: btbw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btbw extends bxvk implements bxxd {

    /* renamed from: a */
    public static final btbw f148225a;

    /* renamed from: b */
    private static volatile bxxk f148226b;

    static {
        btbw btbw = new btbw();
        f148225a = btbw;
        bxvk.m124024a(btbw.class, btbw);
    }

    private btbw() {
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
            return bxvk.m124022a(f148225a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new btbw();
        }
        if (i2 == 4) {
            return new bxvd(f148225a);
        }
        if (i2 == 5) {
            return f148225a;
        }
        bxxk bxxk = f148226b;
        if (bxxk == null) {
            synchronized (btbw.class) {
                bxxk = f148226b;
                if (bxxk == null) {
                    bxxk = new bxve(f148225a);
                    f148226b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
