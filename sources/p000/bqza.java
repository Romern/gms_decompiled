package p000;

/* renamed from: bqza */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqza extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bqza f142007d;

    /* renamed from: f */
    private static volatile bxxk f142008f;

    /* renamed from: a */
    public bqzn f142009a;

    /* renamed from: b */
    public bxtx f142010b = bxtx.f164797b;

    /* renamed from: c */
    public int f142011c;

    /* renamed from: e */
    private int f142012e;

    static {
        bqza bqza = new bqza();
        f142007d = bqza;
        bxvk.m124024a(bqza.class, bqza);
    }

    private bqza() {
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
            return bxvk.m124022a(f142007d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ဌ\u0002", new Object[]{"e", "a", "b", "c", bqyy.f142006a});
        } else if (i2 == 3) {
            return new bqza();
        } else {
            if (i2 == 4) {
                return new bxvd(f142007d);
            }
            if (i2 == 5) {
                return f142007d;
            }
            bxxk bxxk = f142008f;
            if (bxxk == null) {
                synchronized (bqza.class) {
                    bxxk = f142008f;
                    if (bxxk == null) {
                        bxxk = new bxve(f142007d);
                        f142008f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
