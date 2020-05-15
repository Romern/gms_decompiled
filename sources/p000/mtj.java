package p000;

/* renamed from: mtj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mtj extends bxvk implements bxxd {

    /* renamed from: a */
    public static final mtj f34672a;

    /* renamed from: b */
    private static volatile bxxk f34673b;

    static {
        mtj mtj = new mtj();
        f34672a = mtj;
        bxvk.m124024a(mtj.class, mtj);
    }

    private mtj() {
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
            return bxvk.m124022a(f34672a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new mtj();
        }
        if (i2 == 4) {
            return new bxvd(f34672a);
        }
        if (i2 == 5) {
            return f34672a;
        }
        bxxk bxxk = f34673b;
        if (bxxk == null) {
            synchronized (mtj.class) {
                bxxk = f34673b;
                if (bxxk == null) {
                    bxxk = new bxve(f34672a);
                    f34673b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
