package p000;

/* renamed from: bvfd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvfd extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bvfd f155845e;

    /* renamed from: f */
    private static volatile bxxk f155846f;

    /* renamed from: a */
    public int f155847a;

    /* renamed from: b */
    public long f155848b;

    /* renamed from: c */
    public int f155849c;

    /* renamed from: d */
    public int f155850d;

    static {
        bvfd bvfd = new bvfd();
        f155845e = bvfd;
        GeneratedMessageLite.m124024a(bvfd.class, bvfd);
    }

    private bvfd() {
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
            return GeneratedMessageLite.m124022a(f155845e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", bvjs.f156353a, "d", bvjr.f156352a});
        } else if (i2 == 3) {
            return new bvfd();
        } else {
            if (i2 == 4) {
                return new bxvd(f155845e);
            }
            if (i2 == 5) {
                return f155845e;
            }
            bxxk bxxk = f155846f;
            if (bxxk == null) {
                synchronized (bvfd.class) {
                    bxxk = f155846f;
                    if (bxxk == null) {
                        bxxk = new bxve(f155845e);
                        f155846f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
