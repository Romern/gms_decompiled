package p000;

/* renamed from: ahpc */
public final /* synthetic */ class ahpc implements Runnable {

    /* renamed from: a */
    private final ahpd f67698a;

    /* renamed from: b */
    private final aipt f67699b;

    public ahpc(ahpd ahpd, aipt aipt) {
        this.f67698a = ahpd;
        this.f67699b = aipt;
    }

    public final void run() {
        ahpd ahpd = this.f67698a;
        aipt aipt = this.f67699b;
        if (!ahpd.f67700a.mo36728k()) {
            ((bnsl) ahkm.f67363a.mo68388c()).mo68420a("Ignoring lost BlePeripheral %s because we are no longer discovering.", aipt);
            return;
        }
        ((bnsl) ahkm.f67363a.mo68390d()).mo68420a("Processing lost BlePeripheral %s.", aipt);
        ahmd ahmd = (ahmd) ahpd.f67703d.remove(aipt);
        if (ahmd != null) {
            ((bnsl) ahkm.f67363a.mo68390d()).mo68425a("Lost BleEndpoint for BlePeripheral %s (with EndpointId %s and EndpointInfo %s).", aipt, ahmd.f67521b, ahkm.m55981a(ahmd.f67522c));
            ahpd.f67705f.mo36854c(ahpd.f67700a, ahmd);
        }
        ahme ahme = (ahme) ahpd.f67704e.remove(aipt);
        if (ahme != null && ahpd.f67705f.mo36957a(ahme)) {
            ((bnsl) ahkm.f67363a.mo68390d()).mo68425a("Lost BluetoothEndpoint for BlePeripheral %s (with EndpointId %s and EndpointInfo %s).", aipt, ahme.f67521b, ahkm.m55981a(ahme.f67522c));
            ahpd.f67705f.mo36854c(ahpd.f67700a, ahme);
        }
    }
}
