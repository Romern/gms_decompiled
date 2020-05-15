package p000;

/* renamed from: byuo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byuo extends bxvk implements bxxd {

    /* renamed from: b */
    public static final byuo f168318b;

    /* renamed from: c */
    private static volatile bxxk f168319c;

    /* renamed from: a */
    public bxwc f168320a = bxxn.f165040b;

    static {
        byuo byuo = new byuo();
        f168318b = byuo;
        bxvk.m124024a(byuo.class, byuo);
    }

    private byuo() {
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
            return bxvk.m124022a(f168318b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", byun.class});
        } else if (i2 == 3) {
            return new byuo();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][][]) null, (char[][][]) null);
            }
            if (i2 == 5) {
                return f168318b;
            }
            bxxk bxxk = f168319c;
            if (bxxk == null) {
                synchronized (byuo.class) {
                    bxxk = f168319c;
                    if (bxxk == null) {
                        bxxk = new bxve(f168318b);
                        f168319c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
