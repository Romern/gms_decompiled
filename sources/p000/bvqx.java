package p000;

/* renamed from: bvqx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvqx extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bvqx f157416a;

    /* renamed from: b */
    private static volatile bxxk f157417b;

    static {
        bvqx bvqx = new bvqx();
        f157416a = bvqx;
        bxvk.m124024a(bvqx.class, bvqx);
    }

    private bvqx() {
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
            return bxvk.m124022a(f157416a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvqx();
        }
        if (i2 == 4) {
            return new bxvd(f157416a);
        }
        if (i2 == 5) {
            return f157416a;
        }
        bxxk bxxk = f157417b;
        if (bxxk == null) {
            synchronized (bvqx.class) {
                bxxk = f157417b;
                if (bxxk == null) {
                    bxxk = new bxve(f157416a);
                    f157417b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
