package p000;

/* renamed from: qgw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qgw extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final qgw f41264d;

    /* renamed from: e */
    private static volatile bxxk f41265e;

    /* renamed from: a */
    public int f41266a;

    /* renamed from: b */
    public String f41267b = "";

    /* renamed from: c */
    public String f41268c = "";

    static {
        qgw qgw = new qgw();
        f41264d = qgw;
        GeneratedMessageLite.m124024a(qgw.class, qgw);
    }

    private qgw() {
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
            return GeneratedMessageLite.m124022a(f41264d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new qgw();
        } else {
            if (i2 == 4) {
                return new bxvd(f41264d);
            }
            if (i2 == 5) {
                return f41264d;
            }
            bxxk bxxk = f41265e;
            if (bxxk == null) {
                synchronized (qgw.class) {
                    bxxk = f41265e;
                    if (bxxk == null) {
                        bxxk = new bxve(f41264d);
                        f41265e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
