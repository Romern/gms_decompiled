package p000;

/* renamed from: bvst */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvst extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bvst f157527a;

    /* renamed from: b */
    private static volatile bxxk f157528b;

    static {
        bvst bvst = new bvst();
        f157527a = bvst;
        bxvk.m124024a(bvst.class, bvst);
    }

    private bvst() {
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
            return bxvk.m124022a(f157527a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvst();
        }
        if (i2 == 4) {
            return new bxvd(f157527a);
        }
        if (i2 == 5) {
            return f157527a;
        }
        bxxk bxxk = f157528b;
        if (bxxk == null) {
            synchronized (bvst.class) {
                bxxk = f157528b;
                if (bxxk == null) {
                    bxxk = new bxve(f157527a);
                    f157528b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
