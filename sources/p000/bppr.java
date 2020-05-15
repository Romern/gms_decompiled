package p000;

/* renamed from: bppr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bppr extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bppr f138652d;

    /* renamed from: e */
    private static volatile bxxk f138653e;

    /* renamed from: a */
    public int f138654a;

    /* renamed from: b */
    public String f138655b = "";

    /* renamed from: c */
    public int f138656c;

    static {
        bppr bppr = new bppr();
        f138652d = bppr;
        GeneratedMessageLite.m124024a(bppr.class, bppr);
    }

    private bppr() {
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
            return GeneratedMessageLite.m124022a(f138652d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", bppq.f138651a});
        } else if (i2 == 3) {
            return new bppr();
        } else {
            if (i2 == 4) {
                return new bxvd(f138652d);
            }
            if (i2 == 5) {
                return f138652d;
            }
            bxxk bxxk = f138653e;
            if (bxxk == null) {
                synchronized (bppr.class) {
                    bxxk = f138653e;
                    if (bxxk == null) {
                        bxxk = new bxve(f138652d);
                        f138653e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
