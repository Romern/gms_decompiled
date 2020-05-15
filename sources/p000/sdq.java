package p000;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.ResolveAccountRequest;

/* renamed from: sdq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sdq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ResolveAccountRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i = sed.m35010g(parcel, readInt);
            } else if (a == 2) {
                account = (Account) sed.m34998a(parcel, readInt, Account.CREATOR);
            } else if (a == 3) {
                i2 = sed.m35010g(parcel, readInt);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                googleSignInAccount = (GoogleSignInAccount) sed.m34998a(parcel, readInt, GoogleSignInAccount.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new ResolveAccountRequest(i, account, i2, googleSignInAccount);
    }
}
