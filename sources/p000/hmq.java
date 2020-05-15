package p000;

import com.google.android.gms.auth.api.credentials.Credential;

/* renamed from: hmq */
final /* synthetic */ class hmq implements bmxz {

    /* renamed from: a */
    private final Credential f20039a;

    public hmq(Credential credential) {
        this.f20039a = credential;
    }

    /* renamed from: a */
    public final boolean mo6527a(Object obj) {
        Credential credential = this.f20039a;
        Logger Logger = hms.f20041a;
        return credential.f10092a.equals(((qun) obj).f42170e);
    }
}
