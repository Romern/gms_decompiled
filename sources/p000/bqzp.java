package p000;

/* renamed from: bqzp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqzp extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bqzp f142073c;

    /* renamed from: d */
    private static volatile bxxk f142074d;

    /* renamed from: a */
    public int f142075a = 0;

    /* renamed from: b */
    public Object f142076b;

    static {
        bqzp bqzp = new bqzp();
        f142073c = bqzp;
        bxvk.m124024a(bqzp.class, bqzp);
    }

    private bqzp() {
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
            return bxvk.m124022a(f142073c, "\u0001\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001်\u0000\u0002ျ\u0000\u0003့\u0000\u0004ဵ\u0000\u0005ဴ\u0000\u0006ဳ\u0000", new Object[]{"b", "a"});
        } else if (i2 == 3) {
            return new bqzp();
        } else {
            if (i2 == 4) {
                return new bxvd(f142073c);
            }
            if (i2 == 5) {
                return f142073c;
            }
            bxxk bxxk = f142074d;
            if (bxxk == null) {
                synchronized (bqzp.class) {
                    bxxk = f142074d;
                    if (bxxk == null) {
                        bxxk = new bxve(f142073c);
                        f142074d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
