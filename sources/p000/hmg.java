package p000;

import android.util.Patterns;
import com.google.android.gms.auth.api.credentials.Credential;

/* renamed from: hmg */
final /* synthetic */ class hmg implements bmxz {

    /* renamed from: a */
    static final bmxz f20020a = new hmg();

    private hmg() {
    }

    /* renamed from: a */
    public final boolean mo6527a(Object obj) {
        Logger Logger = hms.f20041a;
        return Patterns.EMAIL_ADDRESS.matcher(((Credential) obj).f10092a).matches();
    }
}
