package p000;

/* renamed from: hjx */
final /* synthetic */ class hjx implements bqeh {

    /* renamed from: a */
    private final hkh f19922a;

    /* renamed from: b */
    private final hez f19923b;

    public hjx(hkh hkh, hez hez) {
        this.f19922a = hkh;
        this.f19923b = hez;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        hkh hkh = this.f19922a;
        hez hez = this.f19923b;
        bngx bngx = (bngx) obj;
        if (bngx.isEmpty()) {
            throw adbe.m50106a(28433);
        } else if (!hkh.f19940d.f10212a.f10220a) {
            return bqga.m112775a((Object) bngx.m109376e());
        } else {
            return new hpl(hkh.f19938b, hkh.f19939c, bngx).mo12291a(hez);
        }
    }
}
