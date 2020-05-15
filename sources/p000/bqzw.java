package p000;

/* renamed from: bqzw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqzw extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bqzw f142100b;

    /* renamed from: d */
    private static volatile bxxk f142101d;

    /* renamed from: a */
    public boolean f142102a;

    /* renamed from: c */
    private int f142103c;

    static {
        bqzw bqzw = new bqzw();
        f142100b = bqzw;
        bxvk.m124024a(bqzw.class, bqzw);
    }

    private bqzw() {
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
            return bxvk.m124022a(f142100b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bqzw();
        } else {
            if (i2 == 4) {
                return new bxvd(f142100b);
            }
            if (i2 == 5) {
                return f142100b;
            }
            bxxk bxxk = f142101d;
            if (bxxk == null) {
                synchronized (bqzw.class) {
                    bxxk = f142101d;
                    if (bxxk == null) {
                        bxxk = new bxve(f142100b);
                        f142101d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
