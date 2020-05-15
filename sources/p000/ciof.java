package p000;

/* renamed from: ciof */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciof extends bxvk implements bxxd {

    /* renamed from: a */
    public static final ciof f191053a;

    /* renamed from: b */
    private static volatile bxxk f191054b;

    static {
        ciof ciof = new ciof();
        f191053a = ciof;
        bxvk.m124024a(ciof.class, ciof);
    }

    private ciof() {
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
            return bxvk.m124022a(f191053a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new ciof();
        }
        if (i2 == 4) {
            return new bxvd(f191053a);
        }
        if (i2 == 5) {
            return f191053a;
        }
        bxxk bxxk = f191054b;
        if (bxxk == null) {
            synchronized (ciof.class) {
                bxxk = f191054b;
                if (bxxk == null) {
                    bxxk = new bxve(f191053a);
                    f191054b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
