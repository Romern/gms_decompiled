package p000;

/* renamed from: cbkn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbkn extends bxvk implements bxxd {

    /* renamed from: a */
    public static final cbkn f177427a;

    /* renamed from: b */
    private static volatile bxxk f177428b;

    static {
        cbkn cbkn = new cbkn();
        f177427a = cbkn;
        bxvk.m124024a(cbkn.class, cbkn);
    }

    private cbkn() {
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
            return bxvk.m124022a(f177427a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbkn();
        }
        if (i2 == 4) {
            return new bxvd(f177427a);
        }
        if (i2 == 5) {
            return f177427a;
        }
        bxxk bxxk = f177428b;
        if (bxxk == null) {
            synchronized (cbkn.class) {
                bxxk = f177428b;
                if (bxxk == null) {
                    bxxk = new bxve(f177427a);
                    f177428b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
