package p000;

/* renamed from: qgr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qgr extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final qgr f41209d;

    /* renamed from: e */
    private static volatile bxxk f41210e;

    /* renamed from: a */
    public int f41211a;

    /* renamed from: b */
    public long f41212b;

    /* renamed from: c */
    public long f41213c;

    static {
        qgr qgr = new qgr();
        f41209d = qgr;
        GeneratedMessageLite.m124024a(qgr.class, qgr);
    }

    private qgr() {
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
            return GeneratedMessageLite.m124022a(f41209d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new qgr();
        } else {
            if (i2 == 4) {
                return new bxvd(f41209d);
            }
            if (i2 == 5) {
                return f41209d;
            }
            bxxk bxxk = f41210e;
            if (bxxk == null) {
                synchronized (qgr.class) {
                    bxxk = f41210e;
                    if (bxxk == null) {
                        bxxk = new bxve(f41209d);
                        f41210e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
