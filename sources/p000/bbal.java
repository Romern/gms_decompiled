package p000;

/* renamed from: bbal */
final /* synthetic */ class bbal implements bqeh {

    /* renamed from: a */
    private final bbav f102221a;

    /* renamed from: b */
    private final bavr f102222b;

    public bbal(bbav bbav, bavr bavr) {
        this.f102221a = bbav;
        this.f102222b = bavr;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bbav bbav = this.f102221a;
        bavr bavr = this.f102222b;
        bavd bavd = (bavd) obj;
        if (bavd != null) {
            bavn bavn = bavd.f101879i;
            if (bavn == null) {
                bavn = bavn.f101895f;
            }
            int a = bavi.m87601a(bavn.f101901e);
            if (a != 0 && a == 2) {
                return bqdx.m112673a(bbav.f102247d.mo56056b(bavr), new bbad(bbav), bbav.f102251h);
            }
        }
        return bqga.m112775a((Object) null);
    }
}
