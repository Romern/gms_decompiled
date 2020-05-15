package p000;

/* renamed from: bwxj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwxj extends bxvk implements bxxd {

    /* renamed from: q */
    public static final bwxj f161360q;

    /* renamed from: r */
    private static volatile bxxk f161361r;

    /* renamed from: a */
    public int f161362a;

    /* renamed from: b */
    public int f161363b = 0;

    /* renamed from: c */
    public Object f161364c;

    /* renamed from: d */
    public int f161365d = 0;

    /* renamed from: e */
    public Object f161366e;

    /* renamed from: f */
    public bwxc f161367f;

    /* renamed from: g */
    public bwxc f161368g;

    /* renamed from: h */
    public bwxy f161369h;

    /* renamed from: i */
    public bwya f161370i;

    /* renamed from: j */
    public bwya f161371j;

    /* renamed from: k */
    public bwxy f161372k;

    /* renamed from: l */
    public bwya f161373l;

    /* renamed from: m */
    public bwya f161374m;

    /* renamed from: n */
    public int f161375n;

    /* renamed from: o */
    public bwwz f161376o;

    /* renamed from: p */
    public int f161377p;

    static {
        bwxj bwxj = new bwxj();
        f161360q = bwxj;
        bxvk.m124024a(bwxj.class, bwxj);
    }

    private bwxj() {
        bxvm bxvm = bxvm.f164965b;
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
            return bxvk.m124022a(f161360q, "\u0001\u000f\u0002\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဌ\b\nဉ\t\u000bဌ\n\fြ\u0000\rြ\u0000\u000eြ\u0000\u000fြ\u0001", new Object[]{"c", "b", "e", "d", "a", "f", "g", "h", "i", "j", "k", "l", "m", "n", bwxb.m122391b(), "o", "p", bwxi.m122400b(), bwxd.class, bwxg.class, bwxk.class, bwxe.class});
        } else if (i2 == 3) {
            return new bwxj();
        } else {
            if (i2 == 4) {
                return new bxvd(f161360q);
            }
            if (i2 == 5) {
                return f161360q;
            }
            bxxk bxxk = f161361r;
            if (bxxk == null) {
                synchronized (bwxj.class) {
                    bxxk = f161361r;
                    if (bxxk == null) {
                        bxxk = new bxve(f161360q);
                        f161361r = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
