package p000;

/* renamed from: odh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class odh extends odf {

    /* renamed from: A */
    private bmxv f37246A;

    /* renamed from: B */
    private bngx f37247B;

    /* renamed from: a */
    public bpcy f37248a;

    /* renamed from: b */
    public bpeb f37249b;

    /* renamed from: c */
    public bpea f37250c;

    /* renamed from: d */
    public bmxv f37251d;

    /* renamed from: e */
    public bmxv f37252e;

    /* renamed from: f */
    public bmxv f37253f;

    /* renamed from: g */
    public int f37254g;

    /* renamed from: h */
    private bmxv f37255h;

    /* renamed from: i */
    private bmxv f37256i;

    /* renamed from: j */
    private bnic f37257j;

    /* renamed from: k */
    private bmxv f37258k;

    /* renamed from: l */
    private bmxv f37259l;

    /* renamed from: m */
    private bmxv f37260m;

    /* renamed from: n */
    private bmxv f37261n;

    /* renamed from: o */
    private bmxv f37262o;

    /* renamed from: p */
    private bmxv f37263p;

    /* renamed from: q */
    private bmxv f37264q;

    /* renamed from: r */
    private bmxv f37265r;

    /* renamed from: s */
    private bmxv f37266s;

    /* renamed from: t */
    private bmxv f37267t;

    /* renamed from: u */
    private bmxv f37268u;

    /* renamed from: v */
    private bmxv f37269v;

    /* renamed from: w */
    private bngx f37270w;

    /* renamed from: x */
    private bmxv f37271x;

    /* renamed from: y */
    private bmxv f37272y;

    /* renamed from: z */
    private bmxv f37273z;

    public odh() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ odg mo22017a() {
        if (this.f37257j == null) {
            this.f37257j = bnon.f131923a;
        }
        if (this.f37270w == null) {
            this.f37270w = bngx.m109376e();
        }
        if (this.f37247B == null) {
            this.f37247B = bngx.m109376e();
        }
        String str = this.f37254g == 0 ? " carEventType" : "";
        if (this.f37248a == null) {
            str = str.concat(" domainIdType");
        }
        if (this.f37249b == null) {
            str = String.valueOf(str).concat(" context");
        }
        if (this.f37250c == null) {
            str = String.valueOf(str).concat(" action");
        }
        if (str.isEmpty()) {
            return new odd(this.f37254g, this.f37248a, this.f37255h, this.f37256i, this.f37257j, this.f37249b, this.f37250c, this.f37258k, this.f37251d, this.f37259l, this.f37260m, this.f37261n, this.f37262o, this.f37263p, this.f37264q, this.f37265r, this.f37266s, this.f37267t, this.f37268u, this.f37269v, this.f37270w, this.f37252e, this.f37253f, this.f37271x, this.f37272y, this.f37273z, this.f37246A, this.f37247B);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    public odh(byte[] bArr) {
        this.f37255h = bmvz.f131120a;
        this.f37256i = bmvz.f131120a;
        this.f37258k = bmvz.f131120a;
        this.f37251d = bmvz.f131120a;
        this.f37259l = bmvz.f131120a;
        this.f37260m = bmvz.f131120a;
        this.f37261n = bmvz.f131120a;
        this.f37262o = bmvz.f131120a;
        this.f37263p = bmvz.f131120a;
        this.f37264q = bmvz.f131120a;
        this.f37265r = bmvz.f131120a;
        this.f37266s = bmvz.f131120a;
        this.f37267t = bmvz.f131120a;
        this.f37268u = bmvz.f131120a;
        this.f37269v = bmvz.f131120a;
        this.f37252e = bmvz.f131120a;
        this.f37253f = bmvz.f131120a;
        this.f37271x = bmvz.f131120a;
        this.f37272y = bmvz.f131120a;
        this.f37273z = bmvz.f131120a;
        this.f37246A = bmvz.f131120a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ odg mo22018a(odg odg) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        odi odi = (odi) odg;
        boolean z5 = false;
        if (odi.mo21987B() != 1) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108601b(z, "carEventType is required.");
        if (odi.mo21988a() != bpcy.DOMAIN_UNSPECIFIED) {
            z2 = true;
        } else {
            z2 = false;
        }
        bmxy.m108601b(z2, "domainIdType is required");
        if (odi.mo21992e() != bpeb.UNKNOWN_CONTEXT) {
            z3 = true;
        } else {
            z3 = false;
        }
        bmxy.m108601b(z3, "UNKNOWN_CONTEXT is not a valid context");
        if (odi.mo21994f() != bpea.UNKNOWN_ACTION) {
            z4 = true;
        } else {
            z4 = false;
        }
        bmxy.m108601b(z4, "UNKNOWN_ACTION is not a valid action");
        if (!odi.mo22012v().mo66813a() || odi.mo22012v().mo66814b() != bpec.ERROR_UNSPECIFIED) {
            z5 = true;
        }
        bmxy.m108601b(z5, "ERROR_UNSPECIFIED is not a valid error");
        return odi;
    }
}
