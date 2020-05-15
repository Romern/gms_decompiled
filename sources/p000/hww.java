package p000;

import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;

/* renamed from: hww */
public final /* synthetic */ class hww implements roo {

    /* renamed from: a */
    private final String f20487a;

    /* renamed from: b */
    private final BeginSignInRequest f20488b;

    /* renamed from: c */
    private final InternalSignInCredentialWrapper f20489c;

    public hww(String str, BeginSignInRequest beginSignInRequest, InternalSignInCredentialWrapper internalSignInCredentialWrapper) {
        this.f20487a = str;
        this.f20488b = beginSignInRequest;
        this.f20489c = internalSignInCredentialWrapper;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        String str = this.f20487a;
        BeginSignInRequest beginSignInRequest = this.f20488b;
        InternalSignInCredentialWrapper internalSignInCredentialWrapper = this.f20489c;
        ((hwi) ((hwt) obj).mo25289B()).mo12580a(new hvv((aucf) obj2), str, beginSignInRequest, internalSignInCredentialWrapper);
    }
}
