package p000;

/* renamed from: bmfr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmfr extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bmfr f129152b;

    /* renamed from: c */
    private static volatile bxxk f129153c;

    /* renamed from: a */
    public bxwc f129154a = bxxn.f165040b;

    static {
        bmfr bmfr = new bmfr();
        f129152b = bmfr;
        GeneratedMessageLite.m124024a(bmfr.class, bmfr);
    }

    private bmfr() {
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
            return GeneratedMessageLite.m124022a(f129152b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bmfo.class});
        } else if (i2 == 3) {
            return new bmfr();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][][]) null, (float[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f129152b;
            }
            bxxk bxxk = f129153c;
            if (bxxk == null) {
                synchronized (bmfr.class) {
                    bxxk = f129153c;
                    if (bxxk == null) {
                        bxxk = new bxve(f129152b);
                        f129153c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
