package p000;

/* renamed from: cagi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cagi extends bxvg implements bxvh {

    /* renamed from: t */
    public static final cagi f173096t;

    /* renamed from: v */
    private static volatile bxxk f173097v;

    /* renamed from: a */
    public int f173098a;

    /* renamed from: b */
    public long f173099b;

    /* renamed from: c */
    public long f173100c;

    /* renamed from: d */
    public String f173101d = "";

    /* renamed from: e */
    public int f173102e;

    /* renamed from: f */
    public String f173103f = "";

    /* renamed from: g */
    public long f173104g;

    /* renamed from: h */
    public bxwc f173105h = bxxn.f165040b;

    /* renamed from: i */
    public ByteString f173106i;

    /* renamed from: j */
    public long f173107j;

    /* renamed from: k */
    public bqyq f173108k;

    /* renamed from: l */
    public ByteString f173109l;

    /* renamed from: n */
    public int f173110n;

    /* renamed from: o */
    public bxvt f173111o;

    /* renamed from: p */
    public bxvt f173112p;

    /* renamed from: q */
    public long f173113q;

    /* renamed from: r */
    public cagx f173114r;

    /* renamed from: s */
    public boolean f173115s;

    /* renamed from: u */
    private byte f173116u = 2;

    static {
        cagi cagi = new cagi();
        f173096t = cagi;
        GeneratedMessageLite.m124024a(cagi.class, cagi);
    }

    private cagi() {
        ByteString bxtx = bxtx.f164797b;
        this.f173106i = bxtx.f164797b;
        this.f173107j = 180000;
        this.f173109l = bxtx.f164797b;
        this.f173111o = bxvm.f164965b;
        this.f173112p = bxvm.f164965b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f173116u);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f173116u = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f173096t, "\u0001\u0011\u0000\u0001\u0001\u001b\u0011\u0000\u0003\u0000\u0001ဂ\u0000\u0002ဈ\u0003\u0003\u001b\u0006ည\n\u000bင\u0004\fဂ\u0006\u000fတ\u0010\u0010ဉ\u0011\u0011ဂ\u0001\u0012ည\u0012\u0013ဌ\u0014\u0014\u0016\u0016ဂ\u0015\u0017ဉ\u0016\u0019ဇ\u0017\u001aဈ\u0005\u001b'", new Object[]{"a", "b", "d", "h", cagj.class, "i", "e", "g", "j", "k", "c", "l", "n", cagg.f173095a, "o", "q", "r", "s", "f", "p"});
        } else if (i2 == 3) {
            return new cagi();
        } else {
            if (i2 == 4) {
                return new bxvf(f173096t);
            }
            if (i2 == 5) {
                return f173096t;
            }
            bxxk bxxk = f173097v;
            if (bxxk == null) {
                synchronized (cagi.class) {
                    bxxk = f173097v;
                    if (bxxk == null) {
                        bxxk = new bxve(f173096t);
                        f173097v = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
