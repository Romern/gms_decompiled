package p000;

/* renamed from: cbjv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbjv extends bxvk implements bxxd {

    /* renamed from: a */
    public static final cbjv f177371a;

    /* renamed from: b */
    private static volatile bxxk f177372b;

    static {
        cbjv cbjv = new cbjv();
        f177371a = cbjv;
        bxvk.m124024a(cbjv.class, cbjv);
    }

    private cbjv() {
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
            return bxvk.m124022a(f177371a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbjv();
        }
        if (i2 == 4) {
            return new bxvd(f177371a);
        }
        if (i2 == 5) {
            return f177371a;
        }
        bxxk bxxk = f177372b;
        if (bxxk == null) {
            synchronized (cbjv.class) {
                bxxk = f177372b;
                if (bxxk == null) {
                    bxxk = new bxve(f177371a);
                    f177372b = bxxk;
                }
            }
        }
        return bxxk;
    }
}