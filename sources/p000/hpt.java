package p000;

/* renamed from: hpt */
public final /* synthetic */ class hpt implements bqeh {

    /* renamed from: a */
    private final String f20196a;

    /* renamed from: b */
    private final boolean f20197b;

    public hpt(String str, boolean z) {
        this.f20196a = str;
        this.f20197b = z;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        String str = this.f20196a;
        boolean z = this.f20197b;
        hnc a = hnc.m14626a();
        adbj adbj = adbj.AUTH_API_CREDENTIALS_APP_SETTINGS_DATA_PROVIDER_SET_AUTO_SIGNIN_ENABLED_FOR_APP;
        a.mo12623a(str, z);
        bqgg a2 = bqga.m112775a(Boolean.valueOf(z));
        ((hez) obj).mo12448a(adbj, a2);
        return a2;
    }
}
