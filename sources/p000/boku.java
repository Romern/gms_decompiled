package p000;

/* renamed from: boku */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boku extends bxvk implements bxxd {

    /* renamed from: a */
    public static final boku f133456a;

    /* renamed from: b */
    private static volatile bxxk f133457b;

    static {
        boku boku = new boku();
        f133456a = boku;
        bxvk.m124024a(boku.class, boku);
    }

    private boku() {
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
            return bxvk.m124022a(f133456a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new boku();
        }
        if (i2 == 4) {
            return new bxvd(f133456a);
        }
        if (i2 == 5) {
            return f133456a;
        }
        bxxk bxxk = f133457b;
        if (bxxk == null) {
            synchronized (boku.class) {
                bxxk = f133457b;
                if (bxxk == null) {
                    bxxk = new bxve(f133456a);
                    f133457b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
