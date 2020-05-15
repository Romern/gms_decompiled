package p000;

/* renamed from: bqqs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqqs extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bqqs f141377d;

    /* renamed from: e */
    private static volatile bxxk f141378e;

    /* renamed from: a */
    public int f141379a;

    /* renamed from: b */
    public bxtx f141380b = bxtx.f164797b;

    /* renamed from: c */
    public bqqu f141381c;

    static {
        bqqs bqqs = new bqqs();
        f141377d = bqqs;
        bxvk.m124024a(bqqs.class, bqqs);
    }

    private bqqs() {
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
            return bxvk.m124022a(f141377d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bqqs();
        } else {
            if (i2 == 4) {
                return new bxvd(f141377d);
            }
            if (i2 == 5) {
                return f141377d;
            }
            bxxk bxxk = f141378e;
            if (bxxk == null) {
                synchronized (bqqs.class) {
                    bxxk = f141378e;
                    if (bxxk == null) {
                        bxxk = new bxve(f141377d);
                        f141378e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
