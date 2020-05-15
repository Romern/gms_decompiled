package p000;

/* renamed from: cbpq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbpq extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cbpq f177946b;

    /* renamed from: c */
    private static volatile bxxk f177947c;

    /* renamed from: a */
    public String f177948a = "";

    static {
        cbpq cbpq = new cbpq();
        f177946b = cbpq;
        bxvk.m124024a(cbpq.class, cbpq);
    }

    private cbpq() {
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
            return bxvk.m124022a(f177946b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbpq();
        } else {
            if (i2 == 4) {
                return new bxvd(f177946b);
            }
            if (i2 == 5) {
                return f177946b;
            }
            bxxk bxxk = f177947c;
            if (bxxk == null) {
                synchronized (cbpq.class) {
                    bxxk = f177947c;
                    if (bxxk == null) {
                        bxxk = new bxve(f177946b);
                        f177947c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
