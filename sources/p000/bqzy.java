package p000;

/* renamed from: bqzy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqzy extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bqzy f142109d;

    /* renamed from: e */
    private static volatile bxxk f142110e;

    /* renamed from: a */
    public int f142111a;

    /* renamed from: b */
    public bqzx f142112b;

    /* renamed from: c */
    public bqzw f142113c;

    static {
        bqzy bqzy = new bqzy();
        f142109d = bqzy;
        bxvk.m124024a(bqzy.class, bqzy);
    }

    private bqzy() {
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
            return bxvk.m124022a(f142109d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bqzy();
        } else {
            if (i2 == 4) {
                return new bxvd(f142109d);
            }
            if (i2 == 5) {
                return f142109d;
            }
            bxxk bxxk = f142110e;
            if (bxxk == null) {
                synchronized (bqzy.class) {
                    bxxk = f142110e;
                    if (bxxk == null) {
                        bxxk = new bxve(f142109d);
                        f142110e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
