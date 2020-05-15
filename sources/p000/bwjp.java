package p000;

/* renamed from: bwjp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwjp extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bwjp f159843g;

    /* renamed from: i */
    private static volatile bxxk f159844i;

    /* renamed from: a */
    public int f159845a;

    /* renamed from: b */
    public bmaq f159846b;

    /* renamed from: c */
    public bmar f159847c;

    /* renamed from: d */
    public bmav f159848d;

    /* renamed from: e */
    public bwjm f159849e;

    /* renamed from: f */
    public int f159850f;

    /* renamed from: h */
    private byte f159851h = 2;

    static {
        bwjp bwjp = new bwjp();
        f159843g = bwjp;
        GeneratedMessageLite.m124024a(bwjp.class, bwjp);
    }

    private bwjp() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f159851h);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f159851h = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f159843g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0002\u0004ᐉ\u0003\u0005ဌ\u0004\u0006ဉ\u0001", new Object[]{"a", "b", "d", "e", "f", bwgz.m121953b(), "c"});
        } else if (i2 == 3) {
            return new bwjp();
        } else {
            if (i2 == 4) {
                return new bxvd(f159843g);
            }
            if (i2 == 5) {
                return f159843g;
            }
            bxxk bxxk = f159844i;
            if (bxxk == null) {
                synchronized (bwjp.class) {
                    bxxk = f159844i;
                    if (bxxk == null) {
                        bxxk = new bxve(f159843g);
                        f159844i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
