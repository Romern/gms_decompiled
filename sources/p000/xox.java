package p000;

import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.CableAuthenticationExtension;
import com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension;

/* renamed from: xox */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xox {

    /* renamed from: a */
    public FidoAppIdExtension f52848a;

    /* renamed from: b */
    public UserVerificationMethodExtension f52849b;

    /* renamed from: c */
    public CableAuthenticationExtension f52850c;

    /* renamed from: a */
    public final AuthenticationExtensions mo29982a() {
        return new AuthenticationExtensions(this.f52848a, this.f52850c, this.f52849b);
    }
}
