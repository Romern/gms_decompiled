package p000;

/* renamed from: bssr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bssr extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bssr f146908a;

    /* renamed from: b */
    private static volatile bxxk f146909b;

    static {
        bssr bssr = new bssr();
        f146908a = bssr;
        bxvk.m124024a(bssr.class, bssr);
    }

    private bssr() {
        bxxn bxxn = bxxn.f165040b;
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
            return bxvk.m124022a(f146908a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bssr();
        }
        if (i2 == 4) {
            return new bxvd(f146908a);
        }
        if (i2 == 5) {
            return f146908a;
        }
        bxxk bxxk = f146909b;
        if (bxxk == null) {
            synchronized (bssr.class) {
                bxxk = f146909b;
                if (bxxk == null) {
                    bxxk = new bxve(f146908a);
                    f146909b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
