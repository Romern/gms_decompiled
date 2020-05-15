package p000;

/* renamed from: laq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class laq extends bxvk implements bxxd {

    /* renamed from: d */
    public static final laq f25596d;

    /* renamed from: e */
    private static volatile bxxk f25597e;

    /* renamed from: a */
    public kzx f25598a;

    /* renamed from: b */
    public lbh f25599b;

    /* renamed from: c */
    public bxwc f25600c = bxxn.f165040b;

    static {
        laq laq = new laq();
        f25596d = laq;
        bxvk.m124024a(laq.class, laq);
    }

    private laq() {
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
            return bxvk.m124022a(f25596d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\t\u0002\t\u0003\u001b", new Object[]{"a", "b", "c", lal.class});
        } else if (i2 == 3) {
            return new laq();
        } else {
            if (i2 == 4) {
                return new bxvd(f25596d);
            }
            if (i2 == 5) {
                return f25596d;
            }
            bxxk bxxk = f25597e;
            if (bxxk == null) {
                synchronized (laq.class) {
                    bxxk = f25597e;
                    if (bxxk == null) {
                        bxxk = new bxve(f25596d);
                        f25597e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
