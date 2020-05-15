package p000;

import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.CableAuthenticationExtension;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension;
import com.google.android.gms.fido.fido2.api.common.UserVerificationRequirement;
import java.util.List;

/* renamed from: xfa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xfa extends xfd {

    /* renamed from: a */
    private final xlw f52106a;

    /* renamed from: b */
    private final boolean f52107b;

    /* renamed from: c */
    private final boolean f52108c;

    public xfa(xlw xlw, boolean z, boolean z2) {
        this.f52106a = xlw;
        this.f52107b = z;
        this.f52108c = z2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo12637b(Object obj) {
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) obj;
        xkm xkm = new xkm();
        xkm.mo29867a(publicKeyCredentialRequestOptions.f31783c);
        xkm.mo29868a(this.f52106a.mo29927c());
        UserVerificationRequirement userVerificationRequirement = publicKeyCredentialRequestOptions.f31787g;
        if (userVerificationRequirement != null) {
            int ordinal = userVerificationRequirement.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        if (this.f52108c) {
                            xkm.f52557d = false;
                            xkm.f52556c = true;
                        } else {
                            throw adbe.m50108a("Authenticator does not support user presence.", 13).mo33303c();
                        }
                    }
                } else if (this.f52107b) {
                    xkm.f52557d = true;
                    xkm.f52556c = false;
                } else if (this.f52108c) {
                    xkm.f52557d = false;
                    xkm.f52556c = true;
                } else {
                    throw adbe.m50108a("Authenticator does not support user presence.", 13).mo33303c();
                }
            } else if (this.f52107b) {
                xkm.f52557d = true;
                xkm.f52556c = false;
            } else {
                throw adbe.m50108a("Authenticator does not support user verification.", 13).mo33303c();
            }
        }
        List list = publicKeyCredentialRequestOptions.f31784d;
        if (list != null) {
            xkm.f52554a = list;
        }
        AuthenticationExtensions authenticationExtensions = publicKeyCredentialRequestOptions.f31788h;
        if (authenticationExtensions != null) {
            xox xox = new xox();
            CableAuthenticationExtension cableAuthenticationExtension = authenticationExtensions.f31716b;
            UserVerificationMethodExtension userVerificationMethodExtension = authenticationExtensions.f31717c;
            if (cableAuthenticationExtension != null) {
                xox.f52850c = cableAuthenticationExtension;
            }
            if (userVerificationMethodExtension != null) {
                xox.f52849b = userVerificationMethodExtension;
            }
            xkm.f52555b = xox.mo29982a();
        }
        return xkm.mo29866a();
    }
}
