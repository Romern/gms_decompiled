package p000;

/* renamed from: bape */
final /* synthetic */ class bape implements bmxj {

    /* renamed from: a */
    private final bapk f101469a;

    public bape(bapk bapk) {
        this.f101469a = bapk;
    }

    public final Object apply(Object obj) {
        bpyi bpyi = (bpyi) obj;
        if (!this.f101469a.f101495k.f101512n.mo32682d()) {
            bxvd da = bpyi.f139852o.mo74144da();
            bqaq bqaq = bqaq.SUCCESS;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpyi bpyi2 = (bpyi) da.f164949b;
            bpyi2.f139856c = bqaq.mo3214a();
            bpyi2.f139854a |= 2;
            return (bpyi) da.mo74062i();
        }
        bxvd bxvd = (bxvd) bpyi.mo74142c(5);
        bxvd.mo73625a((bxvk) bpyi);
        bqaq bqaq2 = bqaq.SUCCESS;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpyi bpyi3 = (bpyi) bxvd.f164949b;
        bpyi bpyi4 = bpyi.f139852o;
        bpyi3.f139856c = bqaq2.mo3214a();
        bpyi3.f139854a |= 2;
        return (bpyi) bxvd.mo74062i();
    }
}
