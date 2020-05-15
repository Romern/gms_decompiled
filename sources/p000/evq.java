package p000;

/* renamed from: evq */
final /* synthetic */ class evq implements ewg {

    /* renamed from: a */
    private final evs f15890a;

    /* renamed from: b */
    private final bswr f15891b;

    public evq(evs evs, bswr bswr) {
        this.f15890a = evs;
        this.f15891b = bswr;
    }

    /* renamed from: a */
    public final void mo10534a(Throwable th) {
        evs evs = this.f15890a;
        bswr bswr = this.f15891b;
        evs.f15895c.mo25412b("Error starting native action %d", Integer.valueOf(bswr.f147482b), th);
        evs.f15897e.mo10534a(th);
    }
}
