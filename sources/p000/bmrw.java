package p000;

/* renamed from: bmrw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmrw extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bmrw f130595a;

    /* renamed from: b */
    private static volatile bxxk f130596b;

    static {
        bmrw bmrw = new bmrw();
        f130595a = bmrw;
        bxvk.m124024a(bmrw.class, bmrw);
    }

    private bmrw() {
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
            return bxvk.m124022a(f130595a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bmrw();
        }
        if (i2 == 4) {
            return new bxvd(f130595a);
        }
        if (i2 == 5) {
            return f130595a;
        }
        bxxk bxxk = f130596b;
        if (bxxk == null) {
            synchronized (bmrw.class) {
                bxxk = f130596b;
                if (bxxk == null) {
                    bxxk = new bxve(f130595a);
                    f130596b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
