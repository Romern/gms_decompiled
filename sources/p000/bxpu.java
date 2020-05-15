package p000;

/* renamed from: bxpu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxpu extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bxpu f164309d;

    /* renamed from: e */
    private static volatile bxxk f164310e;

    /* renamed from: a */
    public int f164311a;

    /* renamed from: b */
    public int f164312b;

    /* renamed from: c */
    public long f164313c;

    static {
        bxpu bxpu = new bxpu();
        f164309d = bxpu;
        GeneratedMessageLite.m124024a(bxpu.class, bxpu);
    }

    private bxpu() {
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
            return GeneratedMessageLite.m124022a(f164309d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", bxqc.m122976b(), "c"});
        } else if (i2 == 3) {
            return new bxpu();
        } else {
            if (i2 == 4) {
                return new bxvd(f164309d);
            }
            if (i2 == 5) {
                return f164309d;
            }
            bxxk bxxk = f164310e;
            if (bxxk == null) {
                synchronized (bxpu.class) {
                    bxxk = f164310e;
                    if (bxxk == null) {
                        bxxk = new bxve(f164309d);
                        f164310e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
