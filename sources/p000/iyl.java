package p000;

import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.delegate.FinishSessionWorkflowRequest;
import com.google.android.gms.auth.firstparty.shared.AppDescription;

/* renamed from: iyl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iyl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FinishSessionWorkflowRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Bundle bundle = null;
        AppDescription appDescription = null;
        String str = null;
        AccountAuthenticatorResponse accountAuthenticatorResponse = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i = sed.m35010g(parcel, readInt);
            } else if (a == 2) {
                bundle = sed.m35022s(parcel, readInt);
            } else if (a == 3) {
                appDescription = (AppDescription) sed.m34998a(parcel, readInt, AppDescription.CREATOR);
            } else if (a == 4) {
                str = sed.m35020q(parcel, readInt);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                accountAuthenticatorResponse = (AccountAuthenticatorResponse) sed.m34998a(parcel, readInt, AccountAuthenticatorResponse.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new FinishSessionWorkflowRequest(i, bundle, appDescription, str, accountAuthenticatorResponse);
    }
}
