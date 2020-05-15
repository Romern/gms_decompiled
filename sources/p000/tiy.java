package p000;

/* renamed from: tiy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tiy extends bxvk implements bxxd {

    /* renamed from: b */
    public static final tiy f46165b;

    /* renamed from: c */
    private static volatile bxxk f46166c;

    /* renamed from: a */
    public bxwc f46167a = bxxn.f165040b;

    static {
        tiy tiy = new tiy();
        f46165b = tiy;
        bxvk.m124024a(tiy.class, tiy);
    }

    private tiy() {
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
            return bxvk.m124022a(f46165b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", tix.class});
        } else if (i2 == 3) {
            return new tiy();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f46165b;
            }
            bxxk bxxk = f46166c;
            if (bxxk == null) {
                synchronized (tiy.class) {
                    bxxk = f46166c;
                    if (bxxk == null) {
                        bxxk = new bxve(f46165b);
                        f46166c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
