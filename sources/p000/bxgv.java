package p000;

/* renamed from: bxgv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxgv extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bxgv f163310f;

    /* renamed from: g */
    private static volatile bxxk f163311g;

    /* renamed from: a */
    public int f163312a;

    /* renamed from: b */
    public int f163313b;

    /* renamed from: c */
    public bxgh f163314c;

    /* renamed from: d */
    public long f163315d;

    /* renamed from: e */
    public long f163316e;

    static {
        bxgv bxgv = new bxgv();
        f163310f = bxgv;
        GeneratedMessageLite.m124024a(bxgv.class, bxgv);
    }

    private bxgv() {
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
            return GeneratedMessageLite.m124022a(f163310f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"a", "b", bxgu.m122700b(), "c", "d", "e"});
        } else if (i2 == 3) {
            return new bxgv();
        } else {
            if (i2 == 4) {
                return new bxvd(f163310f);
            }
            if (i2 == 5) {
                return f163310f;
            }
            bxxk bxxk = f163311g;
            if (bxxk == null) {
                synchronized (bxgv.class) {
                    bxxk = f163311g;
                    if (bxxk == null) {
                        bxxk = new bxve(f163310f);
                        f163311g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
