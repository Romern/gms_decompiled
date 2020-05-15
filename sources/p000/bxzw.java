package p000;

/* renamed from: bxzw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxzw extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bxzw f165192d;

    /* renamed from: e */
    private static volatile bxxk f165193e;

    /* renamed from: a */
    public bxtx f165194a = bxtx.f164797b;

    /* renamed from: b */
    public int f165195b;

    /* renamed from: c */
    public bxyk f165196c;

    static {
        bxzw bxzw = new bxzw();
        f165192d = bxzw;
        bxvk.m124024a(bxzw.class, bxzw);
    }

    private bxzw() {
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
            return bxvk.m124022a(f165192d, "\u0000\u0003\u0000\u0000\u0004\u0006\u0003\u0000\u0000\u0000\u0004\n\u0005\f\u0006\t", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bxzw();
        } else {
            if (i2 == 4) {
                return new bxvd(f165192d);
            }
            if (i2 == 5) {
                return f165192d;
            }
            bxxk bxxk = f165193e;
            if (bxxk == null) {
                synchronized (bxzw.class) {
                    bxxk = f165193e;
                    if (bxxk == null) {
                        bxxk = new bxve(f165192d);
                        f165193e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
