package p000;

/* renamed from: bvrz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvrz extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bvrz f157472a;

    /* renamed from: b */
    private static volatile bxxk f157473b;

    static {
        bvrz bvrz = new bvrz();
        f157472a = bvrz;
        bxvk.m124024a(bvrz.class, bvrz);
    }

    private bvrz() {
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
            return bxvk.m124022a(f157472a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvrz();
        }
        if (i2 == 4) {
            return new bxvd(f157472a);
        }
        if (i2 == 5) {
            return f157472a;
        }
        bxxk bxxk = f157473b;
        if (bxxk == null) {
            synchronized (bvrz.class) {
                bxxk = f157473b;
                if (bxxk == null) {
                    bxxk = new bxve(f157472a);
                    f157473b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
