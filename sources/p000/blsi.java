package p000;

/* renamed from: blsi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blsi extends bxvk implements bxxd {

    /* renamed from: b */
    public static final blsi f127580b;

    /* renamed from: e */
    private static volatile bxxk f127581e;

    /* renamed from: a */
    public int f127582a;

    /* renamed from: c */
    private int f127583c;

    /* renamed from: d */
    private byte f127584d = 2;

    static {
        blsi blsi = new blsi();
        f127580b = blsi;
        bxvk.m124024a(blsi.class, blsi);
    }

    private blsi() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f127584d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f127584d = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f127580b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔌ\u0000", new Object[]{"c", "a", blsg.f127579a});
        } else if (i2 == 3) {
            return new blsi();
        } else {
            if (i2 == 4) {
                return new bxvd(f127580b);
            }
            if (i2 == 5) {
                return f127580b;
            }
            bxxk bxxk = f127581e;
            if (bxxk == null) {
                synchronized (blsi.class) {
                    bxxk = f127581e;
                    if (bxxk == null) {
                        bxxk = new bxve(f127580b);
                        f127581e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
