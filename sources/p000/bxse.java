package p000;

/* renamed from: bxse */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxse extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bxse f164669c;

    /* renamed from: e */
    private static volatile bxxk f164670e;

    /* renamed from: a */
    public int f164671a;

    /* renamed from: b */
    public int f164672b;

    /* renamed from: d */
    private int f164673d;

    static {
        bxse bxse = new bxse();
        f164669c = bxse;
        bxvk.m124024a(bxse.class, bxse);
    }

    private bxse() {
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
            return bxvk.m124022a(f164669c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001", new Object[]{"d", "a", "b", bxsm.f164713a});
        } else if (i2 == 3) {
            return new bxse();
        } else {
            if (i2 == 4) {
                return new bxvd(f164669c);
            }
            if (i2 == 5) {
                return f164669c;
            }
            bxxk bxxk = f164670e;
            if (bxxk == null) {
                synchronized (bxse.class) {
                    bxxk = f164670e;
                    if (bxxk == null) {
                        bxxk = new bxve(f164669c);
                        f164670e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
