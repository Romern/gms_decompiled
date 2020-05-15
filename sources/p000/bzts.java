package p000;

/* renamed from: bzts */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzts extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bzts f171367b;

    /* renamed from: c */
    private static volatile bxxk f171368c;

    /* renamed from: a */
    public bztt f171369a;

    static {
        bzts bzts = new bzts();
        f171367b = bzts;
        bxvk.m124024a(bzts.class, bzts);
    }

    private bzts() {
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
            return bxvk.m124022a(f171367b, "\u0000\u0001\u0000\u0000\u0004\u0004\u0001\u0000\u0000\u0000\u0004\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bzts();
        } else {
            if (i2 == 4) {
                return new bxvd(f171367b);
            }
            if (i2 == 5) {
                return f171367b;
            }
            bxxk bxxk = f171368c;
            if (bxxk == null) {
                synchronized (bzts.class) {
                    bxxk = f171368c;
                    if (bxxk == null) {
                        bxxk = new bxve(f171367b);
                        f171368c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
