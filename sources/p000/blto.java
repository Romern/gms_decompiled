package p000;

/* renamed from: blto */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blto extends bxvk implements bxxd {

    /* renamed from: c */
    public static final blto f127722c;

    /* renamed from: d */
    private static volatile bxxk f127723d;

    /* renamed from: a */
    public int f127724a;

    /* renamed from: b */
    public int f127725b;

    static {
        blto blto = new blto();
        f127722c = blto;
        bxvk.m124024a(blto.class, blto);
    }

    private blto() {
        bxvm bxvm = bxvm.f164965b;
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
            return bxvk.m124022a(f127722c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bltm.f127721a});
        } else if (i2 == 3) {
            return new blto();
        } else {
            if (i2 == 4) {
                return new bxvd(f127722c);
            }
            if (i2 == 5) {
                return f127722c;
            }
            bxxk bxxk = f127723d;
            if (bxxk == null) {
                synchronized (blto.class) {
                    bxxk = f127723d;
                    if (bxxk == null) {
                        bxxk = new bxve(f127722c);
                        f127723d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
