package p000;

/* renamed from: calk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class calk extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final bxvu f175134i = new calh();

    /* renamed from: l */
    public static final calk f175135l;

    /* renamed from: n */
    private static volatile bxxk f175136n;

    /* renamed from: a */
    public boolean f175137a;

    /* renamed from: b */
    public String f175138b = "";

    /* renamed from: c */
    public bxwc f175139c = bxxn.f165040b;

    /* renamed from: d */
    public int f175140d;

    /* renamed from: e */
    public String f175141e = "";

    /* renamed from: f */
    public boolean f175142f;

    /* renamed from: g */
    public int f175143g = 2;

    /* renamed from: h */
    public bxvt f175144h = bxvm.f164965b;

    /* renamed from: j */
    public boolean f175145j;

    /* renamed from: k */
    public long f175146k;

    /* renamed from: m */
    private int f175147m;

    static {
        calk calk = new calk();
        f175135l = calk;
        GeneratedMessageLite.m124024a(calk.class, calk);
    }

    private calk() {
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
            return GeneratedMessageLite.m124022a(f175135l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0002\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003\u001a\u0004င\u0002\u0005ဈ\u0003\u0006ဇ\u0004\u0007\u001e\bဌ\u0005\tဇ\u0006\nဂ\u0007", new Object[]{"m", "a", "b", "c", "d", "e", "f", "h", calj.m126755b(), "g", cagz.m126623b(), "j", "k"});
        } else if (i2 == 3) {
            return new calk();
        } else {
            if (i2 == 4) {
                return new bxvd(f175135l);
            }
            if (i2 == 5) {
                return f175135l;
            }
            bxxk bxxk = f175136n;
            if (bxxk == null) {
                synchronized (calk.class) {
                    bxxk = f175136n;
                    if (bxxk == null) {
                        bxxk = new bxve(f175135l);
                        f175136n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
