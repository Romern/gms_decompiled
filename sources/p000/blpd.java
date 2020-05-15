package p000;

/* renamed from: blpd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blpd extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final blpd f127200d;

    /* renamed from: f */
    private static volatile bxxk f127201f;

    /* renamed from: a */
    public int f127202a;

    /* renamed from: b */
    public blrk f127203b;

    /* renamed from: c */
    public bxwc f127204c = bxxn.f165040b;

    /* renamed from: e */
    private byte f127205e = 2;

    static {
        blpd blpd = new blpd();
        f127200d = blpd;
        GeneratedMessageLite.m124024a(blpd.class, blpd);
    }

    private blpd() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f127205e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f127205e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f127200d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л", new Object[]{"a", "b", "c", blpc.class});
        } else if (i2 == 3) {
            return new blpd();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][][]) null, (byte[][][]) null);
            }
            if (i2 == 5) {
                return f127200d;
            }
            bxxk bxxk = f127201f;
            if (bxxk == null) {
                synchronized (blpd.class) {
                    bxxk = f127201f;
                    if (bxxk == null) {
                        bxxk = new bxve(f127200d);
                        f127201f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
