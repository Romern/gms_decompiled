package p000;

/* renamed from: aaha */
final /* synthetic */ class aaha implements aubt {

    /* renamed from: a */
    private final aahd f28102a;

    public aaha(aahd aahd) {
        this.f28102a = aahd;
    }

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        aahd aahd = this.f28102a;
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        aahd.f28106b.mo16843a(2025, -1, exc);
    }
}
