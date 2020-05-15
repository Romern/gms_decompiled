package p000;

/* renamed from: bks */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bks extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bks f5027d;

    /* renamed from: f */
    private static volatile bxxk f5028f;

    /* renamed from: a */
    public int f5029a = 0;

    /* renamed from: b */
    public Object f5030b;

    /* renamed from: c */
    public long f5031c;

    /* renamed from: e */
    private int f5032e;

    static {
        bks bks = new bks();
        f5027d = bks;
        GeneratedMessageLite.m124024a(bks.class, bks);
    }

    private bks() {
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
            return GeneratedMessageLite.m124022a(f5027d, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", "e", "c", bkw.class, bkr.class});
        } else if (i2 == 3) {
            return new bks();
        } else {
            if (i2 == 4) {
                return new bxvd(f5027d);
            }
            if (i2 == 5) {
                return f5027d;
            }
            bxxk bxxk = f5028f;
            if (bxxk == null) {
                synchronized (bks.class) {
                    bxxk = f5028f;
                    if (bxxk == null) {
                        bxxk = new bxve(f5027d);
                        f5028f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
