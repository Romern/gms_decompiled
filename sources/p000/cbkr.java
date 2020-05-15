package p000;

/* renamed from: cbkr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbkr extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final cbkr f177440b;

    /* renamed from: c */
    private static volatile bxxk f177441c;

    /* renamed from: a */
    public cbmo f177442a;

    static {
        cbkr cbkr = new cbkr();
        f177440b = cbkr;
        GeneratedMessageLite.m124024a(cbkr.class, cbkr);
    }

    private cbkr() {
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
            return GeneratedMessageLite.m124022a(f177440b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbkr();
        } else {
            if (i2 == 4) {
                return new bxvd(f177440b);
            }
            if (i2 == 5) {
                return f177440b;
            }
            bxxk bxxk = f177441c;
            if (bxxk == null) {
                synchronized (cbkr.class) {
                    bxxk = f177441c;
                    if (bxxk == null) {
                        bxxk = new bxve(f177440b);
                        f177441c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
