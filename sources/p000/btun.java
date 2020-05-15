package p000;

@Deprecated
/* renamed from: btun */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btun extends bxvk implements bxxd {

    /* renamed from: a */
    public static final btun f150509a;

    /* renamed from: b */
    private static volatile bxxk f150510b;

    static {
        btun btun = new btun();
        f150509a = btun;
        bxvk.m124024a(btun.class, btun);
    }

    private btun() {
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
            return bxvk.m124022a(f150509a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new btun();
        }
        if (i2 == 4) {
            return new bxvd(f150509a);
        }
        if (i2 == 5) {
            return f150509a;
        }
        bxxk bxxk = f150510b;
        if (bxxk == null) {
            synchronized (btun.class) {
                bxxk = f150510b;
                if (bxxk == null) {
                    bxxk = new bxve(f150509a);
                    f150510b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
