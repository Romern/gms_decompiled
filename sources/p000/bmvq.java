package p000;

/* renamed from: bmvq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmvq extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bmvq f131083d;

    /* renamed from: e */
    private static volatile bxxk f131084e;

    /* renamed from: a */
    public int f131085a;

    /* renamed from: b */
    public String f131086b = "";

    /* renamed from: c */
    public String f131087c = "";

    static {
        bmvq bmvq = new bmvq();
        f131083d = bmvq;
        GeneratedMessageLite.m124024a(bmvq.class, bmvq);
    }

    private bmvq() {
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
            return GeneratedMessageLite.m124022a(f131083d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bmvq();
        } else {
            if (i2 == 4) {
                return new bxvd(f131083d);
            }
            if (i2 == 5) {
                return f131083d;
            }
            bxxk bxxk = f131084e;
            if (bxxk == null) {
                synchronized (bmvq.class) {
                    bxxk = f131084e;
                    if (bxxk == null) {
                        bxxk = new bxve(f131083d);
                        f131084e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
