package p000;

/* renamed from: cbbv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbbv extends bxvk implements bxxd {

    /* renamed from: a */
    public static final cbbv f176621a;

    /* renamed from: b */
    private static volatile bxxk f176622b;

    static {
        cbbv cbbv = new cbbv();
        f176621a = cbbv;
        bxvk.m124024a(cbbv.class, cbbv);
    }

    private cbbv() {
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
            return bxvk.m124022a(f176621a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbbv();
        }
        if (i2 == 4) {
            return new bxvd(f176621a);
        }
        if (i2 == 5) {
            return f176621a;
        }
        bxxk bxxk = f176622b;
        if (bxxk == null) {
            synchronized (cbbv.class) {
                bxxk = f176622b;
                if (bxxk == null) {
                    bxxk = new bxve(f176621a);
                    f176622b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
