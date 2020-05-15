package p000;

/* renamed from: blqy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blqy extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final blqy f127421c;

    /* renamed from: d */
    private static volatile bxxk f127422d;

    /* renamed from: a */
    public int f127423a;

    /* renamed from: b */
    public int f127424b;

    static {
        blqy blqy = new blqy();
        f127421c = blqy;
        GeneratedMessageLite.m124024a(blqy.class, blqy);
    }

    private blqy() {
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
            return GeneratedMessageLite.m124022a(f127421c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", blqx.f127420a});
        } else if (i2 == 3) {
            return new blqy();
        } else {
            if (i2 == 4) {
                return new bxvd(f127421c);
            }
            if (i2 == 5) {
                return f127421c;
            }
            bxxk bxxk = f127422d;
            if (bxxk == null) {
                synchronized (blqy.class) {
                    bxxk = f127422d;
                    if (bxxk == null) {
                        bxxk = new bxve(f127421c);
                        f127422d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
