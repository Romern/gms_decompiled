package p000;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* renamed from: hve */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hve implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new InternalSignInCredentialWrapper[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Account account = null;
        SignInCredential signInCredential = null;
        ArrayList arrayList = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                account = (Account) sed.m34998a(parcel, readInt, Account.CREATOR);
            } else if (a == 2) {
                signInCredential = (SignInCredential) sed.m34998a(parcel, readInt, SignInCredential.CREATOR);
            } else if (a == 3) {
                arrayList = sed.m35005c(parcel, readInt, Scope.CREATOR);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                z = sed.m35006c(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new InternalSignInCredentialWrapper(account, signInCredential, arrayList, z);
    }
}
