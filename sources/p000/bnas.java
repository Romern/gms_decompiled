package p000;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: bnas */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class bnas extends Enum {

    /* renamed from: a */
    public static final bnas f131309a = new bnas("STRONG", 0);

    /* renamed from: b */
    public static final bnas f131310b = new bnam("STRONG_ACCESS");

    /* renamed from: c */
    public static final bnas f131311c = new bnan("STRONG_WRITE");

    /* renamed from: d */
    public static final bnas f131312d = new bnao("STRONG_ACCESS_WRITE");

    /* renamed from: e */
    public static final bnas f131313e = new bnas("WEAK", 4);

    /* renamed from: f */
    public static final bnas f131314f = new bnap("WEAK_ACCESS");

    /* renamed from: g */
    public static final bnas f131315g = new bnaq("WEAK_WRITE");

    /* renamed from: h */
    public static final bnas f131316h;

    /* renamed from: i */
    static final bnas[] f131317i;

    /* renamed from: j */
    private static final /* synthetic */ bnas[] f131318j;

    static {
        bnar bnar = new bnar("WEAK_ACCESS_WRITE");
        f131316h = bnar;
        bnas bnas = f131309a;
        bnas bnas2 = f131310b;
        bnas bnas3 = f131311c;
        bnas bnas4 = f131312d;
        bnas bnas5 = f131313e;
        bnas bnas6 = f131314f;
        bnas bnas7 = f131315g;
        f131318j = new bnas[]{bnas, bnas2, bnas3, bnas4, bnas5, bnas6, bnas7, bnar};
        f131317i = new bnas[]{bnas, bnas2, bnas3, bnas4, bnas5, bnas6, bnas7, bnar};
    }

    public bnas(String str, int i) {
    }

    /* renamed from: a */
    static bnas m108765a(bnbg bnbg, boolean z, boolean z2) {
        char c;
        char c2 = 0;
        if (bnbg == bnbg.WEAK) {
            c = 4;
        } else {
            c = 0;
        }
        boolean z3 = c | z;
        if (z2) {
            c2 = 2;
        }
        return f131317i[z3 | c2];
    }

    /* renamed from: b */
    static final void m108767b(bncc bncc, bncc bncc2) {
        bncc2.mo66993b(bncc.mo67002h());
        bncb.m108952b(bncc.mo67004j(), bncc2);
        bncb.m108952b(bncc2, bncc.mo67003i());
        bncb.m108951b(bncc);
    }

    public static bnas[] values() {
        return (bnas[]) f131318j.clone();
    }

    /* renamed from: a */
    static final void m108766a(bncc bncc, bncc bncc2) {
        bncc2.mo66989a(bncc.mo66999e());
        bncb.m108950a(bncc.mo67001g(), bncc2);
        bncb.m108950a(bncc2, bncc.mo67000f());
        bncb.m108949a(bncc);
    }

    /* renamed from: a */
    public bncc mo67016a(bnbe bnbe, bncc bncc, bncc bncc2) {
        return mo67017a(bnbe, bncc.mo66997d(), bncc.mo66995c(), bncc2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final bncc mo67017a(bnbe bnbe, Object obj, int i, bncc bncc) {
        switch (ordinal()) {
            case 0:
                return new bnbj(obj, i, bncc);
            case 1:
                return new bnbh(obj, i, bncc);
            case 2:
                return new bnbl(obj, i, bncc);
            case 3:
                return new bnbi(obj, i, bncc);
            case 4:
                return new bnbr(bnbe.f131356h, obj, i, bncc);
            case 5:
                return new bnbp(bnbe.f131356h, obj, i, bncc);
            case 6:
                return new bnbt(bnbe.f131356h, obj, i, bncc);
            case 7:
                return new bnbq(bnbe.f131356h, obj, i, bncc);
            default:
                throw null;
        }
    }
}
