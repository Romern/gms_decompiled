package p000;

/* renamed from: bmrs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmrs extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bmrs f130577a;

    /* renamed from: b */
    private static volatile bxxk f130578b;

    static {
        bmrs bmrs = new bmrs();
        f130577a = bmrs;
        bxvk.m124024a(bmrs.class, bmrs);
    }

    private bmrs() {
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
            return bxvk.m124022a(f130577a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bmrs();
        }
        if (i2 == 4) {
            return new bxvd(f130577a);
        }
        if (i2 == 5) {
            return f130577a;
        }
        bxxk bxxk = f130578b;
        if (bxxk == null) {
            synchronized (bmrs.class) {
                bxxk = f130578b;
                if (bxxk == null) {
                    bxxk = new bxve(f130577a);
                    f130578b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
