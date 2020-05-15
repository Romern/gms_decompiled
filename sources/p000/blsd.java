package p000;

/* renamed from: blsd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blsd extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final blsd f127565c;

    /* renamed from: e */
    private static volatile bxxk f127566e;

    /* renamed from: a */
    public bxwc f127567a = bxxn.f165040b;

    /* renamed from: b */
    public int f127568b;

    /* renamed from: d */
    private int f127569d;

    static {
        blsd blsd = new blsd();
        f127565c = blsd;
        GeneratedMessageLite.m124024a(blsd.class, blsd);
    }

    private blsd() {
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
            return GeneratedMessageLite.m124022a(f127565c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဌ\u0000", new Object[]{"d", "a", blse.class, "b", blsb.f127564a});
        } else if (i2 == 3) {
            return new blsd();
        } else {
            if (i2 == 4) {
                return new bxvd(f127565c);
            }
            if (i2 == 5) {
                return f127565c;
            }
            bxxk bxxk = f127566e;
            if (bxxk == null) {
                synchronized (blsd.class) {
                    bxxk = f127566e;
                    if (bxxk == null) {
                        bxxk = new bxve(f127565c);
                        f127566e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
