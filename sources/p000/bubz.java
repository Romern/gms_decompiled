package p000;

/* renamed from: bubz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bubz extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bubz f153308b;

    /* renamed from: c */
    private static volatile bxxk f153309c;

    /* renamed from: a */
    public bxwc f153310a = bxxn.f165040b;

    static {
        bubz bubz = new bubz();
        f153308b = bubz;
        GeneratedMessageLite.m124024a(bubz.class, bubz);
    }

    private bubz() {
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
            return GeneratedMessageLite.m124022a(f153308b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bucn.class});
        } else if (i2 == 3) {
            return new bubz();
        } else {
            if (i2 == 4) {
                return new bxvd(f153308b);
            }
            if (i2 == 5) {
                return f153308b;
            }
            bxxk bxxk = f153309c;
            if (bxxk == null) {
                synchronized (bubz.class) {
                    bxxk = f153309c;
                    if (bxxk == null) {
                        bxxk = new bxve(f153308b);
                        f153309c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
