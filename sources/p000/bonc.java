package p000;

/* renamed from: bonc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bonc extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bonc f133761e;

    /* renamed from: f */
    private static volatile bxxk f133762f;

    /* renamed from: a */
    public int f133763a;

    /* renamed from: b */
    public int f133764b;

    /* renamed from: c */
    public long f133765c;

    /* renamed from: d */
    public int f133766d;

    static {
        bonc bonc = new bonc();
        f133761e = bonc;
        GeneratedMessageLite.m124024a(bonc.class, bonc);
    }

    private bonc() {
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
            return GeneratedMessageLite.m124022a(f133761e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003င\u0002", new Object[]{"a", "b", adbj.m50118b(), "c", "d"});
        } else if (i2 == 3) {
            return new bonc();
        } else {
            if (i2 == 4) {
                return new bxvd(f133761e);
            }
            if (i2 == 5) {
                return f133761e;
            }
            bxxk bxxk = f133762f;
            if (bxxk == null) {
                synchronized (bonc.class) {
                    bxxk = f133762f;
                    if (bxxk == null) {
                        bxxk = new bxve(f133761e);
                        f133762f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
