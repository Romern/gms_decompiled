package p000;

/* renamed from: bzpl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzpl extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bzpl f170931a;

    /* renamed from: b */
    private static volatile bxxk f170932b;

    static {
        bzpl bzpl = new bzpl();
        f170931a = bzpl;
        bxvk.m124024a(bzpl.class, bzpl);
    }

    private bzpl() {
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
            return bxvk.m124022a(f170931a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bzpl();
        }
        if (i2 == 4) {
            return new bxvd(f170931a);
        }
        if (i2 == 5) {
            return f170931a;
        }
        bxxk bxxk = f170932b;
        if (bxxk == null) {
            synchronized (bzpl.class) {
                bxxk = f170932b;
                if (bxxk == null) {
                    bxxk = new bxve(f170931a);
                    f170932b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
