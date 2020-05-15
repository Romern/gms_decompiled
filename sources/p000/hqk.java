package p000;

import android.util.Patterns;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.HintRequest;

/* renamed from: hqk */
final /* synthetic */ class hqk implements bmxz {

    /* renamed from: a */
    private final hql f20227a;

    public hqk(hql hql) {
        this.f20227a = hql;
    }

    /* renamed from: a */
    public final boolean mo6527a(Object obj) {
        Credential credential = (Credential) obj;
        HintRequest hintRequest = this.f20227a.f20230c;
        if (!bmxx.m108577a(credential.f10097f)) {
            return bnpf.m110050a(hintRequest.f10117e).contains(credential.f10097f);
        }
        if (hintRequest.f10115c && Patterns.EMAIL_ADDRESS.matcher(credential.f10092a).matches()) {
            return true;
        }
        if (!hintRequest.f10116d || !Patterns.PHONE.matcher(credential.f10092a).matches()) {
            return false;
        }
        return true;
    }
}
