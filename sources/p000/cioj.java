package p000;

/* renamed from: cioj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cioj extends bxvk implements bxxd {

    /* renamed from: a */
    public static final cioj f191075a;

    /* renamed from: b */
    private static volatile bxxk f191076b;

    static {
        cioj cioj = new cioj();
        f191075a = cioj;
        bxvk.m124024a(cioj.class, cioj);
    }

    private cioj() {
        bxxn bxxn = bxxn.f165040b;
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
            return bxvk.m124022a(f191075a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cioj();
        }
        if (i2 == 4) {
            return new bxvd(f191075a);
        }
        if (i2 == 5) {
            return f191075a;
        }
        bxxk bxxk = f191076b;
        if (bxxk == null) {
            synchronized (cioj.class) {
                bxxk = f191076b;
                if (bxxk == null) {
                    bxxk = new bxve(f191075a);
                    f191076b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
