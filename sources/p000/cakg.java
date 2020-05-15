package p000;

/* renamed from: cakg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cakg extends bxvk implements bxxd {

    /* renamed from: a */
    public static final cakg f174979a;

    /* renamed from: b */
    private static volatile bxxk f174980b;

    static {
        cakg cakg = new cakg();
        f174979a = cakg;
        bxvk.m124024a(cakg.class, cakg);
    }

    private cakg() {
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
            return bxvk.m124022a(f174979a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cakg();
        }
        if (i2 == 4) {
            return new bxvd(f174979a);
        }
        if (i2 == 5) {
            return f174979a;
        }
        bxxk bxxk = f174980b;
        if (bxxk == null) {
            synchronized (cakg.class) {
                bxxk = f174980b;
                if (bxxk == null) {
                    bxxk = new bxve(f174979a);
                    f174980b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
