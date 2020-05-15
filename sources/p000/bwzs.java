package p000;

/* renamed from: bwzs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwzs extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bwzs f161639b;

    /* renamed from: c */
    private static volatile bxxk f161640c;

    /* renamed from: a */
    public bxvw f161641a = bxwq.f165002b;

    static {
        bwzs bwzs = new bwzs();
        f161639b = bwzs;
        bxvk.m124024a(bwzs.class, bwzs);
    }

    private bwzs() {
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
            return bxvk.m124022a(f161639b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0014", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bwzs();
        } else {
            if (i2 == 4) {
                return new bxvd(f161639b);
            }
            if (i2 == 5) {
                return f161639b;
            }
            bxxk bxxk = f161640c;
            if (bxxk == null) {
                synchronized (bwzs.class) {
                    bxxk = f161640c;
                    if (bxxk == null) {
                        bxxk = new bxve(f161639b);
                        f161640c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
