package p000;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.delegate.UpdateCredentialsWorkflowRequest;
import com.google.android.gms.auth.firstparty.shared.AppDescription;

/* renamed from: iys */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iys implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new UpdateCredentialsWorkflowRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Bundle bundle = new Bundle();
        String str = null;
        AppDescription appDescription = null;
        Account account = null;
        AccountAuthenticatorResponse accountAuthenticatorResponse = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 2:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 3:
                    appDescription = (AppDescription) sed.m34998a(parcel, readInt, AppDescription.CREATOR);
                    break;
                case 4:
                    bundle = sed.m35022s(parcel, readInt);
                    break;
                case 5:
                    account = (Account) sed.m34998a(parcel, readInt, Account.CREATOR);
                    break;
                case 6:
                    accountAuthenticatorResponse = (AccountAuthenticatorResponse) sed.m34998a(parcel, readInt, AccountAuthenticatorResponse.CREATOR);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new UpdateCredentialsWorkflowRequest(i, str, appDescription, bundle, account, accountAuthenticatorResponse);
    }
}
