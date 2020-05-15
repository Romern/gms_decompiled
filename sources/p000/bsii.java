package p000;

/* renamed from: bsii */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsii extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bsii f144721a;

    /* renamed from: b */
    private static volatile bxxk f144722b;

    static {
        bsii bsii = new bsii();
        f144721a = bsii;
        bxvk.m124024a(bsii.class, bsii);
    }

    private bsii() {
        bxvm bxvm = bxvm.f164965b;
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
            return bxvk.m124022a(f144721a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bsii();
        }
        if (i2 == 4) {
            return new bxvd(f144721a);
        }
        if (i2 == 5) {
            return f144721a;
        }
        bxxk bxxk = f144722b;
        if (bxxk == null) {
            synchronized (bsii.class) {
                bxxk = f144722b;
                if (bxxk == null) {
                    bxxk = new bxve(f144721a);
                    f144722b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
