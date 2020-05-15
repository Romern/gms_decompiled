package p000;

/* renamed from: bzke */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzke extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bzke f170380a;

    /* renamed from: b */
    private static volatile bxxk f170381b;

    static {
        bzke bzke = new bzke();
        f170380a = bzke;
        bxvk.m124024a(bzke.class, bzke);
    }

    private bzke() {
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
            return bxvk.m124022a(f170380a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bzke();
        }
        if (i2 == 4) {
            return new bxvd(f170380a);
        }
        if (i2 == 5) {
            return f170380a;
        }
        bxxk bxxk = f170381b;
        if (bxxk == null) {
            synchronized (bzke.class) {
                bxxk = f170381b;
                if (bxxk == null) {
                    bxxk = new bxve(f170380a);
                    f170381b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
