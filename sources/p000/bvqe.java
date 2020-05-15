package p000;

/* renamed from: bvqe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvqe extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bvqe f157365a;

    /* renamed from: b */
    private static volatile bxxk f157366b;

    static {
        bvqe bvqe = new bvqe();
        f157365a = bvqe;
        bxvk.m124024a(bvqe.class, bvqe);
    }

    private bvqe() {
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
            return bxvk.m124022a(f157365a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvqe();
        }
        if (i2 == 4) {
            return new bxvd(f157365a);
        }
        if (i2 == 5) {
            return f157365a;
        }
        bxxk bxxk = f157366b;
        if (bxxk == null) {
            synchronized (bvqe.class) {
                bxxk = f157366b;
                if (bxxk == null) {
                    bxxk = new bxve(f157365a);
                    f157366b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
