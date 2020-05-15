package p000;

/* renamed from: btqi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btqi extends bxvk implements bxxd {

    /* renamed from: a */
    public static final btqi f149956a;

    /* renamed from: b */
    private static volatile bxxk f149957b;

    static {
        btqi btqi = new btqi();
        f149956a = btqi;
        bxvk.m124024a(btqi.class, btqi);
    }

    private btqi() {
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
            return bxvk.m124022a(f149956a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new btqi();
        }
        if (i2 == 4) {
            return new bxvd(f149956a);
        }
        if (i2 == 5) {
            return f149956a;
        }
        bxxk bxxk = f149957b;
        if (bxxk == null) {
            synchronized (btqi.class) {
                bxxk = f149957b;
                if (bxxk == null) {
                    bxxk = new bxve(f149956a);
                    f149957b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
