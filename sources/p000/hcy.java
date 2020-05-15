package p000;

/* renamed from: hcy */
final /* synthetic */ class hcy implements C1247om {

    /* renamed from: a */
    private final hdf f19484a;

    public hcy(hdf hdf) {
        this.f19484a = hdf;
    }

    /* renamed from: a */
    public final Object mo12294a() {
        hdf hdf = this.f19484a;
        hqu hqu = (hqu) hdf.f19515u.mo6606a();
        hdf.getChildFragmentManager().beginTransaction().add(hqu, "account_reauth").commitNow();
        hqu.mo12679a();
        return hdf.f19501g.mo12421a(adcq.AUTH_ACCOUNT);
    }
}
