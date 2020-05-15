package p000;

/* renamed from: bkyw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkyw extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bkyw f125518f;

    /* renamed from: g */
    private static volatile bxxk f125519g;

    /* renamed from: a */
    public int f125520a;

    /* renamed from: b */
    public int f125521b;

    /* renamed from: c */
    public int f125522c;

    /* renamed from: d */
    public long f125523d;

    /* renamed from: e */
    public int f125524e;

    static {
        bkyw bkyw = new bkyw();
        f125518f = bkyw;
        GeneratedMessageLite.m124024a(bkyw.class, bkyw);
    }

    private bkyw() {
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
            return GeneratedMessageLite.m124022a(f125518f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဃ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", blbb.f125810a, "c", blba.f125809a, "d", "e", bkzu.f125702a});
        } else if (i2 == 3) {
            return new bkyw();
        } else {
            if (i2 == 4) {
                return new bxvd(f125518f);
            }
            if (i2 == 5) {
                return f125518f;
            }
            bxxk bxxk = f125519g;
            if (bxxk == null) {
                synchronized (bkyw.class) {
                    bxxk = f125519g;
                    if (bxxk == null) {
                        bxxk = new bxve(f125518f);
                        f125519g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
