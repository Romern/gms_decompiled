package p000;

/* renamed from: hra */
final /* synthetic */ class hra implements bqeh {

    /* renamed from: a */
    private final hre f20287a;

    /* renamed from: b */
    private final hez f20288b;

    /* renamed from: c */
    private final acyr f20289c;

    public hra(hre hre, hez hez, acyr acyr) {
        this.f20287a = hre;
        this.f20288b = hez;
        this.f20289c = acyr;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        hre hre = this.f20287a;
        hez hez = this.f20288b;
        acyr acyr = this.f20289c;
        if (!((Boolean) obj).booleanValue()) {
            return bqga.m112775a((Object) bngx.m109376e());
        }
        adbj adbj = adbj.AUTH_API_CREDENTIALS_CREDENTIAL_DATA_PROVIDER_LIST_CREDENTIALS;
        bqgg a = hre.f20294a.mo12597a(acyr, hre.f20295b);
        hez.mo12448a(adbj, a);
        return a;
    }
}
