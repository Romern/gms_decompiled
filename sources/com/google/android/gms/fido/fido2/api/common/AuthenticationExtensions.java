package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AuthenticationExtensions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new xpa();

    /* renamed from: a */
    public final FidoAppIdExtension f31715a;

    /* renamed from: b */
    public final CableAuthenticationExtension f31716b;

    /* renamed from: c */
    public final UserVerificationMethodExtension f31717c;

    public AuthenticationExtensions(FidoAppIdExtension fidoAppIdExtension, CableAuthenticationExtension cableAuthenticationExtension, UserVerificationMethodExtension userVerificationMethodExtension) {
        this.f31715a = fidoAppIdExtension;
        this.f31717c = userVerificationMethodExtension;
        this.f31716b = cableAuthenticationExtension;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AuthenticationExtensions) {
            AuthenticationExtensions authenticationExtensions = (AuthenticationExtensions) obj;
            if (!sdg.m34949a(this.f31715a, authenticationExtensions.f31715a) || !sdg.m34949a(this.f31716b, authenticationExtensions.f31716b) || !sdg.m34949a(this.f31717c, authenticationExtensions.f31717c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31715a, this.f31716b, this.f31717c});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f31715a, i, false);
        see.m35040a(parcel, 3, this.f31716b, i, false);
        see.m35040a(parcel, 4, this.f31717c, i, false);
        see.m35062b(parcel, a);
    }
}
