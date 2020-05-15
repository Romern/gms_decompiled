package p000;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.dataservice.AccountNameCheckRequest;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;

/* renamed from: iwd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iwd implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AccountNameCheckRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        AppDescription appDescription = null;
        CaptchaSolution captchaSolution = null;
        Account account = null;
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
                    str2 = sed.m35020q(parcel, readInt);
                    break;
                case 4:
                    str3 = sed.m35020q(parcel, readInt);
                    break;
                case 5:
                    appDescription = (AppDescription) sed.m34998a(parcel, readInt, AppDescription.CREATOR);
                    break;
                case 6:
                    captchaSolution = (CaptchaSolution) sed.m34998a(parcel, readInt, CaptchaSolution.CREATOR);
                    break;
                case 7:
                    account = (Account) sed.m34998a(parcel, readInt, Account.CREATOR);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new AccountNameCheckRequest(i, str, str2, str3, appDescription, captchaSolution, account);
    }
}
