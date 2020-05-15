package p000;

/* renamed from: bqst */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqst extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bqst f141568b;

    /* renamed from: c */
    private static volatile bxxk f141569c;

    /* renamed from: a */
    public int f141570a;

    static {
        bqst bqst = new bqst();
        f141568b = bqst;
        bxvk.m124024a(bqst.class, bqst);
    }

    private bqst() {
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
            return bxvk.m124022a(f141568b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bqst();
        } else {
            if (i2 == 4) {
                return new bxvd(f141568b);
            }
            if (i2 == 5) {
                return f141568b;
            }
            bxxk bxxk = f141569c;
            if (bxxk == null) {
                synchronized (bqst.class) {
                    bxxk = f141569c;
                    if (bxxk == null) {
                        bxxk = new bxve(f141568b);
                        f141569c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
