package p000;

/* renamed from: bppp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bppp extends GeneratedMessageLite implements bxxd {

    /* renamed from: q */
    public static final bppp f138633q;

    /* renamed from: r */
    private static volatile bxxk f138634r;

    /* renamed from: a */
    public int f138635a;

    /* renamed from: b */
    public int f138636b;

    /* renamed from: c */
    public int f138637c;

    /* renamed from: d */
    public int f138638d;

    /* renamed from: e */
    public int f138639e;

    /* renamed from: f */
    public int f138640f;

    /* renamed from: g */
    public bppf f138641g;

    /* renamed from: h */
    public bppb f138642h;

    /* renamed from: i */
    public bpow f138643i;

    /* renamed from: j */
    public bpro f138644j;

    /* renamed from: k */
    public bppc f138645k;

    /* renamed from: l */
    public bppe f138646l;

    /* renamed from: m */
    public bprq f138647m;

    /* renamed from: n */
    public bpru f138648n;

    /* renamed from: o */
    public bprs f138649o;

    /* renamed from: p */
    public int f138650p;

    static {
        bppp bppp = new bppp();
        f138633q = bppp;
        GeneratedMessageLite.m124024a(bppp.class, bppp);
    }

    private bppp() {
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
            return GeneratedMessageLite.m124022a(f138633q, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bဉ\n\fဉ\u000b\rဉ\f\u000eဉ\r\u000fဌ\u000e", new Object[]{"a", "b", bppl.f138630a, "c", bppn.f138632a, "d", "e", bppk.f138629a, "f", bppj.f138628a, "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", bppm.f138631a});
        } else if (i2 == 3) {
            return new bppp();
        } else {
            if (i2 == 4) {
                return new bxvd(f138633q);
            }
            if (i2 == 5) {
                return f138633q;
            }
            bxxk bxxk = f138634r;
            if (bxxk == null) {
                synchronized (bppp.class) {
                    bxxk = f138634r;
                    if (bxxk == null) {
                        bxxk = new bxve(f138633q);
                        f138634r = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
