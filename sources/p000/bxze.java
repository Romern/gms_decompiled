package p000;

/* renamed from: bxze */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxze extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bxze f165127a;

    /* renamed from: b */
    private static volatile bxxk f165128b;

    static {
        bxze bxze = new bxze();
        f165127a = bxze;
        bxvk.m124024a(bxze.class, bxze);
    }

    private bxze() {
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
            return bxvk.m124022a(f165127a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bxze();
        }
        if (i2 == 4) {
            return new bxvd(f165127a);
        }
        if (i2 == 5) {
            return f165127a;
        }
        bxxk bxxk = f165128b;
        if (bxxk == null) {
            synchronized (bxze.class) {
                bxxk = f165128b;
                if (bxxk == null) {
                    bxxk = new bxve(f165127a);
                    f165128b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
