package p000;

/* renamed from: iet */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iet extends bxvk implements bxxd {

    /* renamed from: a */
    public static final iet f20820a;

    /* renamed from: b */
    private static volatile bxxk f20821b;

    static {
        iet iet = new iet();
        f20820a = iet;
        bxvk.m124024a(iet.class, iet);
    }

    private iet() {
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
            return bxvk.m124022a(f20820a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new iet();
        }
        if (i2 == 4) {
            return new bxvd(f20820a);
        }
        if (i2 == 5) {
            return f20820a;
        }
        bxxk bxxk = f20821b;
        if (bxxk == null) {
            synchronized (iet.class) {
                bxxk = f20821b;
                if (bxxk == null) {
                    bxxk = new bxve(f20820a);
                    f20821b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
