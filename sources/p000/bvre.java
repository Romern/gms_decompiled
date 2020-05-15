package p000;

/* renamed from: bvre */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvre extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bvre f157430a;

    /* renamed from: b */
    private static volatile bxxk f157431b;

    static {
        bvre bvre = new bvre();
        f157430a = bvre;
        bxvk.m124024a(bvre.class, bvre);
    }

    private bvre() {
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
            return bxvk.m124022a(f157430a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvre();
        }
        if (i2 == 4) {
            return new bxvd(f157430a);
        }
        if (i2 == 5) {
            return f157430a;
        }
        bxxk bxxk = f157431b;
        if (bxxk == null) {
            synchronized (bvre.class) {
                bxxk = f157431b;
                if (bxxk == null) {
                    bxxk = new bxve(f157430a);
                    f157431b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
