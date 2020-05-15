package p000;

/* renamed from: ocn */
final /* synthetic */ class ocn implements aubq {

    /* renamed from: a */
    private final C1582ocr f37181a;

    public ocn(C1582ocr ocr) {
        this.f37181a = ocr;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        C1582ocr ocr = this.f37181a;
        if (!aucb.mo50384b() || aucb.mo50386d() == null) {
            bnsi b = C1582ocr.f37187a.mo68387b();
            b.mo68437a(aucb.mo50387e());
            b.mo68432a("ocr", "a", 109, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("CarTelemetryCheckboxFeature exception");
        } else {
            ocr.f37190d.set(((rkj) aucb.mo50386d()).mo24824r() ? ocq.ENABLED : ocq.DISABLED);
            synchronized (ocr) {
                ocp ocp = ocr.f37189c;
                if (ocp != null) {
                    ocp.mo21974a();
                }
            }
            ocr.f37190d.toString();
            Thread.currentThread().getName();
        }
        ocr.f37188b.set(false);
    }
}
