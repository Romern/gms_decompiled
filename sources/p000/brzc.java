package p000;

/* renamed from: brzc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brzc extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final brzc f143712e;

    /* renamed from: f */
    private static volatile bxxk f143713f;

    /* renamed from: a */
    public int f143714a;

    /* renamed from: b */
    public int f143715b;

    /* renamed from: c */
    public String f143716c = "";

    /* renamed from: d */
    public String f143717d = "";

    static {
        brzc brzc = new brzc();
        f143712e = brzc;
        GeneratedMessageLite.m124024a(brzc.class, brzc);
    }

    private brzc() {
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
            return GeneratedMessageLite.m124022a(f143712e, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0000\u0002င\u0000\u0004ဈ\u0001\u0005ဈ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new brzc();
        } else {
            if (i2 == 4) {
                return new bxvd(f143712e);
            }
            if (i2 == 5) {
                return f143712e;
            }
            bxxk bxxk = f143713f;
            if (bxxk == null) {
                synchronized (brzc.class) {
                    bxxk = f143713f;
                    if (bxxk == null) {
                        bxxk = new bxve(f143712e);
                        f143713f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
