package p000;

/* renamed from: cabq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cabq extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cabq f172465b;

    /* renamed from: c */
    private static volatile bxxk f172466c;

    /* renamed from: a */
    public bxwc f172467a = bxxn.f165040b;

    static {
        cabq cabq = new cabq();
        f172465b = cabq;
        bxvk.m124024a(cabq.class, cabq);
    }

    private cabq() {
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
            return bxvk.m124022a(f172465b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", cabo.class});
        } else if (i2 == 3) {
            return new cabq();
        } else {
            if (i2 == 4) {
                return new cabp();
            }
            if (i2 == 5) {
                return f172465b;
            }
            bxxk bxxk = f172466c;
            if (bxxk == null) {
                synchronized (cabq.class) {
                    bxxk = f172466c;
                    if (bxxk == null) {
                        bxxk = new bxve(f172465b);
                        f172466c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
