package p000;

/* renamed from: bpcl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpcl extends bxvk implements bxxd {

    /* renamed from: L */
    public static final bpcl f135759L;

    /* renamed from: N */
    private static volatile bxxk f135760N;

    /* renamed from: A */
    public bpej f135761A;

    /* renamed from: B */
    public bpei f135762B;

    /* renamed from: C */
    public bpdq f135763C;

    /* renamed from: D */
    public bpck f135764D;

    /* renamed from: E */
    public bpcx f135765E;

    /* renamed from: F */
    public bxwc f135766F = bxxn.f165040b;

    /* renamed from: G */
    public bpdf f135767G;

    /* renamed from: H */
    public long f135768H;

    /* renamed from: I */
    public int f135769I;

    /* renamed from: J */
    public int f135770J;

    /* renamed from: K */
    public bpcj f135771K;

    /* renamed from: M */
    private byte f135772M = 2;

    /* renamed from: a */
    public int f135773a;

    /* renamed from: b */
    public int f135774b;

    /* renamed from: c */
    public bpcv f135775c;

    /* renamed from: d */
    public bpcw f135776d;

    /* renamed from: e */
    public bpda f135777e;

    /* renamed from: f */
    public bpee f135778f;

    /* renamed from: g */
    public bpdc f135779g;

    /* renamed from: h */
    public bpdw f135780h;

    /* renamed from: i */
    public bpdz f135781i;

    /* renamed from: j */
    public bpci f135782j;

    /* renamed from: k */
    public bpcp f135783k;

    /* renamed from: l */
    public bped f135784l;

    /* renamed from: m */
    public bpdj f135785m;

    /* renamed from: n */
    public bpcn f135786n;

    /* renamed from: o */
    public bpdp f135787o;

    /* renamed from: p */
    public bpeh f135788p;

    /* renamed from: q */
    public int f135789q;

    /* renamed from: r */
    public boolean f135790r;

    /* renamed from: s */
    public int f135791s;

    /* renamed from: t */
    public int f135792t = -1;

    /* renamed from: u */
    public int f135793u;

    /* renamed from: v */
    public int f135794v;

    /* renamed from: w */
    public boolean f135795w;

    /* renamed from: x */
    public bpds f135796x;

    /* renamed from: y */
    public bpdd f135797y;

    /* renamed from: z */
    public bpdv f135798z;

    static {
        bpcl bpcl = new bpcl();
        f135759L = bpcl;
        bxvk.m124024a(bpcl.class, bpcl);
    }

    private bpcl() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f135772M);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f135772M = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f135759L, "\u0001#\u0000\u0002\u0001K#\u0000\u0001\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\rဉ\u000b\u000eဉ\f\u000fဉ\r\u0010ဉ\u000e\u0012ဉ\u0010\u0013ဉ\u0011 င\u0013!ဇ\u0014\"င\u0015#င\u0016$င\u0017%င\u0018&ဇ\u0019*ဉ\u001d,ဉ\u001f0ဉ#1ဉ$3ဉ&9ဉ+:ဉ,=ဉ/>\u001b@ဉ1Bဂ3Cင4Hင9Kᐉ<", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", bpcx.class, "G", "H", "I", "J", "K"});
        } else if (i2 == 3) {
            return new bpcl();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][][]) null);
            }
            if (i2 == 5) {
                return f135759L;
            }
            bxxk bxxk = f135760N;
            if (bxxk == null) {
                synchronized (bpcl.class) {
                    bxxk = f135760N;
                    if (bxxk == null) {
                        bxxk = new bxve(f135759L);
                        f135760N = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
