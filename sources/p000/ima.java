package p000;

/* renamed from: ima */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ima extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final ima f21332e;

    /* renamed from: f */
    private static volatile bxxk f21333f;

    /* renamed from: a */
    public int f21334a;

    /* renamed from: b */
    public ilz f21335b;

    /* renamed from: c */
    public String f21336c = "";

    /* renamed from: d */
    public String f21337d = "";

    static {
        ima ima = new ima();
        f21332e = ima;
        GeneratedMessageLite.m124024a(ima.class, ima);
    }

    private ima() {
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
            return GeneratedMessageLite.m124022a(f21332e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new ima();
        } else {
            if (i2 == 4) {
                return new bxvd(f21332e);
            }
            if (i2 == 5) {
                return f21332e;
            }
            bxxk bxxk = f21333f;
            if (bxxk == null) {
                synchronized (ima.class) {
                    bxxk = f21333f;
                    if (bxxk == null) {
                        bxxk = new bxve(f21332e);
                        f21333f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
