package p000;

/* renamed from: cbea */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbea extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cbea f176814b;

    /* renamed from: c */
    private static volatile bxxk f176815c;

    /* renamed from: a */
    public bxwc f176816a = bxxn.f165040b;

    static {
        cbea cbea = new cbea();
        f176814b = cbea;
        bxvk.m124024a(cbea.class, cbea);
    }

    private cbea() {
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
            return bxvk.m124022a(f176814b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", cbds.class});
        } else if (i2 == 3) {
            return new cbea();
        } else {
            if (i2 == 4) {
                return new cbdz();
            }
            if (i2 == 5) {
                return f176814b;
            }
            bxxk bxxk = f176815c;
            if (bxxk == null) {
                synchronized (cbea.class) {
                    bxxk = f176815c;
                    if (bxxk == null) {
                        bxxk = new bxve(f176814b);
                        f176815c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
