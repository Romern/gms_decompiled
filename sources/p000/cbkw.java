package p000;

/* renamed from: cbkw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbkw extends bxvk implements bxxd {

    /* renamed from: a */
    public static final cbkw f177451a;

    /* renamed from: b */
    private static volatile bxxk f177452b;

    static {
        cbkw cbkw = new cbkw();
        f177451a = cbkw;
        bxvk.m124024a(cbkw.class, cbkw);
    }

    private cbkw() {
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
            return bxvk.m124022a(f177451a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbkw();
        }
        if (i2 == 4) {
            return new bxvd(f177451a);
        }
        if (i2 == 5) {
            return f177451a;
        }
        bxxk bxxk = f177452b;
        if (bxxk == null) {
            synchronized (cbkw.class) {
                bxxk = f177452b;
                if (bxxk == null) {
                    bxxk = new bxve(f177451a);
                    f177452b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
