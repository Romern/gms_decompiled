package p000;

/* renamed from: blac */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blac extends bxvk implements bxxd {

    /* renamed from: a */
    public static final blac f125735a;

    /* renamed from: e */
    private static volatile bxxk f125736e;

    /* renamed from: b */
    private int f125737b;

    /* renamed from: c */
    private int f125738c;

    /* renamed from: d */
    private byte f125739d = 2;

    static {
        blac blac = new blac();
        f125735a = blac;
        bxvk.m124024a(blac.class, blac);
    }

    private blac() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f125739d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f125739d = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f125735a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔌ\u0000", new Object[]{"b", "c", blfy.f126415a});
        } else if (i2 == 3) {
            return new blac();
        } else {
            if (i2 == 4) {
                return new bxvd(f125735a);
            }
            if (i2 == 5) {
                return f125735a;
            }
            bxxk bxxk = f125736e;
            if (bxxk == null) {
                synchronized (blac.class) {
                    bxxk = f125736e;
                    if (bxxk == null) {
                        bxxk = new bxve(f125735a);
                        f125736e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
