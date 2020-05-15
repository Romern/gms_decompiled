package p000;

/* renamed from: btqa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btqa extends bxvk implements bxxd {

    /* renamed from: a */
    public static final btqa f149916a;

    /* renamed from: b */
    private static volatile bxxk f149917b;

    static {
        btqa btqa = new btqa();
        f149916a = btqa;
        bxvk.m124024a(btqa.class, btqa);
    }

    private btqa() {
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
            return bxvk.m124022a(f149916a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new btqa();
        }
        if (i2 == 4) {
            return new bxvd(f149916a);
        }
        if (i2 == 5) {
            return f149916a;
        }
        bxxk bxxk = f149917b;
        if (bxxk == null) {
            synchronized (btqa.class) {
                bxxk = f149917b;
                if (bxxk == null) {
                    bxxk = new bxve(f149916a);
                    f149917b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
