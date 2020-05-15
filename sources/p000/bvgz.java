package p000;

/* renamed from: bvgz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvgz extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bvgz f156059f;

    /* renamed from: g */
    private static volatile bxxk f156060g;

    /* renamed from: a */
    public int f156061a;

    /* renamed from: b */
    public int f156062b;

    /* renamed from: c */
    public bvgw f156063c;

    /* renamed from: d */
    public int f156064d;

    /* renamed from: e */
    public ByteString f156065e = ByteString.f164797b;

    static {
        bvgz bvgz = new bvgz();
        f156059f = bvgz;
        GeneratedMessageLite.m124024a(bvgz.class, bvgz);
    }

    private bvgz() {
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
            return GeneratedMessageLite.m124022a(f156059f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0004ဉ\u0003\u0005င\u0005\u0006ည\u0006", new Object[]{"a", "b", bvgx.f156058a, "c", "d", "e"});
        } else if (i2 == 3) {
            return new bvgz();
        } else {
            if (i2 == 4) {
                return new bxvd(f156059f);
            }
            if (i2 == 5) {
                return f156059f;
            }
            bxxk bxxk = f156060g;
            if (bxxk == null) {
                synchronized (bvgz.class) {
                    bxxk = f156060g;
                    if (bxxk == null) {
                        bxxk = new bxve(f156059f);
                        f156060g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
