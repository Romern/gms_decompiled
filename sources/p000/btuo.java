package p000;

/* renamed from: btuo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btuo extends bxvk implements bxxd {

    /* renamed from: a */
    public static final btuo f150511a;

    /* renamed from: b */
    private static volatile bxxk f150512b;

    static {
        btuo btuo = new btuo();
        f150511a = btuo;
        bxvk.m124024a(btuo.class, btuo);
    }

    private btuo() {
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
            return bxvk.m124022a(f150511a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new btuo();
        }
        if (i2 == 4) {
            return new bxvd(f150511a);
        }
        if (i2 == 5) {
            return f150511a;
        }
        bxxk bxxk = f150512b;
        if (bxxk == null) {
            synchronized (btuo.class) {
                bxxk = f150512b;
                if (bxxk == null) {
                    bxxk = new bxve(f150511a);
                    f150512b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
