package p000;

/* renamed from: bkjv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkjv extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bkjv f124474b;

    /* renamed from: c */
    private static volatile bxxk f124475c;

    /* renamed from: a */
    public bxwc f124476a = bxxn.f165040b;

    static {
        bkjv bkjv = new bkjv();
        f124474b = bkjv;
        GeneratedMessageLite.m124024a(bkjv.class, bkjv);
    }

    private bkjv() {
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
            return GeneratedMessageLite.m124022a(f124474b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bkjw.class});
        } else if (i2 == 3) {
            return new bkjv();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][]) null, (short[][]) null);
            }
            if (i2 == 5) {
                return f124474b;
            }
            bxxk bxxk = f124475c;
            if (bxxk == null) {
                synchronized (bkjv.class) {
                    bxxk = f124475c;
                    if (bxxk == null) {
                        bxxk = new bxve(f124474b);
                        f124475c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
