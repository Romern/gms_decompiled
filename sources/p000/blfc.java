package p000;

/* renamed from: blfc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blfc extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final blfc f126331e;

    /* renamed from: f */
    private static volatile bxxk f126332f;

    /* renamed from: a */
    public int f126333a;

    /* renamed from: b */
    public bleu f126334b;

    /* renamed from: c */
    public String f126335c = "";

    /* renamed from: d */
    public String f126336d = "";

    static {
        blfc blfc = new blfc();
        f126331e = blfc;
        GeneratedMessageLite.m124024a(blfc.class, blfc);
    }

    private blfc() {
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
            return GeneratedMessageLite.m124022a(f126331e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new blfc();
        } else {
            if (i2 == 4) {
                return new bxvd(f126331e);
            }
            if (i2 == 5) {
                return f126331e;
            }
            bxxk bxxk = f126332f;
            if (bxxk == null) {
                synchronized (blfc.class) {
                    bxxk = f126332f;
                    if (bxxk == null) {
                        bxxk = new bxve(f126331e);
                        f126332f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
