package p000;

/* renamed from: cbou */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbou extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cbou f177864b;

    /* renamed from: c */
    private static volatile bxxk f177865c;

    /* renamed from: a */
    public bxwc f177866a = bxxn.f165040b;

    static {
        cbou cbou = new cbou();
        f177864b = cbou;
        bxvk.m124024a(cbou.class, cbou);
    }

    private cbou() {
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
            return bxvk.m124022a(f177864b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", cboq.class});
        } else if (i2 == 3) {
            return new cbou();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][][]) null, (byte[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f177864b;
            }
            bxxk bxxk = f177865c;
            if (bxxk == null) {
                synchronized (cbou.class) {
                    bxxk = f177865c;
                    if (bxxk == null) {
                        bxxk = new bxve(f177864b);
                        f177865c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
