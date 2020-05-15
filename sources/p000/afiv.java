package p000;

/* renamed from: afiv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afiv extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final afiv f64256b;

    /* renamed from: c */
    private static volatile bxxk f64257c;

    /* renamed from: a */
    public bxwc f64258a = bxxn.f165040b;

    static {
        afiv afiv = new afiv();
        f64256b = afiv;
        GeneratedMessageLite.m124024a(afiv.class, afiv);
    }

    private afiv() {
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
            return GeneratedMessageLite.m124022a(f64256b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", afiu.class});
        } else if (i2 == 3) {
            return new afiv();
        } else {
            if (i2 == 4) {
                return new bxvd((char[]) null);
            }
            if (i2 == 5) {
                return f64256b;
            }
            bxxk bxxk = f64257c;
            if (bxxk == null) {
                synchronized (afiv.class) {
                    bxxk = f64257c;
                    if (bxxk == null) {
                        bxxk = new bxve(f64256b);
                        f64257c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
