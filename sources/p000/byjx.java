package p000;

/* renamed from: byjx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byjx extends bxvk implements bxxd {

    /* renamed from: c */
    public static final byjx f166706c;

    /* renamed from: d */
    private static volatile bxxk f166707d;

    /* renamed from: a */
    public int f166708a = 0;

    /* renamed from: b */
    public Object f166709b;

    static {
        byjx byjx = new byjx();
        f166706c = byjx;
        bxvk.m124024a(byjx.class, byjx);
    }

    private byjx() {
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
            return bxvk.m124022a(f166706c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001း\u0000", new Object[]{"b", "a"});
        } else if (i2 == 3) {
            return new byjx();
        } else {
            if (i2 == 4) {
                return new bxvd(f166706c);
            }
            if (i2 == 5) {
                return f166706c;
            }
            bxxk bxxk = f166707d;
            if (bxxk == null) {
                synchronized (byjx.class) {
                    bxxk = f166707d;
                    if (bxxk == null) {
                        bxxk = new bxve(f166706c);
                        f166707d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
