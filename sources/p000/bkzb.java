package p000;

/* renamed from: bkzb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkzb extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bkzb f125546e;

    /* renamed from: f */
    private static volatile bxxk f125547f;

    /* renamed from: a */
    public int f125548a;

    /* renamed from: b */
    public boolean f125549b;

    /* renamed from: c */
    public boolean f125550c;

    /* renamed from: d */
    public int f125551d;

    static {
        bkzb bkzb = new bkzb();
        f125546e = bkzb;
        GeneratedMessageLite.m124024a(bkzb.class, bkzb);
    }

    private bkzb() {
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
            return GeneratedMessageLite.m124022a(f125546e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", "d", bkyl.f125464a});
        } else if (i2 == 3) {
            return new bkzb();
        } else {
            if (i2 == 4) {
                return new bxvd(f125546e);
            }
            if (i2 == 5) {
                return f125546e;
            }
            bxxk bxxk = f125547f;
            if (bxxk == null) {
                synchronized (bkzb.class) {
                    bxxk = f125547f;
                    if (bxxk == null) {
                        bxxk = new bxve(f125546e);
                        f125547f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
