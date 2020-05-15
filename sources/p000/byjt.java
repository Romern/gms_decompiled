package p000;

/* renamed from: byjt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byjt extends bxvk implements bxxd {

    /* renamed from: a */
    public static final byjt f166698a;

    /* renamed from: b */
    private static volatile bxxk f166699b;

    static {
        byjt byjt = new byjt();
        f166698a = byjt;
        bxvk.m124024a(byjt.class, byjt);
    }

    private byjt() {
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
            return bxvk.m124022a(f166698a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new byjt();
        }
        if (i2 == 4) {
            return new bxvd(f166698a);
        }
        if (i2 == 5) {
            return f166698a;
        }
        bxxk bxxk = f166699b;
        if (bxxk == null) {
            synchronized (byjt.class) {
                bxxk = f166699b;
                if (bxxk == null) {
                    bxxk = new bxve(f166698a);
                    f166699b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
