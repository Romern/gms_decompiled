package p000;

/* renamed from: btoh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btoh extends bxvk implements bxxd {

    /* renamed from: a */
    public static final btoh f149759a;

    /* renamed from: b */
    private static volatile bxxk f149760b;

    static {
        btoh btoh = new btoh();
        f149759a = btoh;
        bxvk.m124024a(btoh.class, btoh);
    }

    private btoh() {
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
            return bxvk.m124022a(f149759a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new btoh();
        }
        if (i2 == 4) {
            return new bxvd(f149759a);
        }
        if (i2 == 5) {
            return f149759a;
        }
        bxxk bxxk = f149760b;
        if (bxxk == null) {
            synchronized (btoh.class) {
                bxxk = f149760b;
                if (bxxk == null) {
                    bxxk = new bxve(f149759a);
                    f149760b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
