package p000;

import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.delegate.SetupAccountWorkflowRequest;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.ManagedAuthOptions;
import java.util.ArrayList;

/* renamed from: iyp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iyp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SetupAccountWorkflowRequest[i];
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
        String str4 = null;
        String str5 = null;
        ManagedAuthOptions managedAuthOptions = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 2:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 3:
                    z2 = sed.m35006c(parcel2, readInt);
                    break;
                case 4:
                    arrayList = sed.m34992D(parcel2, readInt);
                    break;
                case 5:
                    bundle = sed.m35022s(parcel2, readInt);
                    break;
                case 6:
                    appDescription = (AppDescription) sed.m34998a(parcel2, readInt, AppDescription.CREATOR);
                    break;
                case 7:
                    z3 = sed.m35006c(parcel2, readInt);
                    break;
                case 8:
                    str3 = sed.m35020q(parcel2, readInt);
                    break;
                case 9:
                    accountAuthenticatorResponse = (AccountAuthenticatorResponse) sed.m34998a(parcel2, readInt, AccountAuthenticatorResponse.CREATOR);
                    break;
                case 10:
                    z4 = sed.m35006c(parcel2, readInt);
                    break;
                case 11:
                    z5 = sed.m35006c(parcel2, readInt);
                    break;
                case 12:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 13:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 14:
                    str4 = sed.m35020q(parcel2, readInt);
                    break;
                case 15:
                    str5 = sed.m35020q(parcel2, readInt);
                    break;
                case 16:
                    z6 = sed.m35006c(parcel2, readInt);
                    break;
                case 17:
                    z7 = sed.m35006c(parcel2, readInt);
                    break;
                case 18:
                    z8 = sed.m35006c(parcel2, readInt);
                    break;
                case 19:
                    z9 = sed.m35006c(parcel2, readInt);
                    break;
                case 20:
                    managedAuthOptions = (ManagedAuthOptions) sed.m34998a(parcel2, readInt, ManagedAuthOptions.CREATOR);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new SetupAccountWorkflowRequest(i, z, z2, arrayList, bundle, appDescription, z3, str3, accountAuthenticatorResponse, z4, z5, str, str2, str4, str5, z6, z7, z8, z9, managedAuthOptions);
    }
}
