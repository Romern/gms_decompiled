package p000;

/* renamed from: ahpf */
public final /* synthetic */ class ahpf implements Runnable {

    /* renamed from: a */
    private final ahpg f67708a;

    /* renamed from: b */
    private final String f67709b;

    public ahpf(ahpg ahpg, String str) {
        this.f67708a = ahpg;
        this.f67709b = str;
    }

    public final void run() {
        ahpg ahpg = this.f67708a;
        String str = this.f67709b;
        if (!ahpg.f67710a.mo36728k()) {
            ((bnsl) ahkm.f67363a.mo68388c()).mo68420a("Ignoring lost BluetoothDevice %s because Connections is no longer discovering.", str);
        } else if (ahpg.mo36945a(ahmr.m56189a(str))) {
            ((bnsl) ahkm.f67363a.mo68390d()).mo68420a("Processing lost BluetoothDeviceName %s.", str);
            ahme ahme = (ahme) ahpg.f67713d.remove(str);
            if (ahme != null && ahpg.f67714e.mo36957a(ahme)) {
                ((bnsl) ahkm.f67363a.mo68390d()).mo68425a("Lost BluetoothEndpoint for BluetoothDeviceName %s (with EndpointId %s and EndpointInfo %s).", str, ahme.f67521b, ahkm.m55981a(ahme.f67522c));
                ahpg.f67714e.mo36854c(ahpg.f67710a, ahme);
            }
        }
    }
}
