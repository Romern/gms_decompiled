package p000;

/* renamed from: byjr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byjr extends bxvk implements bxxd {

    /* renamed from: a */
    public static final byjr f166694a;

    /* renamed from: b */
    private static volatile bxxk f166695b;

    static {
        byjr byjr = new byjr();
        f166694a = byjr;
        bxvk.m124024a(byjr.class, byjr);
    }

    private byjr() {
        bxtx bxtx = bxtx.f164797b;
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
            return bxvk.m124022a(f166694a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new byjr();
        }
        if (i2 == 4) {
            return new bxvd(f166694a);
        }
        if (i2 == 5) {
            return f166694a;
        }
        bxxk bxxk = f166695b;
        if (bxxk == null) {
            synchronized (byjr.class) {
                bxxk = f166695b;
                if (bxxk == null) {
                    bxxk = new bxve(f166694a);
                    f166695b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
