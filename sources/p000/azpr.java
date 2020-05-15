package p000;

/* renamed from: azpr */
final /* synthetic */ class azpr implements bdaq {

    /* renamed from: a */
    private final azpw f99846a;

    public azpr(azpw azpw) {
        this.f99846a = azpw;
    }

    /* renamed from: a */
    public final void mo54573a(Object obj) {
        azpw azpw = this.f99846a;
        bnre i = ((bngx) obj).listIterator();
        while (i.hasNext()) {
            new soa(9, new azps(azpw, (bcsp) i.next())).start();
        }
    }
}
