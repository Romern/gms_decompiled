package p000;

/* renamed from: hgb */
final /* synthetic */ class hgb implements C1247om {

    /* renamed from: a */
    private final hgj f19695a;

    public hgb(hgj hgj) {
        this.f19695a = hgj;
    }

    /* renamed from: a */
    public final Object mo12294a() {
        hgj hgj = this.f19695a;
        hqu hqu = (hqu) hgj.f19709g.mo6606a();
        hgj.getChildFragmentManager().beginTransaction().add(hqu, "account_reauth").commitNow();
        hqu.mo12679a();
        return hgj.f19711i.mo12421a(adcv.SAVE_ACCOUNT_LINKING_TOKEN_EXTERNAL_CONSENT);
    }
}
