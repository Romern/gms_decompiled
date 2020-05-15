package p000;

@Deprecated
/* renamed from: bzvd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzvd extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bzvd f171511a;

    /* renamed from: b */
    private static volatile bxxk f171512b;

    static {
        bzvd bzvd = new bzvd();
        f171511a = bzvd;
        bxvk.m124024a(bzvd.class, bzvd);
    }

    private bzvd() {
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
            return bxvk.m124022a(f171511a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bzvd();
        }
        if (i2 == 4) {
            return new bxvd(f171511a);
        }
        if (i2 == 5) {
            return f171511a;
        }
        bxxk bxxk = f171512b;
        if (bxxk == null) {
            synchronized (bzvd.class) {
                bxxk = f171512b;
                if (bxxk == null) {
                    bxxk = new bxve(f171511a);
                    f171512b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
