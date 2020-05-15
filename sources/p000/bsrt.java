package p000;

/* renamed from: bsrt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsrt extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bsrt f146797a;

    /* renamed from: b */
    private static volatile bxxk f146798b;

    static {
        bsrt bsrt = new bsrt();
        f146797a = bsrt;
        bxvk.m124024a(bsrt.class, bsrt);
    }

    private bsrt() {
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
            return bxvk.m124022a(f146797a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bsrt();
        }
        if (i2 == 4) {
            return new bxvd(f146797a);
        }
        if (i2 == 5) {
            return f146797a;
        }
        bxxk bxxk = f146798b;
        if (bxxk == null) {
            synchronized (bsrt.class) {
                bxxk = f146798b;
                if (bxxk == null) {
                    bxxk = new bxve(f146797a);
                    f146798b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
