package p000;

/* renamed from: adcg */
final /* synthetic */ class adcg implements C0038ax {

    /* renamed from: a */
    private final adch f61366a;

    /* renamed from: b */
    private final C0038ax f61367b;

    public adcg(adch adch, C0038ax axVar) {
        this.f61366a = adch;
        this.f61367b = axVar;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        adch adch = this.f61366a;
        C0038ax axVar = this.f61367b;
        if (adch.f61368a.compareAndSet(true, false)) {
            axVar.mo2511a(obj);
        }
    }
}
