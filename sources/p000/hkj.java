package p000;

/* renamed from: hkj */
final /* synthetic */ class hkj implements bmxj {

    /* renamed from: a */
    private final hkq f19943a;

    /* renamed from: b */
    private final hez f19944b;

    public hkj(hkq hkq, hez hez) {
        this.f19943a = hkq;
        this.f19944b = hez;
    }

    public final Object apply(Object obj) {
        hkq hkq = this.f19943a;
        hez hez = this.f19944b;
        acyr acyr = (acyr) obj;
        adbj adbj = adbj.AUTH_API_CREDENTIALS_CREDENTIAL_DATA_PROVIDER_LIST_CREDENTIALS;
        bqgg a = hkq.f19953b.mo12613a(acyr, hkq.f19952a);
        hez.mo12448a(adbj, a);
        return bqdx.m112673a(a, new hkl(hkq, acyr), bqfb.INSTANCE);
    }
}
