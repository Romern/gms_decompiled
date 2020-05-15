package p000;

/* renamed from: bapj */
final /* synthetic */ class bapj implements bmxj {

    /* renamed from: a */
    private final bapk f101478a;

    /* renamed from: b */
    private final long f101479b;

    /* renamed from: c */
    private final boolean f101480c;

    /* renamed from: d */
    private final baqa f101481d;

    /* renamed from: e */
    private final Long f101482e;

    /* renamed from: f */
    private final boolean f101483f;

    /* renamed from: g */
    private final boolean f101484g;

    public bapj(bapk bapk, long j, boolean z, baqa baqa, Long l, boolean z2, boolean z3) {
        this.f101478a = bapk;
        this.f101479b = j;
        this.f101480c = z;
        this.f101481d = baqa;
        this.f101482e = l;
        this.f101483f = z2;
        this.f101484g = z3;
    }

    public final Object apply(Object obj) {
        bapk bapk = this.f101478a;
        long j = this.f101479b;
        boolean z = this.f101480c;
        baqa baqa = this.f101481d;
        Long l = this.f101482e;
        boolean z2 = this.f101483f;
        boolean z3 = this.f101484g;
        bpyi bpyi = (bpyi) obj;
        synchronized (bapk.f101495k.f101508j) {
            bxvd bxvd = (bxvd) bpyi.mo74142c(5);
            bxvd.mo73625a((bxvk) bpyi);
            bapk.mo55862a(j, z, baqa, l, z2, z3, bxvd);
        }
        return null;
    }
}
