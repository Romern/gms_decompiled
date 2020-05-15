package p000;

/* renamed from: btmb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btmb extends bxvk implements bxxd {

    /* renamed from: b */
    public static final btmb f149462b;

    /* renamed from: c */
    private static volatile bxxk f149463c;

    /* renamed from: a */
    public bxwc f149464a = bxxn.f165040b;

    static {
        btmb btmb = new btmb();
        f149462b = btmb;
        bxvk.m124024a(btmb.class, btmb);
    }

    private btmb() {
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
            return bxvk.m124022a(f149462b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", btma.class});
        } else if (i2 == 3) {
            return new btmb();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][][]) null, (float[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f149462b;
            }
            bxxk bxxk = f149463c;
            if (bxxk == null) {
                synchronized (btmb.class) {
                    bxxk = f149463c;
                    if (bxxk == null) {
                        bxxk = new bxve(f149462b);
                        f149463c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
