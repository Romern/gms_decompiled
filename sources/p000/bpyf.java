package p000;

/* renamed from: bpyf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpyf extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bpyf f139835a;

    /* renamed from: b */
    private static volatile bxxk f139836b;

    static {
        bpyf bpyf = new bpyf();
        f139835a = bpyf;
        bxvk.m124024a(bpyf.class, bpyf);
    }

    private bpyf() {
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
            return bxvk.m124022a(f139835a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bpyf();
        }
        if (i2 == 4) {
            return new bxvd(f139835a);
        }
        if (i2 == 5) {
            return f139835a;
        }
        bxxk bxxk = f139836b;
        if (bxxk == null) {
            synchronized (bpyf.class) {
                bxxk = f139836b;
                if (bxxk == null) {
                    bxxk = new bxve(f139835a);
                    f139836b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
