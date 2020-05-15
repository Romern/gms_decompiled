package p000;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* renamed from: huq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class huq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AuthorizationRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        ArrayList arrayList = null;
        String str = null;
        Account account = null;
        String str2 = null;
        String str3 = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    arrayList = sed.m35005c(parcel, readInt, Scope.CREATOR);
                    break;
                case 2:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 3:
                    z = sed.m35006c(parcel, readInt);
                    break;
                case 4:
                    z2 = sed.m35006c(parcel, readInt);
                    break;
                case 5:
                    account = (Account) sed.m34998a(parcel, readInt, Account.CREATOR);
                    break;
                case 6:
                    str2 = sed.m35020q(parcel, readInt);
                    break;
                case 7:
                    str3 = sed.m35020q(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new AuthorizationRequest(arrayList, str, z, z2, account, str2, str3);
    }
}
