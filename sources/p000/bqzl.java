package p000;

/* renamed from: bqzl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqzl extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bqzl f142054d;

    /* renamed from: f */
    private static volatile bxxk f142055f;

    /* renamed from: a */
    public bqzm f142056a;

    /* renamed from: b */
    public bxwc f142057b = bxxn.f165040b;

    /* renamed from: c */
    public int f142058c;

    /* renamed from: e */
    private int f142059e;

    static {
        bqzl bqzl = new bqzl();
        f142054d = bqzl;
        GeneratedMessageLite.m124024a(bqzl.class, bqzl);
    }

    private bqzl() {
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
            return GeneratedMessageLite.m124022a(f142054d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဌ\u0001", new Object[]{"e", "a", "b", bqzi.class, "c", bqzj.f142053a});
        } else if (i2 == 3) {
            return new bqzl();
        } else {
            if (i2 == 4) {
                return new bxvd(f142054d);
            }
            if (i2 == 5) {
                return f142054d;
            }
            bxxk bxxk = f142055f;
            if (bxxk == null) {
                synchronized (bqzl.class) {
                    bxxk = f142055f;
                    if (bxxk == null) {
                        bxxk = new bxve(f142054d);
                        f142055f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
