package p000;

/* renamed from: apzm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apzm extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final apzm f85271c;

    /* renamed from: d */
    private static volatile bxxk f85272d;

    /* renamed from: a */
    public int f85273a;

    /* renamed from: b */
    public String f85274b = "";

    static {
        apzm apzm = new apzm();
        f85271c = apzm;
        GeneratedMessageLite.m124024a(apzm.class, apzm);
    }

    private apzm() {
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
            return GeneratedMessageLite.m124022a(f85271c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new apzm();
        } else {
            if (i2 == 4) {
                return new bxvd(f85271c);
            }
            if (i2 == 5) {
                return f85271c;
            }
            bxxk bxxk = f85272d;
            if (bxxk == null) {
                synchronized (apzm.class) {
                    bxxk = f85272d;
                    if (bxxk == null) {
                        bxxk = new bxve(f85271c);
                        f85272d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
