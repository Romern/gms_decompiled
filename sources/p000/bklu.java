package p000;

/* renamed from: bklu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bklu extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bklu f124851b;

    /* renamed from: c */
    private static volatile bxxk f124852c;

    /* renamed from: a */
    public bxwc f124853a = bxxn.f165040b;

    static {
        bklu bklu = new bklu();
        f124851b = bklu;
        GeneratedMessageLite.m124024a(bklu.class, bklu);
    }

    private bklu() {
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
            return GeneratedMessageLite.m124022a(f124851b, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u001b", new Object[]{"a", bklv.class});
        } else if (i2 == 3) {
            return new bklu();
        } else {
            if (i2 == 4) {
                return new bxvd(f124851b);
            }
            if (i2 == 5) {
                return f124851b;
            }
            bxxk bxxk = f124852c;
            if (bxxk == null) {
                synchronized (bklu.class) {
                    bxxk = f124852c;
                    if (bxxk == null) {
                        bxxk = new bxve(f124851b);
                        f124852c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
