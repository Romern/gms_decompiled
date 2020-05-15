package p000;

/* renamed from: bpgr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpgr extends bxvk implements bxxd {

    /* renamed from: x */
    public static final bpgr f137526x;

    /* renamed from: y */
    private static volatile bxxk f137527y;

    /* renamed from: a */
    public int f137528a;

    /* renamed from: b */
    public String f137529b = "";

    /* renamed from: c */
    public int f137530c;

    /* renamed from: d */
    public bpgo f137531d;

    /* renamed from: e */
    public bpgp f137532e;

    /* renamed from: f */
    public bpgl f137533f;

    /* renamed from: g */
    public bpgm f137534g;

    /* renamed from: h */
    public bpgn f137535h;

    /* renamed from: i */
    public bpgq f137536i;

    /* renamed from: j */
    public bpgf f137537j;

    /* renamed from: k */
    public bpgd f137538k;

    /* renamed from: l */
    public bpgc f137539l;

    /* renamed from: m */
    public bpgh f137540m;

    /* renamed from: n */
    public bpgg f137541n;

    /* renamed from: o */
    public bpge f137542o;

    /* renamed from: p */
    public bpgi f137543p;

    /* renamed from: q */
    public bpgj f137544q;

    /* renamed from: r */
    public bpgk f137545r;

    /* renamed from: s */
    public bpfz f137546s;

    /* renamed from: t */
    public bpga f137547t;

    /* renamed from: u */
    public bpfx f137548u;

    /* renamed from: v */
    public bpgb f137549v;

    /* renamed from: w */
    public bpfy f137550w;

    static {
        bpgr bpgr = new bpgr();
        f137526x = bpgr;
        bxvk.m124024a(bpgr.class, bpgr);
    }

    private bpgr() {
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
            return bxvk.m124022a(f137526x, "\u0001\u0016\u0000\u0001\u0001\u0017\u0016\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bဉ\n\fဉ\u000b\rဉ\f\u000fဉ\u000e\u0010ဉ\u000f\u0011ဉ\u0010\u0012ဉ\u0011\u0013ဉ\u0012\u0014ဉ\u0013\u0015ဉ\u0014\u0016ဉ\u0015\u0017ဉ\u0016", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w"});
        } else if (i2 == 3) {
            return new bpgr();
        } else {
            if (i2 == 4) {
                return new bxvd(f137526x);
            }
            if (i2 == 5) {
                return f137526x;
            }
            bxxk bxxk = f137527y;
            if (bxxk == null) {
                synchronized (bpgr.class) {
                    bxxk = f137527y;
                    if (bxxk == null) {
                        bxxk = new bxve(f137526x);
                        f137527y = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
