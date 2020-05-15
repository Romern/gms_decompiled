package p000;

/* renamed from: bion */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bion extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bion f121069d;

    /* renamed from: g */
    private static volatile bxxk f121070g;

    /* renamed from: a */
    public int f121071a = 1;

    /* renamed from: b */
    public int f121072b;

    /* renamed from: c */
    public bity f121073c;

    /* renamed from: e */
    private int f121074e;

    /* renamed from: f */
    private byte f121075f = 2;

    static {
        bion bion = new bion();
        f121069d = bion;
        bxvk.m124024a(bion.class, bion);
    }

    private bion() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121075f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121075f = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f121069d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ဌ\u0000\u0002ᔄ\u0001\u0003ᐉ\u0002", new Object[]{"e", "a", bisf.m102782b(), "b", "c"});
        } else if (i2 == 3) {
            return new bion();
        } else {
            if (i2 == 4) {
                return new bxvd(f121069d);
            }
            if (i2 == 5) {
                return f121069d;
            }
            bxxk bxxk = f121070g;
            if (bxxk == null) {
                synchronized (bion.class) {
                    bxxk = f121070g;
                    if (bxxk == null) {
                        bxxk = new bxve(f121069d);
                        f121070g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
