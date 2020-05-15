package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.GetActiveAccountResponse;

/* renamed from: asnn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asnn implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GetActiveAccountResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        AccountInfo accountInfo = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (sed.m34995a(readInt) != 2) {
                sed.m35002b(parcel, readInt);
            } else {
                accountInfo = (AccountInfo) sed.m34998a(parcel, readInt, AccountInfo.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new GetActiveAccountResponse(accountInfo);
    }
}
