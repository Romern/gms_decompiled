package p000;

/* renamed from: bvei */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvei extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bvei f155726g;

    /* renamed from: h */
    private static volatile bxxk f155727h;

    /* renamed from: a */
    public int f155728a;

    /* renamed from: b */
    public long f155729b;

    /* renamed from: c */
    public int f155730c;

    /* renamed from: d */
    public int f155731d;

    /* renamed from: e */
    public int f155732e;

    /* renamed from: f */
    public int f155733f;

    static {
        bvei bvei = new bvei();
        f155726g = bvei;
        GeneratedMessageLite.m124024a(bvei.class, bvei);
    }

    private bvei() {
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
            return GeneratedMessageLite.m124022a(f155726g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဌ\u0004", new Object[]{"a", "b", "c", bvhx.f156124a, "d", bvhv.f156122a, "e", bvif.m121137b(), "f", bvhw.f156123a});
        } else if (i2 == 3) {
            return new bvei();
        } else {
            if (i2 == 4) {
                return new bxvd(f155726g);
            }
            if (i2 == 5) {
                return f155726g;
            }
            bxxk bxxk = f155727h;
            if (bxxk == null) {
                synchronized (bvei.class) {
                    bxxk = f155727h;
                    if (bxxk == null) {
                        bxxk = new bxve(f155726g);
                        f155727h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
