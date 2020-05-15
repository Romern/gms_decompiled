package p000;

/* renamed from: bgvu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgvu extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bgvu f117746d;

    /* renamed from: f */
    private static volatile bxxk f117747f;

    /* renamed from: a */
    public int f117748a;

    /* renamed from: b */
    public int f117749b;

    /* renamed from: c */
    public int f117750c;

    /* renamed from: e */
    private byte f117751e = 2;

    static {
        bgvu bgvu = new bgvu();
        f117746d = bgvu;
        GeneratedMessageLite.m124024a(bgvu.class, bgvu);
    }

    private bgvu() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f117751e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f117751e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f117746d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔄ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bgvu();
        } else {
            if (i2 == 4) {
                return new bxvd(f117746d);
            }
            if (i2 == 5) {
                return f117746d;
            }
            bxxk bxxk = f117747f;
            if (bxxk == null) {
                synchronized (bgvu.class) {
                    bxxk = f117747f;
                    if (bxxk == null) {
                        bxxk = new bxve(f117746d);
                        f117747f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
