package p000;

/* renamed from: tng */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tng extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final tng f46282b;

    /* renamed from: c */
    private static volatile bxxk f46283c;

    /* renamed from: a */
    public bxwc f46284a = bxxn.f165040b;

    static {
        tng tng = new tng();
        f46282b = tng;
        GeneratedMessageLite.m124024a(tng.class, tng);
    }

    private tng() {
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
            return GeneratedMessageLite.m124022a(f46282b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", tnf.class});
        } else if (i2 == 3) {
            return new tng();
        } else {
            if (i2 == 4) {
                return new bxvd((int[]) null, (byte[][][]) null);
            }
            if (i2 == 5) {
                return f46282b;
            }
            bxxk bxxk = f46283c;
            if (bxxk == null) {
                synchronized (tng.class) {
                    bxxk = f46283c;
                    if (bxxk == null) {
                        bxxk = new bxve(f46282b);
                        f46283c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
