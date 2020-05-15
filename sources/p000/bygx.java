package p000;

/* renamed from: bygx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bygx extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bygx f166401c;

    /* renamed from: d */
    private static volatile bxxk f166402d;

    /* renamed from: a */
    public int f166403a = 0;

    /* renamed from: b */
    public Object f166404b;

    static {
        bygx bygx = new bygx();
        f166401c = bygx;
        bxvk.m124024a(bygx.class, bygx);
    }

    private bygx() {
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
            return bxvk.m124022a(f166401c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", byif.class, byjq.class, byhc.class});
        } else if (i2 == 3) {
            return new bygx();
        } else {
            if (i2 == 4) {
                return new bxvd(f166401c);
            }
            if (i2 == 5) {
                return f166401c;
            }
            bxxk bxxk = f166402d;
            if (bxxk == null) {
                synchronized (bygx.class) {
                    bxxk = f166402d;
                    if (bxxk == null) {
                        bxxk = new bxve(f166401c);
                        f166402d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
