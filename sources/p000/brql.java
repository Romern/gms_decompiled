package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.api.model.GetAccountInfoResponse;
import com.google.firebase.auth.api.model.GetAccountInfoUserList;

/* renamed from: brql */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brql implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GetAccountInfoResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        GetAccountInfoUserList getAccountInfoUserList = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (sed.m34995a(readInt) != 2) {
                sed.m35002b(parcel, readInt);
            } else {
                getAccountInfoUserList = (GetAccountInfoUserList) sed.m34998a(parcel, readInt, GetAccountInfoUserList.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new GetAccountInfoResponse(getAccountInfoUserList);
    }
}
