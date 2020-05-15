package p000;

/* renamed from: qgp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qgp extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final qgp f41198d;

    /* renamed from: e */
    private static volatile bxxk f41199e;

    /* renamed from: a */
    public int f41200a;

    /* renamed from: b */
    public long f41201b;

    /* renamed from: c */
    public qgo f41202c;

    static {
        qgp qgp = new qgp();
        f41198d = qgp;
        GeneratedMessageLite.m124024a(qgp.class, qgp);
    }

    private qgp() {
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
            return GeneratedMessageLite.m124022a(f41198d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new qgp();
        } else {
            if (i2 == 4) {
                return new bxvd(f41198d);
            }
            if (i2 == 5) {
                return f41198d;
            }
            bxxk bxxk = f41199e;
            if (bxxk == null) {
                synchronized (qgp.class) {
                    bxxk = f41199e;
                    if (bxxk == null) {
                        bxxk = new bxve(f41198d);
                        f41199e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
