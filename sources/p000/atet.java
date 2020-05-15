package p000;

/* renamed from: atet */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atet extends bxvk implements bxxd {

    /* renamed from: d */
    public static final atet f90202d;

    /* renamed from: e */
    private static volatile bxxk f90203e;

    /* renamed from: a */
    public String f90204a = "";

    /* renamed from: b */
    public bxwc f90205b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f90206c = bxxn.f165040b;

    static {
        atet atet = new atet();
        f90202d = atet;
        bxvk.m124024a(atet.class, atet);
    }

    private atet() {
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
            return bxvk.m124022a(f90202d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001Ȉ\u0002\u001b\u0003\u001b", new Object[]{"a", "b", ates.class, "c", atef.class});
        } else if (i2 == 3) {
            return new atet();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][][]) null, (boolean[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f90202d;
            }
            bxxk bxxk = f90203e;
            if (bxxk == null) {
                synchronized (atet.class) {
                    bxxk = f90203e;
                    if (bxxk == null) {
                        bxxk = new bxve(f90202d);
                        f90203e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
