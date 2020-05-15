package p000;

/* renamed from: byen */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byen extends bxvk implements bxxd {

    /* renamed from: d */
    public static final byen f165925d;

    /* renamed from: e */
    private static volatile bxxk f165926e;

    /* renamed from: a */
    public int f165927a;

    /* renamed from: b */
    public int f165928b;

    /* renamed from: c */
    public int f165929c;

    static {
        byen byen = new byen();
        f165925d = byen;
        bxvk.m124024a(byen.class, byen);
    }

    private byen() {
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
            return bxvk.m124022a(f165925d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဍ\u0000\u0002ဍ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new byen();
        } else {
            if (i2 == 4) {
                return new bxvd(f165925d);
            }
            if (i2 == 5) {
                return f165925d;
            }
            bxxk bxxk = f165926e;
            if (bxxk == null) {
                synchronized (byen.class) {
                    bxxk = f165926e;
                    if (bxxk == null) {
                        bxxk = new bxve(f165925d);
                        f165926e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
