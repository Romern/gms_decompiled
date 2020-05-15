package p000;

/* renamed from: btcr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btcr extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final btcr f148306b;

    /* renamed from: d */
    private static volatile bxxk f148307d;

    /* renamed from: a */
    public bler f148308a;

    /* renamed from: c */
    private byte f148309c = 2;

    static {
        btcr btcr = new btcr();
        f148306b = btcr;
        GeneratedMessageLite.m124024a(btcr.class, btcr);
    }

    private btcr() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f148309c);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f148309c = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f148306b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new btcr();
        } else {
            if (i2 == 4) {
                return new bxvd(f148306b);
            }
            if (i2 == 5) {
                return f148306b;
            }
            bxxk bxxk = f148307d;
            if (bxxk == null) {
                synchronized (btcr.class) {
                    bxxk = f148307d;
                    if (bxxk == null) {
                        bxxk = new bxve(f148306b);
                        f148307d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
