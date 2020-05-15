package p000;

/* renamed from: bvrc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvrc extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bvrc f157426a;

    /* renamed from: b */
    private static volatile bxxk f157427b;

    static {
        bvrc bvrc = new bvrc();
        f157426a = bvrc;
        bxvk.m124024a(bvrc.class, bvrc);
    }

    private bvrc() {
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
            return bxvk.m124022a(f157426a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvrc();
        }
        if (i2 == 4) {
            return new bxvd(f157426a);
        }
        if (i2 == 5) {
            return f157426a;
        }
        bxxk bxxk = f157427b;
        if (bxxk == null) {
            synchronized (bvrc.class) {
                bxxk = f157427b;
                if (bxxk == null) {
                    bxxk = new bxve(f157426a);
                    f157427b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
