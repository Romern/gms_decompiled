package p000;

/* renamed from: btts */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btts extends bxvk implements bxxd {

    /* renamed from: a */
    public static final btts f150390a;

    /* renamed from: b */
    private static volatile bxxk f150391b;

    static {
        btts btts = new btts();
        f150390a = btts;
        bxvk.m124024a(btts.class, btts);
    }

    private btts() {
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
            return bxvk.m124022a(f150390a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new btts();
        }
        if (i2 == 4) {
            return new bxvd(f150390a);
        }
        if (i2 == 5) {
            return f150390a;
        }
        bxxk bxxk = f150391b;
        if (bxxk == null) {
            synchronized (btts.class) {
                bxxk = f150391b;
                if (bxxk == null) {
                    bxxk = new bxve(f150390a);
                    f150391b = bxxk;
                }
            }
        }
        return bxxk;
    }
}