package p000;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.delegate.TokenWorkflowRequest;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.auth.firstparty.shared.PACLConfig;

/* renamed from: iyr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iyr implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new TokenWorkflowRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        Bundle bundle = new Bundle();
        String str = null;
        String str2 = null;
        FACLConfig fACLConfig = null;
        PACLConfig pACLConfig = null;
        AppDescription appDescription = null;
        Account account = null;
        AccountAuthenticatorResponse accountAuthenticatorResponse = null;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 2:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 3:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 4:
                    bundle = sed.m35022s(parcel2, readInt);
                    break;
                case 5:
                    fACLConfig = (FACLConfig) sed.m34998a(parcel2, readInt, FACLConfig.CREATOR);
                    break;
                case 6:
                    pACLConfig = (PACLConfig) sed.m34998a(parcel2, readInt, PACLConfig.CREATOR);
                    break;
                case 7:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 8:
                    appDescription = (AppDescription) sed.m34998a(parcel2, readInt, AppDescription.CREATOR);
                    break;
                case 9:
                    account = (Account) sed.m34998a(parcel2, readInt, Account.CREATOR);
                    break;
                case 10:
                    accountAuthenticatorResponse = (AccountAuthenticatorResponse) sed.m34998a(parcel2, readInt, AccountAuthenticatorResponse.CREATOR);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new TokenWorkflowRequest(i, str, str2, bundle, fACLConfig, pACLConfig, z, appDescription, account, accountAuthenticatorResponse);
    }
}
