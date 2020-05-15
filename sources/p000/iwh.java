package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.dataservice.AccountSignInRequest;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;

/* renamed from: iwh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iwh implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AccountSignInRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        AppDescription appDescription = null;
        CaptchaSolution captchaSolution = null;
        AccountCredentials accountCredentials = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 2:
                    appDescription = (AppDescription) sed.m34998a(parcel, readInt, AppDescription.CREATOR);
                    break;
                case 3:
                    z = sed.m35006c(parcel, readInt);
                    break;
                case 4:
                    z2 = sed.m35006c(parcel, readInt);
                    break;
                case 5:
                    captchaSolution = (CaptchaSolution) sed.m34998a(parcel, readInt, CaptchaSolution.CREATOR);
                    break;
                case 6:
                    accountCredentials = (AccountCredentials) sed.m34998a(parcel, readInt, AccountCredentials.CREATOR);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new AccountSignInRequest(i, appDescription, z, z2, captchaSolution, accountCredentials);
    }
}
