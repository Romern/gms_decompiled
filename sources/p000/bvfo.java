package p000;

/* renamed from: bvfo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvfo extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bvfo f155896a;

    /* renamed from: b */
    private static volatile bxxk f155897b;

    static {
        bvfo bvfo = new bvfo();
        f155896a = bvfo;
        bxvk.m124024a(bvfo.class, bvfo);
    }

    private bvfo() {
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
            return bxvk.m124022a(f155896a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvfo();
        }
        if (i2 == 4) {
            return new bxvd(f155896a);
        }
        if (i2 == 5) {
            return f155896a;
        }
        bxxk bxxk = f155897b;
        if (bxxk == null) {
            synchronized (bvfo.class) {
                bxxk = f155897b;
                if (bxxk == null) {
                    bxxk = new bxve(f155896a);
                    f155897b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
