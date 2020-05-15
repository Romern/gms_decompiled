package p000;

/* renamed from: azqc */
public final /* synthetic */ class azqc implements bdaq {

    /* renamed from: a */
    private final azqf f99867a;

    /* renamed from: b */
    private final bcoh f99868b;

    public azqc(azqf azqf, bcoh bcoh) {
        this.f99867a = azqf;
        this.f99868b = bcoh;
    }

    /* renamed from: a */
    public final void mo54573a(Object obj) {
        azqf azqf = this.f99867a;
        bcoh bcoh = this.f99868b;
        bnre i = ((bngx) obj).listIterator();
        while (i.hasNext()) {
            new soa(9, new azqe(azqf, bcoh, (bcsp) i.next())).start();
        }
    }
}
