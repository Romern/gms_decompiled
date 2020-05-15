package p000;

import com.google.android.gms.auth.api.credentials.Credential;

/* renamed from: hmp */
final /* synthetic */ class hmp implements bmxj {

    /* renamed from: a */
    private final Credential f20038a;

    public hmp(Credential credential) {
        this.f20038a = credential;
    }

    public final Object apply(Object obj) {
        Credential credential = this.f20038a;
        hms.f20041a.mo25417e("Failed to get id token.", (Exception) obj, new Object[0]);
        return credential;
    }
}
