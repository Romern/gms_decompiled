package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;

/* renamed from: ick */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ick implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SignInAccount[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = "";
        GoogleSignInAccount googleSignInAccount = null;
        String str2 = str;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 4) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 7) {
                googleSignInAccount = (GoogleSignInAccount) sed.m34998a(parcel, readInt, GoogleSignInAccount.CREATOR);
            } else if (a != 8) {
                sed.m35002b(parcel, readInt);
            } else {
                str2 = sed.m35020q(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new SignInAccount(str, googleSignInAccount, str2);
    }
}
