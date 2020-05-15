package p000;

/* renamed from: cbnq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbnq extends bxvk implements bxxd {

    /* renamed from: a */
    public static final cbnq f177748a;

    /* renamed from: b */
    private static volatile bxxk f177749b;

    static {
        cbnq cbnq = new cbnq();
        f177748a = cbnq;
        bxvk.m124024a(cbnq.class, cbnq);
    }

    private cbnq() {
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
            return bxvk.m124022a(f177748a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbnq();
        }
        if (i2 == 4) {
            return new bxvd(f177748a);
        }
        if (i2 == 5) {
            return f177748a;
        }
        bxxk bxxk = f177749b;
        if (bxxk == null) {
            synchronized (cbnq.class) {
                bxxk = f177749b;
                if (bxxk == null) {
                    bxxk = new bxve(f177748a);
                    f177749b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
