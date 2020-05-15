package p000;

/* renamed from: blrp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blrp extends bxvk implements bxxd {

    /* renamed from: a */
    public static final blrp f127501a;

    /* renamed from: c */
    private static volatile bxxk f127502c;

    /* renamed from: b */
    private byte f127503b = 2;

    static {
        blrp blrp = new blrp();
        f127501a = blrp;
        bxvk.m124024a(blrp.class, blrp);
    }

    private blrp() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f127503b);
        }
        byte b = 1;
        if (i2 == 1) {
            if (obj == null) {
                b = 0;
            }
            this.f127503b = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f127501a, "\u0001\u0000", (Object[]) null);
        } else {
            if (i2 == 3) {
                return new blrp();
            }
            if (i2 == 4) {
                return new bxvd(f127501a);
            }
            if (i2 == 5) {
                return f127501a;
            }
            bxxk bxxk = f127502c;
            if (bxxk == null) {
                synchronized (blrp.class) {
                    bxxk = f127502c;
                    if (bxxk == null) {
                        bxxk = new bxve(f127501a);
                        f127502c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
