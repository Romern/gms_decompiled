package p000;

/* renamed from: bpls */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpls extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final bpls f138139j;

    /* renamed from: k */
    private static volatile bxxk f138140k;

    /* renamed from: a */
    public int f138141a;

    /* renamed from: b */
    public int f138142b;

    /* renamed from: c */
    public long f138143c;

    /* renamed from: d */
    public bplm f138144d;

    /* renamed from: e */
    public long f138145e;

    /* renamed from: f */
    public int f138146f;

    /* renamed from: g */
    public bxvt f138147g = bxvm.f164965b;

    /* renamed from: h */
    public bxvt f138148h = bxvm.f164965b;

    /* renamed from: i */
    public int f138149i;

    static {
        bpls bpls = new bpls();
        f138139j = bpls;
        GeneratedMessageLite.m124024a(bpls.class, bpls);
    }

    private bpls() {
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
            return GeneratedMessageLite.m124022a(f138139j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဌ\u0000\u0002စ\u0001\u0003ဉ\u0002\u0004ဂ\u0003\u0005င\u0004\u0006\u0016\u0007\u0016\bင\u0005", new Object[]{"a", "b", bplr.f138138a, "c", "d", "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new bpls();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][]) null, (char[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f138139j;
            }
            bxxk bxxk = f138140k;
            if (bxxk == null) {
                synchronized (bpls.class) {
                    bxxk = f138140k;
                    if (bxxk == null) {
                        bxxk = new bxve(f138139j);
                        f138140k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
