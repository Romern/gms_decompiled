package p000;

/* renamed from: bzhf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzhf extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bzhf f170043a;

    /* renamed from: b */
    private static volatile bxxk f170044b;

    static {
        bzhf bzhf = new bzhf();
        f170043a = bzhf;
        bxvk.m124024a(bzhf.class, bzhf);
    }

    private bzhf() {
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
            return bxvk.m124022a(f170043a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bzhf();
        }
        if (i2 == 4) {
            return new bxvd(f170043a);
        }
        if (i2 == 5) {
            return f170043a;
        }
        bxxk bxxk = f170044b;
        if (bxxk == null) {
            synchronized (bzhf.class) {
                bxxk = f170044b;
                if (bxxk == null) {
                    bxxk = new bxve(f170043a);
                    f170044b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
