package p000;

import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;
import com.google.android.gms.auth.api.identity.SignInCredential;

/* renamed from: hkf */
final /* synthetic */ class hkf implements bmxj {

    /* renamed from: a */
    static final bmxj f19933a = new hkf();

    private hkf() {
    }

    public final Object apply(Object obj) {
        sek sek = hkh.f19936a;
        SignInCredential signInCredential = ((InternalSignInCredentialWrapper) obj).f10233g;
        if (signInCredential.f10253f != null) {
            return Integer.valueOf(signInCredential.mo7495a());
        }
        return Integer.MAX_VALUE;
    }
}
