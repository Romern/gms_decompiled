package p000;

/* renamed from: bvpv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvpv extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bvpv f157347a;

    /* renamed from: b */
    private static volatile bxxk f157348b;

    static {
        bvpv bvpv = new bvpv();
        f157347a = bvpv;
        bxvk.m124024a(bvpv.class, bvpv);
    }

    private bvpv() {
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
            return bxvk.m124022a(f157347a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvpv();
        }
        if (i2 == 4) {
            return new bxvd(f157347a);
        }
        if (i2 == 5) {
            return f157347a;
        }
        bxxk bxxk = f157348b;
        if (bxxk == null) {
            synchronized (bvpv.class) {
                bxxk = f157348b;
                if (bxxk == null) {
                    bxxk = new bxve(f157347a);
                    f157348b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
