package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mobilesubscription.serviceconfig.AuthStatus;
import com.google.android.gms.mobilesubscription.serviceconfig.AuthType;
import com.google.android.gms.mobilesubscription.serviceconfig.CarrierInfo;
import com.google.android.gms.mobilesubscription.serviceconfig.CheckAuthStatusResponse;
import com.google.android.gms.mobilesubscription.serviceconfig.UserKey;

/* renamed from: ahan */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahan implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CheckAuthStatusResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        CarrierInfo carrierInfo = null;
        AuthType authType = null;
        AuthStatus authStatus = null;
        UserKey userKey = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 2) {
                carrierInfo = (CarrierInfo) sed.m34998a(parcel, readInt, CarrierInfo.CREATOR);
            } else if (a == 3) {
                authType = (AuthType) sed.m34998a(parcel, readInt, AuthType.CREATOR);
            } else if (a == 4) {
                authStatus = (AuthStatus) sed.m34998a(parcel, readInt, AuthStatus.CREATOR);
            } else if (a == 5) {
                userKey = (UserKey) sed.m34998a(parcel, readInt, UserKey.CREATOR);
            } else if (a != 63) {
                sed.m35002b(parcel, readInt);
            } else {
                bundle = sed.m35022s(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new CheckAuthStatusResponse(str, carrierInfo, authType, authStatus, userKey, bundle);
    }
}
