package p000;

/* renamed from: bxzy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxzy extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bxzy f165208b;

    /* renamed from: c */
    private static volatile bxxk f165209c;

    /* renamed from: a */
    public bxyk f165210a;

    static {
        bxzy bxzy = new bxzy();
        f165208b = bxzy;
        bxvk.m124024a(bxzy.class, bxzy);
    }

    private bxzy() {
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
            return bxvk.m124022a(f165208b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bxzy();
        } else {
            if (i2 == 4) {
                return new bxvd(f165208b);
            }
            if (i2 == 5) {
                return f165208b;
            }
            bxxk bxxk = f165209c;
            if (bxxk == null) {
                synchronized (bxzy.class) {
                    bxxk = f165209c;
                    if (bxxk == null) {
                        bxxk = new bxve(f165208b);
                        f165209c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
