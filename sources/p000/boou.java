package p000;

/* renamed from: boou */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boou extends bxvk implements bxxd {

    /* renamed from: b */
    public static final boou f134023b;

    /* renamed from: c */
    private static volatile bxxk f134024c;

    /* renamed from: a */
    public bxwc f134025a = bxxn.f165040b;

    static {
        boou boou = new boou();
        f134023b = boou;
        bxvk.m124024a(boou.class, boou);
    }

    private boou() {
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
            return bxvk.m124022a(f134023b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bopn.class});
        } else if (i2 == 3) {
            return new boou();
        } else {
            if (i2 == 4) {
                return new bxvd((int[]) null, (byte[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f134023b;
            }
            bxxk bxxk = f134024c;
            if (bxxk == null) {
                synchronized (boou.class) {
                    bxxk = f134024c;
                    if (bxxk == null) {
                        bxxk = new bxve(f134023b);
                        f134024c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}