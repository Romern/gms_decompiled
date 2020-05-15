package p000;

/* renamed from: hcx */
final /* synthetic */ class hcx implements C1247om {

    /* renamed from: a */
    private final hdf f19483a;

    public hcx(hdf hdf) {
        this.f19483a = hdf;
    }

    /* renamed from: a */
    public final Object mo12294a() {
        hdf hdf = this.f19483a;
        if (hdf.f19506l != null) {
            return bqga.m112775a(bmxv.m108566b(adcq.EXTERNAL_REAUTH_ACCOUNT));
        }
        if (((acza) hdf.getChildFragmentManager().findFragmentByTag("account_chooser")) == null) {
            acza a = acza.m50025a(hdf.f19497c, bngx.m109356a("com.google"), hdf.f19496b.f10204f);
            hdf.getChildFragmentManager().beginTransaction().add(a, "account_chooser").commitNow();
            a.mo33260a();
        }
        return hdf.f19501g.mo12421a(adcq.EXTERNAL_REAUTH_ACCOUNT);
    }
}
