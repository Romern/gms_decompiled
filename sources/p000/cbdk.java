package p000;

/* renamed from: cbdk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbdk extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cbdk f176751b;

    /* renamed from: c */
    private static volatile bxxk f176752c;

    /* renamed from: a */
    public int f176753a;

    static {
        cbdk cbdk = new cbdk();
        f176751b = cbdk;
        bxvk.m124024a(cbdk.class, cbdk);
    }

    private cbdk() {
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
            return bxvk.m124022a(f176751b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbdk();
        } else {
            if (i2 == 4) {
                return new bxvd(f176751b);
            }
            if (i2 == 5) {
                return f176751b;
            }
            bxxk bxxk = f176752c;
            if (bxxk == null) {
                synchronized (cbdk.class) {
                    bxxk = f176752c;
                    if (bxxk == null) {
                        bxxk = new bxve(f176751b);
                        f176752c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
