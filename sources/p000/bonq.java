package p000;

/* renamed from: bonq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bonq extends bxvk implements bxxd {

    /* renamed from: p */
    public static final bonq f133833p;

    /* renamed from: r */
    private static volatile bxxk f133834r;

    /* renamed from: a */
    public int f133835a;

    /* renamed from: b */
    public int f133836b = 1;

    /* renamed from: c */
    public bpqk f133837c;

    /* renamed from: d */
    public bpkx f133838d;

    /* renamed from: e */
    public bpsc f133839e;

    /* renamed from: f */
    public bpoh f133840f;

    /* renamed from: g */
    public bpmc f133841g;

    /* renamed from: h */
    public bplf f133842h;

    /* renamed from: i */
    public bpkv f133843i;

    /* renamed from: j */
    public bpkl f133844j;

    /* renamed from: k */
    public bplc f133845k;

    /* renamed from: l */
    public bpmt f133846l;

    /* renamed from: m */
    public bpna f133847m;

    /* renamed from: n */
    public bpkg f133848n;

    /* renamed from: o */
    public bplj f133849o;

    /* renamed from: q */
    private byte f133850q = 2;

    static {
        bonq bonq = new bonq();
        f133833p = bonq;
        bxvk.m124024a(bonq.class, bonq);
    }

    private bonq() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f133850q);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f133850q = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f133833p, "\u0001\u000e\u0000\u0001\u0001\u0010\u000e\u0000\u0000\u0002\u0001ဌ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bဉ\n\rဉ\f\u000fဉ\u000e\u0010ဉ\u000f", new Object[]{"a", "b", bono.f133832a, "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"});
        } else if (i2 == 3) {
            return new bonq();
        } else {
            if (i2 == 4) {
                return new bxvd(f133833p);
            }
            if (i2 == 5) {
                return f133833p;
            }
            bxxk bxxk = f133834r;
            if (bxxk == null) {
                synchronized (bonq.class) {
                    bxxk = f133834r;
                    if (bxxk == null) {
                        bxxk = new bxve(f133833p);
                        f133834r = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
