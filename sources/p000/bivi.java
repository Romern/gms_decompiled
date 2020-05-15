package p000;

/* renamed from: bivi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bivi extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bivi f121988d;

    /* renamed from: g */
    private static volatile bxxk f121989g;

    /* renamed from: a */
    public int f121990a;

    /* renamed from: b */
    public int f121991b;

    /* renamed from: c */
    public int f121992c;

    /* renamed from: e */
    private int f121993e;

    /* renamed from: f */
    private byte f121994f = 2;

    static {
        bivi bivi = new bivi();
        f121988d = bivi;
        bxvk.m124024a(bivi.class, bivi);
    }

    private bivi() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121994f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121994f = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f121988d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᔌ\u0000\u0002ᔄ\u0001\u0003င\u0002", new Object[]{"e", "a", biub.f121765a, "b", "c"});
        } else if (i2 == 3) {
            return new bivi();
        } else {
            if (i2 == 4) {
                return new bxvd(f121988d);
            }
            if (i2 == 5) {
                return f121988d;
            }
            bxxk bxxk = f121989g;
            if (bxxk == null) {
                synchronized (bivi.class) {
                    bxxk = f121989g;
                    if (bxxk == null) {
                        bxxk = new bxve(f121988d);
                        f121989g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
