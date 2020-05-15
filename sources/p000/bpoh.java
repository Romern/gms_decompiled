package p000;

/* renamed from: bpoh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpoh extends bxvk implements bxxd {

    /* renamed from: s */
    public static final bpoh f138508s;

    /* renamed from: t */
    private static volatile bxxk f138509t;

    /* renamed from: a */
    public int f138510a;

    /* renamed from: b */
    public int f138511b;

    /* renamed from: c */
    public int f138512c;

    /* renamed from: d */
    public int f138513d;

    /* renamed from: e */
    public boolean f138514e;

    /* renamed from: f */
    public bxvt f138515f = bxvm.f164965b;

    /* renamed from: g */
    public int f138516g;

    /* renamed from: h */
    public bpnx f138517h;

    /* renamed from: i */
    public bpof f138518i;

    /* renamed from: j */
    public bpnd f138519j;

    /* renamed from: k */
    public bpoc f138520k;

    /* renamed from: l */
    public bpob f138521l;

    /* renamed from: m */
    public bpod f138522m;

    /* renamed from: n */
    public bpnf f138523n;

    /* renamed from: o */
    public bpnj f138524o;

    /* renamed from: p */
    public bpop f138525p;

    /* renamed from: q */
    public bpnp f138526q;

    /* renamed from: r */
    public bpnm f138527r;

    static {
        bpoh bpoh = new bpoh();
        f138508s = bpoh;
        bxvk.m124024a(bpoh.class, bpoh);
    }

    private bpoh() {
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
            return bxvk.m124022a(f138508s, "\u0001\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0001\u0000\u0001ဌ\u0001\u0003င\u0003\u0004ဉ\u0006\u0005ဉ\u0007\u0006ဉ\b\u0007ဉ\t\bဇ\u0004\tဉ\n\nဉ\u000b\u000b\u0016\fင\u0005\rဉ\f\u000eဉ\r\u0010ဉ\u000f\u0011င\u0000\u0012ဉ\u0010\u0013ဉ\u0011", new Object[]{"a", "c", bpog.f138507a, "d", "h", "i", "j", "k", "e", "l", "m", "f", "g", "n", "o", "p", "b", "q", "r"});
        } else if (i2 == 3) {
            return new bpoh();
        } else {
            if (i2 == 4) {
                return new bxvd((int[]) null, (boolean[][][]) null);
            }
            if (i2 == 5) {
                return f138508s;
            }
            bxxk bxxk = f138509t;
            if (bxxk == null) {
                synchronized (bpoh.class) {
                    bxxk = f138509t;
                    if (bxxk == null) {
                        bxxk = new bxve(f138508s);
                        f138509t = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
