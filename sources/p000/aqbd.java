package p000;

/* renamed from: aqbd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqbd extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final aqbd f85537e;

    /* renamed from: f */
    private static volatile bxxk f85538f;

    /* renamed from: a */
    public int f85539a;

    /* renamed from: b */
    public String f85540b = "";

    /* renamed from: c */
    public String f85541c = "";

    /* renamed from: d */
    public String f85542d = "";

    static {
        aqbd aqbd = new aqbd();
        f85537e = aqbd;
        GeneratedMessageLite.m124024a(aqbd.class, aqbd);
    }

    private aqbd() {
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
            return GeneratedMessageLite.m124022a(f85537e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new aqbd();
        } else {
            if (i2 == 4) {
                return new bxvd(f85537e);
            }
            if (i2 == 5) {
                return f85537e;
            }
            bxxk bxxk = f85538f;
            if (bxxk == null) {
                synchronized (aqbd.class) {
                    bxxk = f85538f;
                    if (bxxk == null) {
                        bxxk = new bxve(f85537e);
                        f85538f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
