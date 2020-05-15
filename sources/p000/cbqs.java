package p000;

/* renamed from: cbqs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbqs extends bxvk implements bxxd {

    /* renamed from: a */
    public static final cbqs f178063a;

    /* renamed from: b */
    private static volatile bxxk f178064b;

    static {
        cbqs cbqs = new cbqs();
        f178063a = cbqs;
        bxvk.m124024a(cbqs.class, cbqs);
    }

    private cbqs() {
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
            return bxvk.m124022a(f178063a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbqs();
        }
        if (i2 == 4) {
            return new bxvd(f178063a);
        }
        if (i2 == 5) {
            return f178063a;
        }
        bxxk bxxk = f178064b;
        if (bxxk == null) {
            synchronized (cbqs.class) {
                bxxk = f178064b;
                if (bxxk == null) {
                    bxxk = new bxve(f178063a);
                    f178064b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
