package p000;

/* renamed from: ahpn */
public final /* synthetic */ class ahpn implements Runnable {

    /* renamed from: a */
    private final ahpo f67735a;

    /* renamed from: b */
    private final aiqc f67736b;

    public ahpn(ahpo ahpo, aiqc aiqc) {
        this.f67735a = ahpo;
        this.f67736b = aiqc;
    }

    public final void run() {
        ahpo ahpo = this.f67735a;
        aiqc aiqc = this.f67736b;
        ahmp a = ahmp.m56181a(aiqc);
        if (a != null) {
            srn srn = ahkm.f67363a;
            ahkm.m55981a(ahpo.f67738b);
        } else {
            srz.m36171a(aiqc);
        }
        ahpo.f67739c.mo36844a(ahpo.f67737a, aiqc.f69126a, a, bvif.BLE);
    }
}
