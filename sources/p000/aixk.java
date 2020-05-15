package p000;

/* renamed from: aixk */
final /* synthetic */ class aixk implements bvat {

    /* renamed from: a */
    private final aixs f69986a;

    /* renamed from: b */
    private final ajgp f69987b;

    /* renamed from: c */
    private final bzbu f69988c;

    /* renamed from: d */
    private final aixj f69989d;

    public aixk(aixs aixs, aixj aixj, ajgp ajgp, bzbu bzbu) {
        this.f69986a = aixs;
        this.f69989d = aixj;
        this.f69987b = ajgp;
        this.f69988c = bzbu;
    }

    /* renamed from: a */
    public final void mo36284a(bxxc bxxc) {
        int a;
        aixs aixs = this.f69986a;
        aixj aixj = this.f69989d;
        ajgp ajgp = this.f69987b;
        bzbu bzbu = this.f69988c;
        bvai bvai = (bvai) bxxc;
        bvac bvac = bvac.OPERATION_STATUS_UNKNOWN;
        bzbu bzbu2 = bzbu.TOKEN_MEDIUM_UNKNOWN;
        bvaa bvaa = bvai.f155483b;
        if (bvaa == null) {
            bvaa = bvaa.f155448d;
        }
        bvac a2 = bvac.m120825a(bvaa.f155452c);
        if (a2 == null) {
            a2 = bvac.OPERATION_STATUS_UNKNOWN;
        }
        int ordinal = a2.ordinal();
        if (ordinal == 3 || ordinal == 4) {
            if (aixj != null) {
                aixs.f70018e.mo72987c(new aixp("ScanComplete", aixj, bvai));
            }
        } else if (bvai.f155484c.size() != 0) {
            bvae bvae = (bvae) bvai.f155484c.get(0);
            if ((bvae.f155474a & 4) == 0) {
                ahfv ahfv = null;
                if (bvae != null && bzbu == bzbu.BLUETOOTH_CLASSIC_NAME && (a = bvag.m120831a(bvae.f155475b)) != 0 && a == 4) {
                    buzg buzg = bvae.f155476c;
                    if (buzg == null) {
                        buzg = buzg.f155373d;
                    }
                    buzq buzq = buzg.f155376b;
                    if (buzq == null) {
                        buzq = buzq.f155418c;
                    }
                    ahfv = new ahfv(buzq.f155421b);
                }
                if (ahfv != null) {
                    buqh buqh = aixs.f70018e;
                    String valueOf = String.valueOf(ahfv.mo36407a());
                    buqh.mo72987c(new aixr(valueOf.length() == 0 ? new String("NearbyDirectMediums.onTokenDetected:") : "NearbyDirectMediums.onTokenDetected:".concat(valueOf), ajgp, ahfv, bzbu));
                    return;
                }
                return;
            }
            aixs.f70018e.mo72987c(new aixq(aixs, "NearbyDirectMediums.handleBleScanResult", ajgp, bvae));
        }
    }
}
