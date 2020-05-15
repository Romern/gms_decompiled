package p000;

/* renamed from: bvrt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvrt extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bvrt f157460a;

    /* renamed from: b */
    private static volatile bxxk f157461b;

    static {
        bvrt bvrt = new bvrt();
        f157460a = bvrt;
        bxvk.m124024a(bvrt.class, bvrt);
    }

    private bvrt() {
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
            return bxvk.m124022a(f157460a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvrt();
        }
        if (i2 == 4) {
            return new bxvd(f157460a);
        }
        if (i2 == 5) {
            return f157460a;
        }
        bxxk bxxk = f157461b;
        if (bxxk == null) {
            synchronized (bvrt.class) {
                bxxk = f157461b;
                if (bxxk == null) {
                    bxxk = new bxve(f157460a);
                    f157461b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
