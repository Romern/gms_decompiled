package p000;

/* renamed from: ayjy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayjy extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final ayjy f97807b;

    /* renamed from: d */
    private static volatile bxxk f97808d;

    /* renamed from: a */
    public bxwc f97809a = bxxn.f165040b;

    /* renamed from: c */
    private byte f97810c = 2;

    static {
        ayjy ayjy = new ayjy();
        f97807b = ayjy;
        GeneratedMessageLite.m124024a(ayjy.class, ayjy);
    }

    private ayjy() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f97810c);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f97810c = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f97807b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", ayjx.class});
        } else if (i2 == 3) {
            return new ayjy();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][][]) null, (int[]) null);
            }
            if (i2 == 5) {
                return f97807b;
            }
            bxxk bxxk = f97808d;
            if (bxxk == null) {
                synchronized (ayjy.class) {
                    bxxk = f97808d;
                    if (bxxk == null) {
                        bxxk = new bxve(f97807b);
                        f97808d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
