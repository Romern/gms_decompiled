package p000;

/* renamed from: hga */
final /* synthetic */ class hga implements C1247om {

    /* renamed from: a */
    private final hgj f19694a;

    public hga(hgj hgj) {
        this.f19694a = hgj;
    }

    /* renamed from: a */
    public final Object mo12294a() {
        hgj hgj = this.f19694a;
        if (((acza) hgj.getChildFragmentManager().findFragmentByTag("account_chooser")) == null) {
            acza a = acza.m50025a(hgj.f19707e, bngx.m109356a("com.google"), null);
            hgj.getChildFragmentManager().beginTransaction().add(a, "account_chooser").commitNow();
            a.mo33260a();
        }
        return hgj.f19711i.mo12421a(adcv.SAVE_ACCOUNT_LINKING_TOKEN_REAUTH_ACCOUNT);
    }
}
