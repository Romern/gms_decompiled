package p000;

/* renamed from: bpqv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpqv extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bpqv f138790h;

    /* renamed from: i */
    private static volatile bxxk f138791i;

    /* renamed from: a */
    public int f138792a;

    /* renamed from: b */
    public int f138793b;

    /* renamed from: c */
    public int f138794c;

    /* renamed from: d */
    public int f138795d;

    /* renamed from: e */
    public long f138796e;

    /* renamed from: f */
    public String f138797f = "";

    /* renamed from: g */
    public boolean f138798g;

    static {
        bpqv bpqv = new bpqv();
        f138790h = bpqv;
        GeneratedMessageLite.m124024a(bpqv.class, bpqv);
    }

    private bpqv() {
        bxxn bxxn = bxxn.f165040b;
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
            return GeneratedMessageLite.m124022a(f138790h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0003င\u0001\u0004ဌ\u0002\u0005ဂ\u0003\u0006ဈ\u0004\u0007ဇ\u0005", new Object[]{"a", "b", bppi.f138627a, "c", "d", bpqx.f138800a, "e", "f", "g"});
        } else if (i2 == 3) {
            return new bpqv();
        } else {
            if (i2 == 4) {
                return new bxvd(f138790h);
            }
            if (i2 == 5) {
                return f138790h;
            }
            bxxk bxxk = f138791i;
            if (bxxk == null) {
                synchronized (bpqv.class) {
                    bxxk = f138791i;
                    if (bxxk == null) {
                        bxxk = new bxve(f138790h);
                        f138791i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
