package p000;

/* renamed from: bvrk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvrk extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bvrk f157442a;

    /* renamed from: b */
    private static volatile bxxk f157443b;

    static {
        bvrk bvrk = new bvrk();
        f157442a = bvrk;
        bxvk.m124024a(bvrk.class, bvrk);
    }

    private bvrk() {
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
            return bxvk.m124022a(f157442a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvrk();
        }
        if (i2 == 4) {
            return new bxvd(f157442a);
        }
        if (i2 == 5) {
            return f157442a;
        }
        bxxk bxxk = f157443b;
        if (bxxk == null) {
            synchronized (bvrk.class) {
                bxxk = f157443b;
                if (bxxk == null) {
                    bxxk = new bxve(f157442a);
                    f157443b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
