package p000;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* renamed from: ici */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ici implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        Account account = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 2:
                    arrayList2 = sed.m35005c(parcel, readInt, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) sed.m34998a(parcel, readInt, Account.CREATOR);
                    break;
                case 4:
                    z = sed.m35006c(parcel, readInt);
                    break;
                case 5:
                    z2 = sed.m35006c(parcel, readInt);
                    break;
                case 6:
                    z3 = sed.m35006c(parcel, readInt);
                    break;
                case 7:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 8:
                    str2 = sed.m35020q(parcel, readInt);
                    break;
                case 9:
                    arrayList = sed.m35005c(parcel, readInt, GoogleSignInOptionsExtensionParcelable.CREATOR);
                    break;
                case 10:
                    str3 = sed.m35020q(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new GoogleSignInOptions(i, arrayList2, account, z, z2, z3, str, str2, GoogleSignInOptions.m6416a(arrayList), str3);
    }
}
