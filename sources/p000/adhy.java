package p000;

/* renamed from: adhy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adhy extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final adhy f61750b;

    /* renamed from: c */
    private static volatile bxxk f61751c;

    /* renamed from: a */
    public boolean f61752a;

    static {
        adhy adhy = new adhy();
        f61750b = adhy;
        GeneratedMessageLite.m124024a(adhy.class, adhy);
    }

    private adhy() {
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
            return GeneratedMessageLite.m124022a(f61750b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"a"});
        } else if (i2 == 3) {
            return new adhy();
        } else {
            if (i2 == 4) {
                return new bxvd(f61750b);
            }
            if (i2 == 5) {
                return f61750b;
            }
            bxxk bxxk = f61751c;
            if (bxxk == null) {
                synchronized (adhy.class) {
                    bxxk = f61751c;
                    if (bxxk == null) {
                        bxxk = new bxve(f61750b);
                        f61751c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
