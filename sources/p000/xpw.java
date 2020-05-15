package p000;

import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;

/* renamed from: xpw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xpw {

    /* renamed from: a */
    public AuthenticatorResponse f52903a;

    /* renamed from: b */
    public AuthenticationExtensionsClientOutputs f52904b;

    /* renamed from: a */
    public final PublicKeyCredential mo30021a() {
        AuthenticatorAttestationResponse authenticatorAttestationResponse;
        AuthenticatorAssertionResponse authenticatorAssertionResponse;
        AuthenticatorErrorResponse authenticatorErrorResponse;
        AuthenticatorResponse authenticatorResponse = this.f52903a;
        if (authenticatorResponse instanceof AuthenticatorAttestationResponse) {
            authenticatorAttestationResponse = (AuthenticatorAttestationResponse) authenticatorResponse;
        } else {
            authenticatorAttestationResponse = null;
        }
        if (authenticatorResponse instanceof AuthenticatorAssertionResponse) {
            authenticatorAssertionResponse = (AuthenticatorAssertionResponse) authenticatorResponse;
        } else {
            authenticatorAssertionResponse = null;
        }
        if (authenticatorResponse instanceof AuthenticatorErrorResponse) {
            authenticatorErrorResponse = (AuthenticatorErrorResponse) authenticatorResponse;
        } else {
            authenticatorErrorResponse = null;
        }
        return new PublicKeyCredential(null, PublicKeyCredentialType.PUBLIC_KEY.f31794b, null, authenticatorAttestationResponse, authenticatorAssertionResponse, authenticatorErrorResponse, this.f52904b);
    }
}
