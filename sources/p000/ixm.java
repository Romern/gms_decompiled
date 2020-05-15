package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.dataservice.GoogleAccountSetupRequest;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;

/* renamed from: ixm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ixm implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GoogleAccountSetupRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        Bundle bundle = new Bundle();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        AppDescription appDescription = null;
        AccountCredentials accountCredentials = null;
        CaptchaSolution captchaSolution = null;
        String str6 = null;
        String str7 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 2:
                    bundle = sed.m35022s(parcel2, readInt);
                    break;
                case 3:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 4:
                    z2 = sed.m35006c(parcel2, readInt);
                    break;
                case 5:
                    z3 = sed.m35006c(parcel2, readInt);
                    break;
                case 6:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 7:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 8:
                    str3 = sed.m35020q(parcel2, readInt);
                    break;
                case 9:
                    str4 = sed.m35020q(parcel2, readInt);
                    break;
                case 10:
                    z4 = sed.m35006c(parcel2, readInt);
                    break;
                case 11:
                    z5 = sed.m35006c(parcel2, readInt);
                    break;
                case 12:
                    z6 = sed.m35006c(parcel2, readInt);
                    break;
                case 13:
                    str5 = sed.m35020q(parcel2, readInt);
                    break;
                case 14:
                    appDescription = (AppDescription) sed.m34998a(parcel2, readInt, AppDescription.CREATOR);
                    break;
                case 15:
                    accountCredentials = (AccountCredentials) sed.m34998a(parcel2, readInt, AccountCredentials.CREATOR);
                    break;
                case 16:
                    captchaSolution = (CaptchaSolution) sed.m34998a(parcel2, readInt, CaptchaSolution.CREATOR);
                    break;
                case 17:
                    str6 = sed.m35020q(parcel2, readInt);
                    break;
                case 18:
                    str7 = sed.m35020q(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new GoogleAccountSetupRequest(i, bundle, z, z2, z3, str, str2, str3, str4, z4, z5, z6, str5, appDescription, accountCredentials, captchaSolution, str6, str7);
    }
}
