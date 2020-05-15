package p000;

/* renamed from: bsro */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsro extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bsro f146785a;

    /* renamed from: b */
    private static volatile bxxk f146786b;

    static {
        bsro bsro = new bsro();
        f146785a = bsro;
        bxvk.m124024a(bsro.class, bsro);
    }

    private bsro() {
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
            return bxvk.m124022a(f146785a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bsro();
        }
        if (i2 == 4) {
            return new bxvd(f146785a);
        }
        if (i2 == 5) {
            return f146785a;
        }
        bxxk bxxk = f146786b;
        if (bxxk == null) {
            synchronized (bsro.class) {
                bxxk = f146786b;
                if (bxxk == null) {
                    bxxk = new bxve(f146785a);
                    f146786b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
