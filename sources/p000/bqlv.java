package p000;

/* renamed from: bqlv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqlv extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bqlv f141175b;

    /* renamed from: c */
    private static volatile bxxk f141176c;

    /* renamed from: a */
    public bxwc f141177a = bxxn.f165040b;

    static {
        bqlv bqlv = new bqlv();
        f141175b = bqlv;
        GeneratedMessageLite.m124024a(bqlv.class, bqlv);
    }

    private bqlv() {
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
            return GeneratedMessageLite.m124022a(f141175b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bqlo.class});
        } else if (i2 == 3) {
            return new bqlv();
        } else {
            if (i2 == 4) {
                return new bxvd(f141175b);
            }
            if (i2 == 5) {
                return f141175b;
            }
            bxxk bxxk = f141176c;
            if (bxxk == null) {
                synchronized (bqlv.class) {
                    bxxk = f141176c;
                    if (bxxk == null) {
                        bxxk = new bxve(f141175b);
                        f141176c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
