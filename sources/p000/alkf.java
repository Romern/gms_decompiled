package p000;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.payse.SecureElementStoredValue;
import com.google.android.gms.payse.internal.ExecuteSdkOperationRequest;

/* renamed from: alkf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alkf implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ExecuteSdkOperationRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Account account = null;
        SecureElementStoredValue secureElementStoredValue = null;
        String str = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                account = (Account) sed.m34998a(parcel, readInt, Account.CREATOR);
            } else if (a == 2) {
                i = sed.m35010g(parcel, readInt);
            } else if (a == 3) {
                secureElementStoredValue = (SecureElementStoredValue) sed.m34998a(parcel, readInt, SecureElementStoredValue.CREATOR);
            } else if (a == 4) {
                str = sed.m35020q(parcel, readInt);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                j = sed.m35012i(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new ExecuteSdkOperationRequest(account, i, secureElementStoredValue, str, j);
    }
}
