package p000;

/* renamed from: cbiy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbiy extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cbiy f177312b;

    /* renamed from: c */
    private static volatile bxxk f177313c;

    /* renamed from: a */
    public bxwc f177314a = bxxn.f165040b;

    static {
        cbiy cbiy = new cbiy();
        f177312b = cbiy;
        bxvk.m124024a(cbiy.class, cbiy);
    }

    private cbiy() {
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
            return bxvk.m124022a(f177312b, "\u0000\u0001\u0000\u0000\u0005\u0005\u0001\u0000\u0001\u0000\u0005Ț", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbiy();
        } else {
            if (i2 == 4) {
                return new bxvd(f177312b);
            }
            if (i2 == 5) {
                return f177312b;
            }
            bxxk bxxk = f177313c;
            if (bxxk == null) {
                synchronized (cbiy.class) {
                    bxxk = f177313c;
                    if (bxxk == null) {
                        bxxk = new bxve(f177312b);
                        f177313c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
