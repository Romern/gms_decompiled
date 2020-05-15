package p000;

/* renamed from: bltb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bltb extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bltb f127660b;

    /* renamed from: c */
    private static volatile bxxk f127661c;

    /* renamed from: a */
    public bxwc f127662a = bxxn.f165040b;

    static {
        bltb bltb = new bltb();
        f127660b = bltb;
        bxvk.m124024a(bltb.class, bltb);
    }

    private bltb() {
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
            return bxvk.m124022a(f127660b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", blta.class});
        } else if (i2 == 3) {
            return new bltb();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][]) null, (short[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f127660b;
            }
            bxxk bxxk = f127661c;
            if (bxxk == null) {
                synchronized (bltb.class) {
                    bxxk = f127661c;
                    if (bxxk == null) {
                        bxxk = new bxve(f127660b);
                        f127661c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
