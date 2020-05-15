package p000;

/* renamed from: byki */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byki extends bxvk implements bxxd {

    /* renamed from: d */
    public static final byki f166757d;

    /* renamed from: e */
    private static volatile bxxk f166758e;

    /* renamed from: a */
    public int f166759a;

    /* renamed from: b */
    public bxun f166760b;

    /* renamed from: c */
    public bxun f166761c;

    static {
        byki byki = new byki();
        f166757d = byki;
        bxvk.m124024a(byki.class, byki);
    }

    private byki() {
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
            return bxvk.m124022a(f166757d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new byki();
        } else {
            if (i2 == 4) {
                return new bxvd(f166757d);
            }
            if (i2 == 5) {
                return f166757d;
            }
            bxxk bxxk = f166758e;
            if (bxxk == null) {
                synchronized (byki.class) {
                    bxxk = f166758e;
                    if (bxxk == null) {
                        bxxk = new bxve(f166757d);
                        f166758e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
