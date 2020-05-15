package p000;

import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.delegate.StartAddAccountSessionWorkflowRequest;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import java.util.ArrayList;

/* renamed from: iyq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iyq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new StartAddAccountSessionWorkflowRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        Bundle bundle = new Bundle();
        String str = "null";
        String str2 = str;
        ArrayList arrayList = null;
        AppDescription appDescription = null;
        String str3 = null;
        AccountAuthenticatorResponse accountAuthenticatorResponse = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 2:
                    arrayList = sed.m34992D(parcel2, readInt);
                    break;
                case 3:
                    bundle = sed.m35022s(parcel2, readInt);
                    break;
                case 4:
                    appDescription = (AppDescription) sed.m34998a(parcel2, readInt, AppDescription.CREATOR);
                    break;
                case 5:
                    str3 = sed.m35020q(parcel2, readInt);
                    break;
                case 6:
                    accountAuthenticatorResponse = (AccountAuthenticatorResponse) sed.m34998a(parcel2, readInt, AccountAuthenticatorResponse.CREATOR);
                    break;
                case 7:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 8:
                    z2 = sed.m35006c(parcel2, readInt);
                    break;
                case 9:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 10:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new StartAddAccountSessionWorkflowRequest(i, arrayList, bundle, appDescription, str3, accountAuthenticatorResponse, z, z2, str, str2);
    }
}
