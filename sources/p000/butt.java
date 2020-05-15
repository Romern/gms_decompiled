package p000;

/* renamed from: butt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class butt extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final butt f154868e;

    /* renamed from: f */
    private static volatile bxxk f154869f;

    /* renamed from: a */
    public int f154870a;

    /* renamed from: b */
    public String f154871b = "";

    /* renamed from: c */
    public ByteString f154872c = ByteString.f164797b;

    /* renamed from: d */
    public String f154873d = "";

    static {
        butt butt = new butt();
        f154868e = butt;
        GeneratedMessageLite.m124024a(butt.class, butt);
    }

    private butt() {
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
            return GeneratedMessageLite.m124022a(f154868e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new butt();
        } else {
            if (i2 == 4) {
                return new bxvd(f154868e);
            }
            if (i2 == 5) {
                return f154868e;
            }
            bxxk bxxk = f154869f;
            if (bxxk == null) {
                synchronized (butt.class) {
                    bxxk = f154869f;
                    if (bxxk == null) {
                        bxxk = new bxve(f154868e);
                        f154869f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
