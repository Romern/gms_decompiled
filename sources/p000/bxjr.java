package p000;

/* renamed from: bxjr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxjr extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bxjr f163669b;

    /* renamed from: c */
    private static volatile bxxk f163670c;

    /* renamed from: a */
    public bxwc f163671a = bxxn.f165040b;

    static {
        bxjr bxjr = new bxjr();
        f163669b = bxjr;
        GeneratedMessageLite.m124024a(bxjr.class, bxjr);
    }

    private bxjr() {
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
            return GeneratedMessageLite.m124022a(f163669b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bxhq.class});
        } else if (i2 == 3) {
            return new bxjr();
        } else {
            if (i2 == 4) {
                return new bxvd(f163669b);
            }
            if (i2 == 5) {
                return f163669b;
            }
            bxxk bxxk = f163670c;
            if (bxxk == null) {
                synchronized (bxjr.class) {
                    bxxk = f163670c;
                    if (bxxk == null) {
                        bxxk = new bxve(f163669b);
                        f163670c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
