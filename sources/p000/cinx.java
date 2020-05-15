package p000;

/* renamed from: cinx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cinx extends GeneratedMessageLite implements bxxd {

    /* renamed from: m */
    public static final cinx f190993m;

    /* renamed from: o */
    private static volatile bxxk f190994o;

    /* renamed from: a */
    public int f190995a;

    /* renamed from: b */
    public String f190996b = "";

    /* renamed from: c */
    public long f190997c;

    /* renamed from: d */
    public String f190998d = "";

    /* renamed from: e */
    public long f190999e;

    /* renamed from: f */
    public long f191000f;

    /* renamed from: g */
    public long f191001g;

    /* renamed from: h */
    public long f191002h;

    /* renamed from: i */
    public int f191003i;

    /* renamed from: j */
    public long f191004j;

    /* renamed from: k */
    public int f191005k;

    /* renamed from: l */
    public cimz f191006l;

    /* renamed from: n */
    private byte f191007n = 2;

    static {
        cinx cinx = new cinx();
        f190993m = cinx;
        GeneratedMessageLite.m124024a(cinx.class, cinx);
    }

    private cinx() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f191007n);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f191007n = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f190993m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0001\u0001ဈ\u0000\u0002စ\u0003\u0003စ\u0004\u0004ဂ\u0005\u0005ဂ\u0006\u0006ဂ\b\u0007ဌ\t\bစ\u0001\tဈ\u0002\nင\u0007\u000bᐉ\n", new Object[]{"a", "b", "e", "f", "g", "h", "j", "k", cinv.f190992a, "c", "d", "i", "l"});
        } else if (i2 == 3) {
            return new cinx();
        } else {
            if (i2 == 4) {
                return new bxvd(f190993m);
            }
            if (i2 == 5) {
                return f190993m;
            }
            bxxk bxxk = f190994o;
            if (bxxk == null) {
                synchronized (cinx.class) {
                    bxxk = f190994o;
                    if (bxxk == null) {
                        bxxk = new bxve(f190993m);
                        f190994o = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
