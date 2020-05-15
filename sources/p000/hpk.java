package p000;

import android.accounts.Account;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.internal.InternalCredentialWrapper;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;
import com.google.android.gms.auth.api.identity.SignInCredential;

/* renamed from: hpk */
final /* synthetic */ class hpk implements bmxj {

    /* renamed from: a */
    static final bmxj f20168a = new hpk();

    private hpk() {
    }

    public final Object apply(Object obj) {
        InternalCredentialWrapper internalCredentialWrapper = (InternalCredentialWrapper) obj;
        Credential credential = internalCredentialWrapper.f10139a;
        Account account = internalCredentialWrapper.f10140b;
        sdo.m34959a(account);
        return new InternalSignInCredentialWrapper(account, new SignInCredential(credential.f10092a, credential.f10093b, credential.f10098g, credential.f10099h, credential.f10094c, credential.f10096e, null), bngx.m109376e(), false);
    }
}
