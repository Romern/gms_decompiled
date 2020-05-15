package p000;

/* renamed from: cbmb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbmb extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cbmb f177598b;

    /* renamed from: c */
    private static volatile bxxk f177599c;

    /* renamed from: a */
    public bxwc f177600a = bxxn.f165040b;

    static {
        cbmb cbmb = new cbmb();
        f177598b = cbmb;
        bxvk.m124024a(cbmb.class, cbmb);
    }

    private cbmb() {
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
            return bxvk.m124022a(f177598b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", cbma.class});
        } else if (i2 == 3) {
            return new cbmb();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][]) null, (char[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f177598b;
            }
            bxxk bxxk = f177599c;
            if (bxxk == null) {
                synchronized (cbmb.class) {
                    bxxk = f177599c;
                    if (bxxk == null) {
                        bxxk = new bxve(f177598b);
                        f177599c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
