package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tapandpay.issuer.CreatePushTokenizeSessionRequest;
import com.google.android.gms.tapandpay.issuer.UserAddress;

/* renamed from: aszd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aszd implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CreatePushTokenizeSessionRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        UserAddress userAddress = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                userAddress = (UserAddress) sed.m34998a(parcel, readInt, UserAddress.CREATOR);
            } else if (a == 2) {
                str = sed.m35020q(parcel, readInt);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                str2 = sed.m35020q(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new CreatePushTokenizeSessionRequest(userAddress, str, str2);
    }
}
