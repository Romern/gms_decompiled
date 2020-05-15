package p000;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.pay.GetSortOrderRequest;
import com.google.android.gms.pay.SortOrderInfo;

/* renamed from: aleg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aleg implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GetSortOrderRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        SortOrderInfo sortOrderInfo = null;
        Account account = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                sortOrderInfo = (SortOrderInfo) sed.m34998a(parcel, readInt, SortOrderInfo.CREATOR);
            } else if (a != 2) {
                sed.m35002b(parcel, readInt);
            } else {
                account = (Account) sed.m34998a(parcel, readInt, Account.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new GetSortOrderRequest(sortOrderInfo, account);
    }
}
