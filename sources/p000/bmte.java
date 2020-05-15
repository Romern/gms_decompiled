package p000;

/* renamed from: bmte */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmte extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bmte f130822a;

    /* renamed from: b */
    private static volatile bxxk f130823b;

    static {
        bmte bmte = new bmte();
        f130822a = bmte;
        bxvk.m124024a(bmte.class, bmte);
    }

    private bmte() {
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
            return bxvk.m124022a(f130822a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bmte();
        }
        if (i2 == 4) {
            return new bxvd(f130822a);
        }
        if (i2 == 5) {
            return f130822a;
        }
        bxxk bxxk = f130823b;
        if (bxxk == null) {
            synchronized (bmte.class) {
                bxxk = f130823b;
                if (bxxk == null) {
                    bxxk = new bxve(f130822a);
                    f130823b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
