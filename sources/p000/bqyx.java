package p000;

/* renamed from: bqyx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqyx extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bqyx f142002b;

    /* renamed from: d */
    private static volatile bxxk f142003d;

    /* renamed from: a */
    public int f142004a;

    /* renamed from: c */
    private int f142005c;

    static {
        bqyx bqyx = new bqyx();
        f142002b = bqyx;
        bxvk.m124024a(bqyx.class, bqyx);
    }

    private bqyx() {
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
            return bxvk.m124022a(f142002b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", bqyv.f142001a});
        } else if (i2 == 3) {
            return new bqyx();
        } else {
            if (i2 == 4) {
                return new bxvd(f142002b);
            }
            if (i2 == 5) {
                return f142002b;
            }
            bxxk bxxk = f142003d;
            if (bxxk == null) {
                synchronized (bqyx.class) {
                    bxxk = f142003d;
                    if (bxxk == null) {
                        bxxk = new bxve(f142002b);
                        f142003d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
