package p000;

/* renamed from: qhe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qhe extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final qhe f41312d;

    /* renamed from: e */
    private static volatile bxxk f41313e;

    /* renamed from: a */
    public int f41314a;

    /* renamed from: b */
    public String f41315b = "";

    /* renamed from: c */
    public int f41316c;

    static {
        qhe qhe = new qhe();
        f41312d = qhe;
        GeneratedMessageLite.m124024a(qhe.class, qhe);
    }

    private qhe() {
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
            return GeneratedMessageLite.m124022a(f41312d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new qhe();
        } else {
            if (i2 == 4) {
                return new bxvd(f41312d);
            }
            if (i2 == 5) {
                return f41312d;
            }
            bxxk bxxk = f41313e;
            if (bxxk == null) {
                synchronized (qhe.class) {
                    bxxk = f41313e;
                    if (bxxk == null) {
                        bxxk = new bxve(f41312d);
                        f41313e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
