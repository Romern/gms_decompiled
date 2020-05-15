package p000;

/* renamed from: bzwc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzwc extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bzwc f171602a;

    /* renamed from: b */
    private static volatile bxxk f171603b;

    static {
        bzwc bzwc = new bzwc();
        f171602a = bzwc;
        bxvk.m124024a(bzwc.class, bzwc);
    }

    private bzwc() {
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
            return bxvk.m124022a(f171602a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bzwc();
        }
        if (i2 == 4) {
            return new bxvd(f171602a);
        }
        if (i2 == 5) {
            return f171602a;
        }
        bxxk bxxk = f171603b;
        if (bxxk == null) {
            synchronized (bzwc.class) {
                bxxk = f171603b;
                if (bxxk == null) {
                    bxxk = new bxve(f171602a);
                    f171603b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
