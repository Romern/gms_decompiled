package p000;

/* renamed from: blpt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blpt extends bxvk implements bxxd {

    /* renamed from: a */
    public static final blpt f127292a;

    /* renamed from: c */
    private static volatile bxxk f127293c;

    /* renamed from: b */
    private byte f127294b = 2;

    static {
        blpt blpt = new blpt();
        f127292a = blpt;
        bxvk.m124024a(blpt.class, blpt);
    }

    private blpt() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f127294b);
        }
        byte b = 1;
        if (i2 == 1) {
            if (obj == null) {
                b = 0;
            }
            this.f127294b = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f127292a, "\u0001\u0000", (Object[]) null);
        } else {
            if (i2 == 3) {
                return new blpt();
            }
            if (i2 == 4) {
                return new bxvd(f127292a);
            }
            if (i2 == 5) {
                return f127292a;
            }
            bxxk bxxk = f127293c;
            if (bxxk == null) {
                synchronized (blpt.class) {
                    bxxk = f127293c;
                    if (bxxk == null) {
                        bxxk = new bxve(f127292a);
                        f127293c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
