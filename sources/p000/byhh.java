package p000;

/* renamed from: byhh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byhh extends bxvk implements bxxd {

    /* renamed from: c */
    public static final byhh f166447c;

    /* renamed from: d */
    private static volatile bxxk f166448d;

    /* renamed from: a */
    public int f166449a = 0;

    /* renamed from: b */
    public Object f166450b;

    static {
        byhh byhh = new byhh();
        f166447c = byhh;
        bxvk.m124024a(byhh.class, byhh);
    }

    private byhh() {
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
            return bxvk.m124022a(f166447c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", byhf.class, byhg.class, bxuo.class});
        } else if (i2 == 3) {
            return new byhh();
        } else {
            if (i2 == 4) {
                return new bxvd(f166447c);
            }
            if (i2 == 5) {
                return f166447c;
            }
            bxxk bxxk = f166448d;
            if (bxxk == null) {
                synchronized (byhh.class) {
                    bxxk = f166448d;
                    if (bxxk == null) {
                        bxxk = new bxve(f166447c);
                        f166448d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
