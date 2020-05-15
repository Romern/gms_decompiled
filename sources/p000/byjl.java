package p000;

/* renamed from: byjl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byjl extends bxvk implements bxxd {

    /* renamed from: e */
    public static final byjl f166668e;

    /* renamed from: g */
    private static volatile bxxk f166669g;

    /* renamed from: a */
    public byjk f166670a;

    /* renamed from: b */
    public byjk f166671b;

    /* renamed from: c */
    public byjk f166672c;

    /* renamed from: d */
    public byjk f166673d;

    /* renamed from: f */
    private int f166674f;

    static {
        byjl byjl = new byjl();
        f166668e = byjl;
        bxvk.m124024a(byjl.class, byjl);
    }

    private byjl() {
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
            return bxvk.m124022a(f166668e, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"f", "a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new byjl();
        } else {
            if (i2 == 4) {
                return new bxvd(f166668e);
            }
            if (i2 == 5) {
                return f166668e;
            }
            bxxk bxxk = f166669g;
            if (bxxk == null) {
                synchronized (byjl.class) {
                    bxxk = f166669g;
                    if (bxxk == null) {
                        bxxk = new bxve(f166668e);
                        f166669g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
