package p000;

/* renamed from: bzui */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzui extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bzui f171425a;

    /* renamed from: b */
    private static volatile bxxk f171426b;

    static {
        bzui bzui = new bzui();
        f171425a = bzui;
        bxvk.m124024a(bzui.class, bzui);
    }

    private bzui() {
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
            return bxvk.m124022a(f171425a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bzui();
        }
        if (i2 == 4) {
            return new bxvd(f171425a);
        }
        if (i2 == 5) {
            return f171425a;
        }
        bxxk bxxk = f171426b;
        if (bxxk == null) {
            synchronized (bzui.class) {
                bxxk = f171426b;
                if (bxxk == null) {
                    bxxk = new bxve(f171425a);
                    f171426b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
