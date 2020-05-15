package p000;

/* renamed from: qgd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qgd extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final qgd f41146c;

    /* renamed from: d */
    private static volatile bxxk f41147d;

    /* renamed from: a */
    public int f41148a;

    /* renamed from: b */
    public String f41149b = "";

    static {
        qgd qgd = new qgd();
        f41146c = qgd;
        GeneratedMessageLite.m124024a(qgd.class, qgd);
    }

    private qgd() {
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
            return GeneratedMessageLite.m124022a(f41146c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new qgd();
        } else {
            if (i2 == 4) {
                return new bxvd(f41146c);
            }
            if (i2 == 5) {
                return f41146c;
            }
            bxxk bxxk = f41147d;
            if (bxxk == null) {
                synchronized (qgd.class) {
                    bxxk = f41147d;
                    if (bxxk == null) {
                        bxxk = new bxve(f41146c);
                        f41147d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
