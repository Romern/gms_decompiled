package p000;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.pay.ClearSmartTapOverrideRequest;

/* renamed from: alcv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alcv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ClearSmartTapOverrideRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Account account = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (sed.m34995a(readInt) != 1) {
                sed.m35002b(parcel, readInt);
            } else {
                account = (Account) sed.m34998a(parcel, readInt, Account.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new ClearSmartTapOverrideRequest(account);
    }
}
