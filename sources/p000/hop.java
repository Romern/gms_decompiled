package p000;

/* renamed from: hop */
final /* synthetic */ class hop implements bmxj {

    /* renamed from: a */
    private final hou f20132a;

    /* renamed from: b */
    private final hez f20133b;

    public hop(hou hou, hez hez) {
        this.f20132a = hou;
        this.f20133b = hez;
    }

    public final Object apply(Object obj) {
        hou hou = this.f20132a;
        hez hez = this.f20133b;
        acyr acyr = (acyr) obj;
        adbj adbj = adbj.AUTH_API_CREDENTIALS_ACCOUNT_SETTINGS_DATA_PROVIDER_IS_SERVICE_ENABLED;
        bqgg a = hou.f20138a.mo12602a(acyr);
        hez.mo12448a(adbj, a);
        return bqdx.m112673a(a, new hot(acyr), bqfb.INSTANCE);
    }
}
