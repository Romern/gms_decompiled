package p000;

/* renamed from: adio */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adio extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final adio f61822c;

    /* renamed from: d */
    private static volatile bxxk f61823d;

    /* renamed from: a */
    public int f61824a;

    /* renamed from: b */
    public long f61825b;

    static {
        adio adio = new adio();
        f61822c = adio;
        GeneratedMessageLite.m124024a(adio.class, adio);
    }

    private adio() {
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
            return GeneratedMessageLite.m124022a(f61822c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0002", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new adio();
        } else {
            if (i2 == 4) {
                return new bxvd(f61822c);
            }
            if (i2 == 5) {
                return f61822c;
            }
            bxxk bxxk = f61823d;
            if (bxxk == null) {
                synchronized (adio.class) {
                    bxxk = f61823d;
                    if (bxxk == null) {
                        bxxk = new bxve(f61822c);
                        f61823d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
