package p000;

/* renamed from: btit */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btit extends bxvk implements bxxd {

    /* renamed from: a */
    public static final btit f149036a;

    /* renamed from: b */
    private static volatile bxxk f149037b;

    static {
        btit btit = new btit();
        f149036a = btit;
        bxvk.m124024a(btit.class, btit);
    }

    private btit() {
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
            return bxvk.m124022a(f149036a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new btit();
        }
        if (i2 == 4) {
            return new bxvd(f149036a);
        }
        if (i2 == 5) {
            return f149036a;
        }
        bxxk bxxk = f149037b;
        if (bxxk == null) {
            synchronized (btit.class) {
                bxxk = f149037b;
                if (bxxk == null) {
                    bxxk = new bxve(f149036a);
                    f149037b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
