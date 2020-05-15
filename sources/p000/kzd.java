package p000;

/* renamed from: kzd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kzd extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final kzd f25441b;

    /* renamed from: c */
    private static volatile bxxk f25442c;

    /* renamed from: a */
    public bxwc f25443a = bxxn.f165040b;

    static {
        kzd kzd = new kzd();
        f25441b = kzd;
        GeneratedMessageLite.m124024a(kzd.class, kzd);
    }

    private kzd() {
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
            return GeneratedMessageLite.m124022a(f25441b, "\u0000\u0001\u0000\u0000\u0004\u0004\u0001\u0000\u0001\u0000\u0004\u001b", new Object[]{"a", kzt.class});
        } else if (i2 == 3) {
            return new kzd();
        } else {
            if (i2 == 4) {
                return new bxvd(f25441b);
            }
            if (i2 == 5) {
                return f25441b;
            }
            bxxk bxxk = f25442c;
            if (bxxk == null) {
                synchronized (kzd.class) {
                    bxxk = f25442c;
                    if (bxxk == null) {
                        bxxk = new bxve(f25441b);
                        f25442c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
