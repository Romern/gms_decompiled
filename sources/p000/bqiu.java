package p000;

/* renamed from: bqiu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqiu extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bqiu f140898e;

    /* renamed from: f */
    private static volatile bxxk f140899f;

    /* renamed from: a */
    public int f140900a;

    /* renamed from: b */
    public int f140901b;

    /* renamed from: c */
    public int f140902c;

    /* renamed from: d */
    public int f140903d;

    static {
        bqiu bqiu = new bqiu();
        f140898e = bqiu;
        GeneratedMessageLite.m124024a(bqiu.class, bqiu);
    }

    private bqiu() {
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
            return GeneratedMessageLite.m124022a(f140898e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဌ\u0001\u0004ဌ\u0002", new Object[]{"a", "b", bqjq.f140969a, "c", bqjn.f140967a, "d", bqjp.f140968a});
        } else if (i2 == 3) {
            return new bqiu();
        } else {
            if (i2 == 4) {
                return new bxvd(f140898e);
            }
            if (i2 == 5) {
                return f140898e;
            }
            bxxk bxxk = f140899f;
            if (bxxk == null) {
                synchronized (bqiu.class) {
                    bxxk = f140899f;
                    if (bxxk == null) {
                        bxxk = new bxve(f140898e);
                        f140899f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
