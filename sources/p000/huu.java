package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.CompleteSignInResult;
import com.google.android.gms.auth.api.identity.SignInCredential;

/* renamed from: huu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class huu implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CompleteSignInResult[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        SignInCredential signInCredential = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (sed.m34995a(readInt) != 1) {
                sed.m35002b(parcel, readInt);
            } else {
                signInCredential = (SignInCredential) sed.m34998a(parcel, readInt, SignInCredential.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new CompleteSignInResult(signInCredential);
    }
}
