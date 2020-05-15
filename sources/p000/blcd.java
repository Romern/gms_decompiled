package p000;

/* renamed from: blcd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blcd extends bxvg implements bxvh {

    /* renamed from: a */
    public static final blcd f125907a;

    /* renamed from: c */
    private static volatile bxxk f125908c;

    /* renamed from: b */
    private byte f125909b = 2;

    static {
        blcd blcd = new blcd();
        f125907a = blcd;
        bxvk.m124024a(blcd.class, blcd);
    }

    private blcd() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f125909b);
        }
        byte b = 1;
        if (i2 == 1) {
            if (obj == null) {
                b = 0;
            }
            this.f125909b = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f125907a, "\u0001\u0000", (Object[]) null);
        } else {
            if (i2 == 3) {
                return new blcd();
            }
            if (i2 == 4) {
                return new bxvf(f125907a);
            }
            if (i2 == 5) {
                return f125907a;
            }
            bxxk bxxk = f125908c;
            if (bxxk == null) {
                synchronized (blcd.class) {
                    bxxk = f125908c;
                    if (bxxk == null) {
                        bxxk = new bxve(f125907a);
                        f125908c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
