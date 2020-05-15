package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.CableAuthenticationExtension;
import com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension;

/* renamed from: xpa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xpa implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AuthenticationExtensions[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        FidoAppIdExtension fidoAppIdExtension = null;
        CableAuthenticationExtension cableAuthenticationExtension = null;
        UserVerificationMethodExtension userVerificationMethodExtension = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                fidoAppIdExtension = (FidoAppIdExtension) sed.m34998a(parcel, readInt, FidoAppIdExtension.CREATOR);
            } else if (a == 3) {
                cableAuthenticationExtension = (CableAuthenticationExtension) sed.m34998a(parcel, readInt, CableAuthenticationExtension.CREATOR);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                userVerificationMethodExtension = (UserVerificationMethodExtension) sed.m34998a(parcel, readInt, UserVerificationMethodExtension.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new AuthenticationExtensions(fidoAppIdExtension, cableAuthenticationExtension, userVerificationMethodExtension);
    }
}
