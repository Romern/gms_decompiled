package p000;

/* renamed from: bbtc */
final /* synthetic */ class bbtc implements bdaq {

    /* renamed from: a */
    private final long f103328a;

    /* renamed from: b */
    private final bqgy f103329b;

    public bbtc(long j, bqgy bqgy) {
        this.f103328a = j;
        this.f103329b = bqgy;
    }

    /* renamed from: a */
    public final void mo54573a(Object obj) {
        long j = this.f103328a;
        bqgy bqgy = this.f103329b;
        bmxv bmxv = (bmxv) obj;
        long j2 = bbub.f103378a;
        boolean z = false;
        if (bmxv.mo66813a() && ((bcsp) bmxv.mo66814b()).mo57323g().longValue() >= j) {
            z = true;
        }
        bqgy.mo69138b(Boolean.valueOf(z));
    }
}
