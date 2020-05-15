package p000;

/* renamed from: hao */
final /* synthetic */ class hao implements C1247om {

    /* renamed from: a */
    private final hav f19355a;

    public hao(hav hav) {
        this.f19355a = hav;
    }

    /* renamed from: a */
    public final Object mo12294a() {
        hav hav = this.f19355a;
        hqu hqu = (hqu) hav.f19365d.mo12294a();
        hav.getChildFragmentManager().beginTransaction().add(hqu, "reauth_account").commitNow();
        hqu.mo12679a();
        return hav.f19362a.mo12421a(adcs.DISPLAY_CONSENT_SCREEN);
    }
}
