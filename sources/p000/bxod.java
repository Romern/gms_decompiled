package p000;

/* renamed from: bxod */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxod extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bxod f164136a;

    /* renamed from: b */
    private static volatile bxxk f164137b;

    static {
        bxod bxod = new bxod();
        f164136a = bxod;
        bxvk.m124024a(bxod.class, bxod);
    }

    private bxod() {
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
            return bxvk.m124022a(f164136a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bxod();
        }
        if (i2 == 4) {
            return new bxvd(f164136a);
        }
        if (i2 == 5) {
            return f164136a;
        }
        bxxk bxxk = f164137b;
        if (bxxk == null) {
            synchronized (bxod.class) {
                bxxk = f164137b;
                if (bxxk == null) {
                    bxxk = new bxve(f164136a);
                    f164137b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
